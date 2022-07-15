package Ch07While;

public class C02Whilewhile {

	public static void main(String[] args) {
		
		//전체 구구단출력(2~9단)
//		int dan = 2;
//		int i = 1;
//		while(dan<=9)
//		{
//			i = 1;
//			while(i <= 9) 
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//전체 구구단출력(역순)
//		int dan_2 = 2;
//		int i_2 = 9;
//		while(dan_2<=9)
//		{
//			i_2 = 9;
//			while(i_2 >= 1) 
//			{
//				System.out.printf("%d x %d = %d\n", dan_2, i_2, dan_2*i_2);
//				i_2--;
//			}
//			System.out.println();
//			dan_2++;
//		}
		
		//전체 구구단출력(역순2)
//		int dan_3 = 9;
//		int i_3 = 9;
//		while(dan_3>=1)
//		{
//			i_3 = 9;
//			while(i_3 >= 1) 
//			{
//				System.out.printf("%d x %d = %d\n", dan_3, i_3, dan_3*i_3);
//				i_3--;
//			}
//			System.out.println();
//			dan_3--;
//		}
		
		//별찍기
		
		//*****
		//*****
		//*****
		//*****
		int cnt = 0;
		while(true)
		{
			System.out.println("*****");
			cnt++;
			if(cnt == 4)
			{
				break;
			}
		}
		
		//*
		//**
		//***
		//****
		int i_2 = 0;
		int j_2 = 0;
		String star = "*";
		while(i_2 < 4)
		{
			while(j_2 < 4)
			{
				System.out.printf("*");
				j_2++;
			}
			System.out.println("");
			i_2++;
		}
		//****
		//***
		//**
		//*

		//   *
		//  ***
		// *****
		//*******

	}
}

