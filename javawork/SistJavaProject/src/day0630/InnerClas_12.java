package day0630;

class Outer{
	
	String name = "이민규";
	int age = 22;
	
	
	class Inner{
		
		// 내부에서는 외부클래스 사용가능
		public void disp() {
			System.out.println("**Inner내부 클래스**");
			System.out.println("이름: "+name+",나이: "+age);
		}
	}
	
	class Inner2{
		
		// 내부에서는 외부클래스 사용가능
		public void disp2() {
			System.out.println("**Inner2내부 클래스**");
			System.out.println("이름: "+name+",나이: "+age);
		}
	}
	
	// 외부의 메소드추가
	public void write() {
		// 외부에서 내부클래스 선언
		Inner in1 = new Inner();
		in1.disp();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}
	
}

/////////////////////////////
public class InnerClas_12 {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.write();
		
		System.out.println("=====================");
		
		System.out.println("다른 클래스 통하지 않고 직접 내부클래스 메소드 호출방법");
		
		Outer.Inner oi2 = outer.new Inner();
		//Outer.Inner oi = new Outer().new Inner();
		oi2.disp();
		
		
	}

}
