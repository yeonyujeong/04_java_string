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

public class StringEx14_내정답2 {		//2020.1.4   1:06 - 1:10

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();

		int cnt = 0;
		
		if(name.length() != myName.length()) {
			System.out.println("불일치");
		}
		else {
			for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i) == myName.charAt(i)) {
					cnt++;
				}
			}
			
			if(cnt == name.length()) {
				System.out.println("일치");
			}
			else {
				System.out.println("불일치");
			}
		}
		
		scan.close();
	}

}
