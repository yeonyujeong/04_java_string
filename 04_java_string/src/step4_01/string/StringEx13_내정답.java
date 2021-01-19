package step4_01.string;

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_내정답 {		// 2021.1.4		12:44 - 12:52

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};

		
		int maxIdx = -1;
		int cnt = 0;
		String temp = "";
		while(true) {
			
			for (int i = 0; i < names.length; i++) {
				int compare = names[cnt].compareTo(names[i]);
				if(compare < 0 ) {
					maxIdx = i;
					
					temp = names[cnt];
					names[cnt] = names[maxIdx];
					names[maxIdx] = temp;
				}
			}
			cnt++;
		
			if(cnt == 5) {
				break;
			}
		
	}
		
		System.out.println(Arrays.toString(names));
		
		

}
}