package day0627;

public class InfoMain_08 {

	public static void main(String[] args) {

		Info_08 in1 = new Info_08("윤호석", 27, "서울시 강서구");
		
		// getMethod 변수지정
		String name = in1.getStuName();
		int age = in1.getAge();
		String addr = in1.getAddr();
		
		System.out.println("이름은 "+name+"이고 나이는 "+age+"세 이며 주소는 "+addr+"입니다");
		
		Info_08 in2 = new Info_08("김영", 22, "서울시 은평구");
		System.out.println("이름은 "+in2.getStuName()+"이고 나이는 "+in2.age+"세 이며 주소는 "+in2.addr+"입니다");
		
		
		// 디폴트 생성자로 생성
		Info_08 in3 = new Info_08();
		in3.stuName = "손석구";
		in3.age = 33;
		in3.addr = "서울시";
		System.out.println("이름: "+in3.getStuName()+"\n나이는: "+in3.getAge()+"\n주소: "+in3.getAddr());

	}

}
