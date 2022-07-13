package Ch04Scanner;

import java.util.Scanner;

public class C05Scanner {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print(name + "님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print(name + "님의 주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		sc.nextLine();
		System.out.println("[PROFILE]");
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age + "세");
		System.out.println("주소 :" + address);
		
		sc.close();
		
	}

}
