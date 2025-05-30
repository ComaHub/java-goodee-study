package homework.homework01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
	private List<Book> booklist = new ArrayList<Book>();
	
	public BookController() {
		booklist.add(new Book("느리게 나이드는 습관", "정희원", "인문", 16200));
		booklist.add(new Book("코스모스", "칼 세이건", "자연과학", 17910));
		booklist.add(new Book("나에게 들려주는 예쁜 말", "김종원", "어린이", 15610));
		booklist.add(new Book("혼자 공부하는 자바", "신용권", "기타", 25240));
	}
	
	public void insertBook(Book bk) {
		booklist.add(bk);
	}
	
	public List<Book> selectList() {
		return booklist;
	}
	
	public List<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for (Book book : booklist) {
			if (book.getTitle().contains(keyword)) {
				searchList.add(book);
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		for (Book book : booklist) {
			if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				removeBook = book;
				booklist.remove(book);
				break;
			}
		}
		
		return removeBook;
	}
	
	public int ascBook() {
		Collections.sort(booklist);
		return 1;
	}
}
