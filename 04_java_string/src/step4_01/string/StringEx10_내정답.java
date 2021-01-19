package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_내정답 {		//2020.12.31		1:31 - 1:36

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	
		String start = "자전거";
		
		while(true) {
			System.out.println("제시어 : " + start);
			System.out.print("입력   : ");
			String word = scan.next();
			
			if(word.equals("quit")) {
				System.out.println();
				System.out.println(" - 종료 - ");
				break;
			}
			
			String checkStart = start.substring(start.length() - 1);
			String checkWord = word.substring(0 , 1);
			
			if(checkStart == checkWord) {
				start = word;
			}
		}
		scan.close();
	}

}
