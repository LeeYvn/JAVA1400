package Ch04Scanner;

import java.util.Scanner;

//import 단축키
//ctrl+shift+o : 모든경로
//ctrl+shift+m : 단일경로

public class C02Scanner {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 각각 받아
		// 국영수 총점/평균을 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 :");
		int kor = sc.nextInt();
		System.out.println("영어 :");
		int eng = sc.nextInt();
		System.out.println("수학 :");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		
		double avg = (double)sum/3;
		
		System.out.printf("총점 : %d 평균 : %.2f", sum, avg);
		
		sc.close();
	}

}
