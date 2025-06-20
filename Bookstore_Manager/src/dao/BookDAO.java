package dao;

import java.sql.SQLException;

import model.vo.Book;
import model.vo.Novel;
import model.vo.Poem;

public class BookDAO extends JDBConnection {
	public void insertBook(Book book) {
		String sql = "INSERT INTO book (isbn, type, price) VALUE (?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getIsbn());
			psmt.setString(2, getCategory(book));
			psmt.setInt(3, book.getPrice());
			
			int result = psmt.executeUpdate();
			
			if (result == 1) System.out.println("등록한 도서가 DB에 입력되었습니다.");
			else System.out.println("등록한 도서가 DB에 입력되지 않았습니다.");
			
		} catch (SQLException e) {
			System.out.println("DB 입력 중 예외 발생");
		}
	}
	
	private static String getCategory(Book book) {
		if (book instanceof Novel) return "소설";
		if (book instanceof Poem) return "시";
		
		return null;
	}
}
