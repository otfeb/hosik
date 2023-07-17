package day0628;

class MyInfo{
	
	private String name;
	private int age;
	private String hp;
	public static final String ADDR="Seoul";
	
	// 각각의 setter,getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	// 3개의 맴버를 한번에 변경할 메소드
	public void setData(String name,int age,String hp) {
		
		this.name=name;
		this.age=age;
		this.hp=hp;
		
	}
	
	// 3개의 맴버를 한번에 출력 메소드
	public void getData() {
		System.out.println("이름: "+name+", 나이: "+age+", 핸드폰: "+hp);
	}
	
}

///////////////////////////////
public class ExObject_04 {

	public static void main(String[] args) {

		MyInfo in1 = new MyInfo();
		// setter
		in1.setName("이소용");
		in1.setAge(22);
		in1.setHp("010-111-2222");
		
		// getter
		String name = in1.getName();
		int age = in1.getAge();
		String hp = in1.getHp();
		
		System.out.println("사는 지역: "+MyInfo.ADDR);
		System.out.println("아름: "+name+", 나이: "+age+", 핸드폰: "+hp);
		
		// 생성2
		MyInfo in2 = new MyInfo();
		
		//setData
		System.out.println("사는 지역: "+MyInfo.ADDR);
		in2.setData("이성신", 22, "010-222-4444");
		in2.getData();

	}

}
