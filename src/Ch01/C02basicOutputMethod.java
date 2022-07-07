package Ch01;

public class C02basicOutputMethod {

	public static void main(String[] args) {
		//System.out : 표준 출력 스트림 (해석 : 표준출력장치(모니터)에 데이텨 전달) 
		
		//System.out.print() : 콘솔화면에 내용 출력
		//윈도우 운영체재, 출력함수 중 print
		//Escape(탈출함, 벗어남)문자 사용을 통한 개행(줄바꿈)
		// : 기존의 문자용도를 벗어나 특정한 기능 수행에 사용되는 특수문자
		// \n : 줄바굼(개행)
		// \b : 한문자 삭제
		// \t : 8칸 커서 이동
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HELLO WORLD\n");
//		System.out.print("   *\n");
//		System.out.print("  ***\n");
//		System.out.print(" *****\n");
//		System.out.print("*******\n");
		
		//System.out.printf()
		//f : format = 형식, 서식
		//서식 : 서류를 꾸미는 일정한 양식
		
		//%d : 10진 정수 서식문자
		//%f : 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자열 서식문자
		
//		System.out.printf("%d\n", 10);
//		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
//		System.out.printf("%c %c %c\n", 'A', 'B', 'C');
//		System.out.printf("%s %s %s \n", "This is ", "String", "Test");
//		System.out.printf("%d.%s : %d \n", 1, "성적", 100);
//		System.out.printf("%f + %f = %f\n", 10.23, 20.75, 10.23+20.75);
		
		//문제
//		System.out.printf("나의 이름은 %s 입니다.\n", "이윤경");
//		System.out.printf("나의 나이는 %d 입니다.\n", 20);
//		System.out.printf("나의 성별은 %c 입니다.\n", '여');
		
		//서식문자 정렬/자리수지정
		//%10d : 10칸 확보후 오른쪽정렬
		//%-10d : 10칸 확보후 왼쪽정렬
//		System.out.printf("%-10d%d\n", 1234, 5678);
//		System.out.printf("%.3f\n", 10.123456);

		
		//주의!
//		System.out.print("I say \"Hello?\"");
		
		//System.out.println()
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");		
		System.out.println("Hello World");
		
		//문제
		System.out.printf("No\t이름\t나이\t주소\n");
		System.out.printf("1\t홍길동\t20\t대구\n");
		System.out.printf("2\t남길동\t30\t서울\n");
		System.out.printf("3\t서길동\t40\t울산\n");
		System.out.printf("4\t동길동\t50\t김해\n");
		
		System.out.printf("Code\t\tTitle\t\tPublisher\t\tprice\n");
		System.out.printf("1010\t\tDoItJava\t00미디어\t\t\t29000\n");
		System.out.printf("2020\t\t윤성우C\t\t오렌지미디어\t\t25000\n");
		
		System.out.print("   *\n");
		System.out.print("  ***\n");
		System.out.print(" *****\n");
		System.out.print("*******\n");
		System.out.print(" *****\n");
		System.out.print("  ***\n");
		System.out.print("   *\n");
		
	}

}
