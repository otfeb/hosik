package day0616;

public class DataType_08 {

	public static void main(String[] args) {

		byte a = 127;
		byte b = (byte)128;  // 강제 타입 변환(값손실: 디모션)
		
		System.out.println("a="+a);
		System.out.println("b="+b);

		int x = 7;
		int y = 4;
		
		System.out.println(x/y);  // 정수형끼리의 계산결과는 무조건 정수타입
		System.out.println(x/(double)y);
		
		double d = 100.0;
		int i = 100;
		
		int result = (int) d + i ;
		double result2 = d+i;
		
		System.out.println("d="+d);
		System.out.println("i="+i);
		System.out.println("result="+result);
		System.out.println("result2="+result2);
	}

}
