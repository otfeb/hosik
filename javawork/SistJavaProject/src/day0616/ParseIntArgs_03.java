package day0616;

public class ParseIntArgs_03 {

	public static void main(String[] args) {

		System.out.println("[결과출력]");
		System.out.println("내 이름은 " + args[0]);
		System.out.println("자바점수는 " + args[1]);
		System.out.println("오라클점수는 " + args[2]);

		System.out.println("두과목의 합계는 " + (Integer.parseInt(args[1])+Integer.parseInt(args[2])) + " 입니다");
		
	}
	
}
