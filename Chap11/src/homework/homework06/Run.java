package homework.homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] sentenceArr = sentence.split(" ");
		
		System.out.print("단어를 입력하세요: ");
		String inputWord = scanner.nextLine();
		
		if (sentence.indexOf(inputWord) == -1) {
			System.out.println("존재하지 않는 단어입니다.");
			return;
		}
		
		int indexWord = 0;
		for (int i = 0; i < sentenceArr.length; i++) {
			if (sentenceArr[i].equals(inputWord)) {
				indexWord = i;
				break;
			}
		}
		
		System.out.println((sentenceArr.length - 1) == indexWord ? "마지막 단어입니다." : sentenceArr[indexWord] + " 다음 단어: " + sentenceArr[indexWord + 1]);
	}
}
