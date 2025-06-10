package homework.homework02;

public class Run {
	public static void main(String[] args) {
		Practice practice = new Practice();
		
		String target1 = "D:/test/sub/나비야1.dat";
		System.out.println("나비야1: " + practice.method1(target1));
		
		String target2 = "D:/test/sub/나비야2.dat";
		System.out.println("나비야2: " + practice.method2(target2));
	}
}
