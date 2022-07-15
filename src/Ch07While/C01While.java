package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//기본
		//	1 탈출용 변수 지정
		//	2 탈출용 조건식
 		//	3 조건식이 false가 되도록 하는 연산식
		
//		int i = 0; //1 탈출용 변수
//		while(i <= 10) //2 탈출용 조건식
//		{
//			System.out.println("Hello world!");
//			i++; //3 조건식이 거짓이 되기 위한 연산식
//		}
		
		//02 1부터 10까지 합 구하기
//		int i = 1;
//		int sum = 0;
//		while(i <= 10)
//		{
//			System.out.println("i = "+i);
//			sum = sum + i; 
//			i++;
//		}
//		System.out.println("while 벗어남 i = " + i);
//		System.out.println("합계 : " + sum);

//		int num = sc.nextInt();
//		int sumvalue = 0;
//		int i = 1;
//		while(i <= num)
//		{
//			System.out.println("i = " + i);
//			sumvalue = sumvalue + i; 
//			i++;
//		}
//		System.out.println("합계 : " + sumvalue);
//		sc.nextLine();
		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(num1 > num2)
//		{
//			int swit;
//			swit = num1;
//			num2 = swit;
//		}
//		int sumvalue2 = 0;
//		
//		while(num1 <= num2)
//		{
//			System.out.println("초기값 = " + num1);
//			sumvalue2 = sumvalue2 + num1; 
//			num1++;
//		}
//		System.out.println("합계 : " + sumvalue2);
//
//		sc.close();
		
		//2단 구구단
//		int i = 1;
//		while(i <= 9)
//		{
//			System.out.printf("%d x %d = %d\n", 2, i, 2*i);
//			i++;
//		}
//		//2단 역순
//		int number = sc.nextInt();
//		while(number >= 1)
//		{
//			System.out.printf("%d x %d = %d\n", 2, number, 2*number);
//			number--;
//		}
		
		//1부터 N까지 수중에
		//3의 배수의 합만 구하세요
		System.out.print("숫자 입력 : ");
		int num_1 = sc.nextInt();
		int i = 1;
		int sum_1 = 0;
		while(i <= num_1)
		{
			if(i%3 == 0)
			{
				sum_1 = sum_1 + i;
			}
			i++;
		}
		System.out.printf("3의 배수의 합은 : %d", sum_1);
		
		sc.close();
	}
}



















