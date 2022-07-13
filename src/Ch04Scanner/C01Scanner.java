package Ch04Scanner;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		//System.out = System이 관리하는 출력장치(ex.모니터)
		//System.in : System이 관리하는 입력장치로 스트립형성
		//스트림 : 데이터의 가상이동 통로(채널) System.in 명령어
		//ex. 키보드 > OS장치 사이의 통로를 만듦
		//System.out : APP > 표준출력장치 방향으로 스트림 형성
		//System.in : 표준입력장치 > APP장치 스트림형성
		
		//new Scanner(System.in)
		//->표준입력스트림을 Scanner객체에 연결
		//->scanner객체는 다양한 형태의 값을 스트림으로부터 받아올수있는
		//->기능을 가지는 단위
		
		//Scanner sc = new Scanner(System.in);
		//->생성된 Scanner객체의 위치값을 sc참조변수에 담아
		//->제어함
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 :");
		int num1 = sc.nextInt();
		//sc스캐너객체의 정수값하나를 받아 num1공간에 초기화
		System.out.println("두번째 :");
		int num2 = sc.nextInt();
		System.out.println("세번째 :");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("SUM : " + sum);
		
		sc.close();

	}

}
 