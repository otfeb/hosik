package day0616;

public class QuizDataType_10 {

	public static void main(String[] args) {

		int java = Integer.parseInt(args[0]);
		int jsp = Integer.parseInt(args[1]);
		int spring = Integer.parseInt(args[2]);
		int total = java+jsp+spring;
		double av = total/args.length;
		
		System.out.println("[시험결과]");
		System.out.println("Java="+java+","+"Jsp="+jsp+","+"spring="+spring);
		System.out.println("총점: "+total+"점");
		System.out.printf("평균: %.2f점",av);

	}

}