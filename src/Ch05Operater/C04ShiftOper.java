package Ch05Operater;

public class C04ShiftOper {

	public static void main(String[] args) {
		
		int num1 = 15;			//00000000 00000000 00000000 00001111
		int num2 = 20;			//00000000 00000000 00000000 00010100
		int num3 = num1<<3;		//00000 00000000 00000000 00000000000
		int num4 = num1>>2;		//000000 00000000 00000000 0000000000
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4); 
		
		
	}

}
