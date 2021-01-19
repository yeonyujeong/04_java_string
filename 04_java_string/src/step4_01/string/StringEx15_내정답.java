package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_내정답 {		//2021.1.4		1:00 - 1:04

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();

	    char[] num = { '0', '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' };
		
	    int check = 0;
	    
	    for (int i = 0; i < text.length(); i++) {
	    	for (int j = 0; j < num.length; j++) {
	    		if(text.charAt(i) == num[j]) {
	    			check ++;
	    		}
			}
		}
	    if(check == 0) {
	    	System.out.println("문자만 있다.");
	    }
	    else if(check == text.length()) {
	    	System.out.println("숫자만 있다.");
	    }
	    else {
	    	System.out.println("문자와 숫자가 섞여있다.");
	    }
		
		scan.close();
	}

}
