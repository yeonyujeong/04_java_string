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


public class StringEx17_내정답 {		// 2021.1.4  1:47 - 2:29

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {
			
			String text = "Life is too short.";
			System.out.println(text);
			
		
			System.out.print("변경하고 싶은 단어를 입력하세요 : ");
			String word = scan.nextLine();
			
			char[] arr = new char[text.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = text.charAt(i);
			}
			
			int wordSize = word.length();
			boolean isTrue = false;
			int checkIdx = -1;
			
			for (int i = 0; i < arr.length - wordSize + 1; i++) {
				int cnt = 0;
				for (int j = 0; j < wordSize; j++) {
					if(arr[i+j] == word.charAt(j)) {
						cnt++;
					}
				}
				if(cnt == wordSize) {
					checkIdx = i;
					isTrue = true;
				}
			}
			if(isTrue) {
				
				System.out.println("변경할 단어를 입력해주세요 : ");
				String changeWord = scan.next();
				int changeSize = changeWord.length();
				
				char[] change = new char[changeSize];
				
				for (int i = 0; i < changeWord.length(); i++) {
					change[i] = changeWord.charAt(i);
				}
				
				char[] arr1 = new char[text.length() - wordSize];
				for (int i = 0; i < checkIdx; i++) {
					arr1[i] = arr[i];
				}
				for (int i = checkIdx + wordSize; i < arr.length; i++) {
					arr1[i-wordSize] =arr[i];
				}
				
				char[] arr2 = new char[arr1.length + changeSize];
				
				for (int i = 0; i < checkIdx; i++) {
					arr2[i] = arr1[i];
				}
				int cnt = 0;
				for (int i = checkIdx; i < checkIdx + changeSize; i++) {
					arr2[i] = change[cnt];
					cnt++;
				}
				for (int i = checkIdx + changeSize; i < arr2.length; i++) {
					arr2[i] = arr1[i-changeSize];
				}
				
				String result = "";
				for (int i = 0; i < arr2.length; i++) {
					result += arr2[i];
				}
				
				System.out.println(result);
				
				break;
				
			}
			else {
				System.out.println("해당하는 단어가 없습니다.");
				continue;
			}
			
			
		
		}
		scan.close();
	}

}
