package day0621;

public class DoWhile_06 {

	public static void main(String[] args) {

		int i=1;
		
		System.out.println("while문 결과");
		
		while(i>5) {
			System.out.println(i++);
		}
		
		System.out.println("do~while문 결과");
		
		i=1;
		
		do {
			System.out.println(i++);
		}while(i>5);

	}

}
