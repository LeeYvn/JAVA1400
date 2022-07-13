package Ch04Scanner;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 :");
		int num = sc.nextInt();
		System.out.println("확인 :" + num);
		System.out.print("문자열 :");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("확인 :" + str);
		
		sc.close();
		
		//nextLine을 사용할 때 주의할점
		//nextLine만 사용하는게 아니라
		//nextInt(), nextDouble(), next()함수와
		//혼용해서 사용하는 경우
		//중간에 nextLine()한번더 실행하여 혼동하지않게 함.
	}

}
