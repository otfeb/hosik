package day0616;

public class OperTest_07 {

	public static void main(String[] args) {

		// 기본자료형 8개
		// 1. 논리형 true, false
			boolean b = false;
			
		// 2. 문자형
			char ch = 'A';
			// 기본적으로는 정수형
			
		// 3. 정수형
			byte a = -128; 	// 1byte -128 ~ 127
			short s = 32000; //16bit
			int c; 			// 32bit
			long num=100L; // 64bit
			
		// 4. 실수형
			double d = 42356.14526;
			float f = 3.1234568f;

			// int, float 똑같이 32bit이지만 기본적으로 실수형이 더 큰타입
			
			System.out.println("bool=" + b);
			System.out.println("not bool=" +!b);
			System.out.println("ch= " + (ch+1));
			System.out.println("ch= " + (char)(ch+1));
			
			//전체자리수 10자리 소수점 2자리
			System.out.printf("d=%010.2f\n",d);
			
			//소수점 1자리
			System.out.printf("d=%.1f",d);
			
	}

}