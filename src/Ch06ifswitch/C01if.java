package Ch06ifswitch;

import java.util.Scanner;

public class C01if {

	public static void main(String[] args) {
		//단순 IF
		//if(조건식)
		//{
		//		참일 경우 실행되는 문장
		//}
//		int age = 7;
//		
//		if(age >= 8)
//		{
//			System.out.println("취학 아동입니다.");
//		}
//		System.out.println("첫번째 IF문 벗어남");
//		if(age  < 8)
//		{
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("두번째 IF문 벗어남");
//		System.out.println("프로그램을 종료합니다.");

		
		//if(조건식)
		//{
		//	참일 경우 실행될 코드
		//}
		//else
		//{
		//	거짓인 경우 실행될 코드
		//}
		
//		int age = 7;
//		
//		if(age >= 8)
//		{
//			System.out.println("취학 아동입니다.");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("프로그램을 종료합니다.");

		//문제
		//정수 하나를 받아서 짝수면 '짝수입니다
		//홀수면 "홀수입니다"를 출력하세요
//		int num = sc.nextInt();
//		if(num%2==0)
//		{
//			System.out.println("짝수입니다.");
//		}
//		else
//		{
//			System.out.println("홀수입니다.");
//		}
		
		//문제
		//정수 하나를 받아서 3의배수면 "3의 배수입니다."
		//4의 배수면 "4의 배수입니다"를 출력하세요\
//		int num1 = sc.nextInt();
//		
//		if(num1%3 == 0)
//		{
//			System.out.println("3의 배수입니다.");
//		}
//		if(num1%4 == 0)
//		{
//			System.out.println("4의 배수입니다.");
//		}
		//문제
		//두 정수를 입력받아서 큰수를 출력하세요(IF-ELSE)
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//
//		if(n1 > n2)
//		{
//			System.out.println(n1);
//		}
//		else
//		{
//			System.out.println(n2);
//		}
//		
//		//3의 배수이면서 4의 배수라면 출력
//		//3의배수가 아니면서 5의 배수라면 출력
//		int number = sc.nextInt();
//		if(number%4 == 0 && number%3 == 0)
//		{
//			System.out.println(number);
//		}
//		if(number%3 != 0 && number%5 == 0)
//		{
//			System.out.println(number);
//		}
////--------------------------------------------
//		if(number%4 == 0)
//		{
//			if(number%3 == 0)
//			{
//				System.out.println(number);				
//			}
//		}
//		
//		if(number%3 != 0)
//		{
//			if(number%5 == 0)
//			{
//				System.out.println(number);		
//			}
//		}
		
		//예제
		//국어, 영어, 수학 각각의 점수가 40점이상이 되어야하고
		//총평균이 60점이상이 되면 "합격" 출력
		//그게 아니면 "불합격" 처리
		
		//국어가 이하인가?
//		int kr = sc.nextInt();
//		int eng = sc.nextInt();
//		int math = sc.nextInt();
//		
//		if(kr >= 40 && eng >= 40 && math >= 40)
//		{
//			if(kr+eng+math/3 >= 60)
//			{
//				System.out.println("합격");
//			}
//			else
//			{
//				System.out.print("불합격");
//			}
//		}
//		else
//		{
//			System.out.println("불합격");
//		}
		
		//평균점수를 입력받아 그 점수가
		//90점 이상이면 'A' 출력
		//80점 이상이면 'B' 출력
		//70점 이상이면 'C' 출력
		//60점 이상이면 'D' 출력
		//50점 이상이면 'F' 출력
//		int avg = (kr + eng + math)/3;
//		
//		if(avg >= 90)
//		{
//			System.out.println("A");
//		}
//		else if(avg >= 80)
//		{
//			System.out.println("B");
//		}
//		else if(avg >= 70)
//		{
//			System.out.println("C");
//		}
//		else if(avg >= 60)
//		{
//			System.out.println("D");
//		}
//		else
//		{
//			System.out.println("F");
//		}
		//문제(강사와 같이 합니다)
		//세 정수를 입력받아서 큰수를 출력하세요(단순 IF문)		
		Scanner sc = new Scanner(System.in);
		System.out.print("세 정수 입력 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 >= n2 && n1 >= n3)
		{
			System.out.println("큰수 : " + n1);
		}
		else if(n2 >= n3 && n2 >= n1)
		{
			System.out.println("큰수 : " + n2);			
		}
		else
		{
			System.out.println("큰수 : " + n3);			
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}