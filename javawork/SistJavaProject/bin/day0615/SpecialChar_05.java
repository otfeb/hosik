package day0615;

public class SpecialChar_05 {

	public static void main(String[] args) {

		//문자열 내에서 특별한 의미로 해석되는 문자를 이스케이프 시퀀스(Escape Sequence)
		//이스케이프 시퀀스(Escape Sequence)는 모두 \로 시작
		
 
//		\t : 다음 탭위치로 이동
//		\n : 줄바꿈
//		\" : 쌍따옴표
//		\' : 홑따옴표
//		\\ : 백슬래시 기능
		
		System.out.println("Apple\tMellon");
		System.out.println("Orange\tKiwi\tBanana");
		System.out.println("Apple\\");
		System.out.println("Apple\"");
		System.out.println("Apple\'");
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
		
		System.out.println("\"red\",\"green\",\"blue\"");
	}

}