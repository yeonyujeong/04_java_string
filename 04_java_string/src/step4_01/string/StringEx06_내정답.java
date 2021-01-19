package step4_01.string;



//# 문자열 1차원

public class StringEx06_내정답 {		// 2020.12.31   12:31 - 12:50

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		
		String[] score = str.split("/");
		
		for (int i = 0; i < score.length; i++) {
			arr[i] = Integer.parseInt(score[i]);
		}
		
		int tot = 0;
		
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		
		System.out.println("총점 : " + tot + "점");
		
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		String[] temp = new String[3];
		
		for (int i = 0; i < scores.length; i++) {
			temp[i] = Integer.toString(scores[i]);
		}
		
		text = temp[0] + "/" + temp[1] + "/" + temp[2];
		
		System.out.println(text);
		


	}

}
