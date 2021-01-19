package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료 

*/
public class StringEx18_내정답 {	//2021.1.4		2:35 - 

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size];  // 힌트 체크를 통해서 확인할수있다.
		int cnt = 0;
		
		
		while (true) {
			
			int checkCnt = 0;

			for (int i = 0; i < check.length; i++) {
				if(check[i] == -1) {
					checkCnt++;
				} 
				
			}
			if(checkCnt == size) {
				System.out.println("답 : " + word);
				break;
			}
	
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");	
				for (int i = 0; i < size; i++) {
					if(check[i] != -1) {
						System.out.print("*");
					}
					else {
						System.out.print(word.charAt(i));
					}
				}
				
				
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			
			if(me.equals(word)) {
				score = 100 - cnt*5;
				System.out.println("정답!");
				System.out.println("점수 : " + score + "점");
				break;
			}
			
			else {
				cnt++;
				char rWord = ' '; 
				while(true) {
					int rNum = ran.nextInt(size);
					if(check[rNum] != -1) {
						check[rNum] = -1;
						rWord = word.charAt(rNum);			
						for (int i = 0; i < size; i++) {
							if(word.charAt(i) == rWord) {
								check[i] = -1;
							}
						}
						break;
					}
						
				}	
				
					
		
				}	
			
		}
		
		scan.close();

		} 

	}


