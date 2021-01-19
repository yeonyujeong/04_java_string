package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_내정답 {		// 2020.12.31  1:18 - 1:28

	public static void main(String[] args) {
	Scanner scan =  new Scanner (System.in)	;
	Random ran = new Random();
	
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		
		String temp = "a";
		int i = 0;
		
		while(i < 100) {
			int rNum = ran.nextInt(3) + 1;
			temp = words[0];
			words[0] = words[rNum];
			words[rNum] = temp;
			i++;
		}
		
		int cnt = 0;
		while(true) {
			System.out.println("문제 : " + words[cnt]);
			System.out.print("입력 : ");
			String answer = scan.next();
			
			if(words[cnt].equals(answer)) {
				cnt++;
			}
			
			if(cnt == 4) {
				System.out.println("정답! 게임종료");
				break;
			}
			
		}
		
		
		
		
	}

}
