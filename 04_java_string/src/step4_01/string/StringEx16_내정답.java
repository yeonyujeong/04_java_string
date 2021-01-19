package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_내정답 {		//2021.1.4		1:19 - 1:46

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		char [] arr = new char[text.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = text.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));
		int wordSize = word.length();
		
		boolean isTrue = false;
	
		
		for (int i = 0; i < arr.length - wordSize +1; i++) {
			int cnt = 0;
			
			for (int j = 0; j < wordSize; j++) {
				if(arr[i+j] == word.charAt(j)) {
					cnt++;
				}
			}
			if(cnt == wordSize) {
				isTrue = true;
			}
		}
		
		if(isTrue) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		}

	

}
