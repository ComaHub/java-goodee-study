-- 게시판 프로젝트 DB 생성 --
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board(
	no INT AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  writer VARCHAR(100) NOT NULL,
  content TEXT,
  reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  -- DATE 타입을 쓰려면 reg_date DATE NOT NULL DEFAULT CURRENT_DAWT
	upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  -- ON UDATE CURRENT_TIMESTAMP: UPDATE시 자동으로 수정 시간도 갱신
  
  PRIMARY KEY (no)
);

DESC board;

-- 추가
INSERT INTO board (title, writer, content)
VALUE
	('오늘의 날씨', '날씨빌런', '쪄죽을 것 같다'),
  ('점심 추천좀', '하마', '제육덮밥은 어제 먹었음');

-- 조회
SELECT * FROM board;
SELECT * FROM board
WHERE no = 1;

-- 수정
UPDATE board
SET
	title = '여기는 ㅇㅅㅇ 없어서 좋다',
  writer = '어그로',
  content = "ㅇㅅㅇ",
  upd_date = now() -- 수정 시간을 현재 시간으로 갱신
WHERE no = 1;

-- 삭제
DELETE FROM board
WHERE no = 1;

-- 댓글 테이블
CREATE TABLE comment (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  board_no INTEGER NOT NULL,
  commenter VARCHAR(50),
  comment TEXT,
  reg_date DATETIME DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (board_no) REFERENCES board(no) ON DELETE CASCADE
  -- ON DELETE CASCADE: 외래키(FK)에 설정하는 옵션으로
  -- 부모 테이블의 행이 삭제될 때, 해당 행을 참조하는 자식 테이블의 행들도 자동으로 삭제
  -- 예: board의 특정 게시글이 삭제되면 그 게시글에 달린 comment들도 자동으로 삭제
);