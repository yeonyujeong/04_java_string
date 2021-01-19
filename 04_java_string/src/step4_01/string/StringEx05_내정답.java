package step4_01.string;


public class StringEx05_내정답 {		// 2020.12.31		12:23 - 12:31

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 32세
		
		String year = jumin.substring(0,2);
		int age = Integer.parseInt(year);
		
		age += 1900;
		age = 2020 - age + 1;
		
		System.out.println("나이" + age + "세");
		
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성

		String gender = jumin.substring(7,8);
		if(gender.equals("1")) {
			System.out.println("남성");
		}
		else if(gender.equals("2")) {
			System.out.println("여성");
		}
		
		
		
	}

}
