package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */

public class StringEx14_내정답 {		//2021.1.4		12:55 - 12:56

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();

		if(name.equals(myName)) {
			System.out.println("일치");
		}
		else {
			System.out.println("불일치");
		}
		
		
		scan.close();
	}

}
