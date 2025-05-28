package sec01.exam10;

public class ResourcePathExample {
	public static void main(String[] args) {
		Class classCarData = Car.class;
		
		// Class 객체는 해당 클래스 파일의 경로 정보를 가지고 있음
		String photo1path = classCarData.getResource("photo1.jpg").getPath();
		System.out.println(photo1path);
		
		String photo2path = classCarData.getResource("images/photo2.jpg").getPath();
		System.out.println(photo2path);
	}
}
