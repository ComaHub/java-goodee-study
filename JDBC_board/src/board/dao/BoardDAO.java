package board.dao;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import board.dto.Board;

/**
 * 데이터 접근 객체
 * 데이터베이스에 접근하는 로직들을 작성
 * 여기서는 게시글 데이터에 접근
 */
public class BoardDAO extends JDBConnection {
	// JDBConnection을 상속받은 BoardDAO 객체를 생성할 때 상위 클래스 객체도 생성되면서 자연스럽게 DB에 연결됨
	
	/**
	 * 게시글 목록
	 * @return
	 */
	public List<Board> list() {
		// 게시글 목록을 담을 Collection 객체 생성
		List<Board> boardList = new ArrayList<Board>();
		
		// SQL 작성
		String sql = "SELECT * FROM board";
		
		try {
			// 1. SQL Query 실행 객체 생성 - Statement(stmt)
			stmt = conn.createStatement();
			
			// 2. SQL 실행 요청 -> 반환된 결과 ResultSet(rs)
			rs = stmt.executeQuery(sql);
			
			// 3. 조회된 결과를 List(boardList)에 추가
			while (rs.next()) { // 조회된 결과의 다음 행으로 이동
				Board board = new Board();
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명"): 해당 컬럼의 데이터 반환
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getObject("reg_date", LocalDateTime.class));
				// board.setRegDate(rs.getTimestamp("reg_date").toLocalDateTime()); 이 방식보단 위 방식이 더 깔끔
				board.setUpdDate(rs.getObject("upd_date", LocalDateTime.class));
				
				// 게시글 목록에 추가
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글 목록 조회: 예외 발생");
			e.printStackTrace(); 
		}
		
		// 4. 게시글 목록 반환
		return boardList;
	}
	
	/**
	 * 게시글 조회
	 * @param no
	 * @return
	 */
	public Board select(int no) {
		// 게시글 정보를 담을 객체 생성
		Board board = new Board();
		
		// SQL 작성
		String sql = "SELECT * FROM board WHERE no = ?"; // no가 ?인 데이터만 조회
		
		// 조회 프로세스: SQL 실행 객체 생성 -> SQL 실행 요청 -> 조회 결과 -> 반환
		try {
			// 1. SQL 쿼리 실행 객체 생성 - PreparedStatement(psmt)
			psmt = conn.prepareStatement(sql);
			
			// no 매개변수의 값을 ? 파라미터에 동적으로 바인딩
			psmt.setInt(1, no); // 첫번째 ?에 no를 넣음
			
			// 2. SQL 실행 요청 -> 반환
			rs = psmt.executeQuery();
			
			// 3. 조회된 결과 1건 가져오기
			if (rs.next()) {
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getObject("reg_date", LocalDateTime.class));
				board.setUpdDate(rs.getObject("upd_date", LocalDateTime.class));
			} else {
				// 조회된 게시글이 존재하지 않는 경우
				System.out.println("해당 번호의 게시글이 없습니다.");
				return null;
			}
		} catch (SQLException e) {
			System.out.println("특정 게시글 조회: 예외 발생");
			e.printStackTrace(); 
		}
		
		// 4. 게시글 1건 반환
		return board;
	}
	
	/**
	 * 게시글 등록
	 * @param board
	 * @return
	 */
	public int insert(Board board) {
		int result = 0; // DB에 적용된 데이터 개수 (반환값)
		
		String sql = "INSERT INTO board (title, writer, content) VALUE (?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			
			result = psmt.executeUpdate();
			// executeUpdate()
			// SQL(INSERT, UPDATE, DELETE) 실행 시 적용된 데이터 개수를 int로 반환
			// 예) 게시글 1개 적용 시
			// 성공: result = 1 / 실패: result = 0
		} catch (SQLException e) {
			System.out.println("게시글 등록: 예외 발생");
			e.printStackTrace(); 
		}
		
		return result;
	}
	
	public int update(Board board) {
		int result = 0;
		String sql = "UPDATE board SET title = ?, writer = ?, content = ? WHERE no = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			psmt.setInt(4, board.getNo());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("게시글 수정: 예외 발생");
			e.printStackTrace(); 
		}
		
		return result;
	}
	
	public int delete(int no) {
		int result = 0;
		String sql = "DELETE FROM board WHERE no = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, no);
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("게시글 삭제: 예외 발생");
			e.printStackTrace(); 
		}
		
		return result;
	}
}
