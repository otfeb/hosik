package day0616;

public class DataType_09 {

	public static void main(String[] args) {
		
		// 묵시적 형변환: 자동결정되는 타입
		// String + int = String
		// double + int = double
		// 더 큰 타입으로 변환

		char a = 'a';
		
		System.out.println(a);
		System.out.println(a+2);
		System.out.println((char)(a+2));
		
		System.out.println("Happy"+5);
		System.out.println("Happy"+(5+6));
		System.out.println('A'+3); // 아스키 코드값 65+3=68
		System.out.println(2+'b');
	}

}