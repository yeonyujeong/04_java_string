package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_내정답2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		
		int size = text.length();
		char[] arr = new char[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = text.charAt(i);
		}
		
		boolean isCorrect = false;
		
		
		int idx = -1;
		for (int i = 0; i < size - word.length() + 1; i++) {
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if(text.charAt(i+j) == word.charAt(j)) {
					cnt++;
				}
			}			
			 if (cnt == word.length()){
				idx = i;
				isCorrect = true;
			}
		}
		
		
		String front = "";
		String back = "";
		for (int i = 0; i < idx; i++) {
			front += text.charAt(i);
		}
		for (int i =  idx+word.length(); i < size; i++) {
			back += text.charAt(i);
		}
		
		if(isCorrect) {
			System.out.println("추가할 단어를 입력하세요 :");
			String insert = scan.next();
			
			String result = front + insert + back;
			System.out.println(result);	
			
		}
		else {
		System.out.println("해당하는 단어가 없습니다.");
		}
		
		
		
		scan.close();
		
	}

}
