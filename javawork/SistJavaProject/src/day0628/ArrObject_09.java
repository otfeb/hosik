package day0628;

class Student{
	private String sname;
	private String hp;
	private int grade;
	
	// 명시적 생성자
	public Student(String name, String hp, int grade) {
		this.sname=name;
		this.hp=hp;
		this.grade=grade;
	}
	
	// 맴버값 출력데이터
	public void getData() {
		System.out.println("이름: "+sname);
		System.out.println("연락처: "+hp);
		System.out.println("학년: "+grade);
	}
	
}
////////////////////////
public class ArrObject_09 {

	public static void main(String[] args) {

		Student[] stu = new Student[3];
		
		stu[0] = new Student("이민규", "010-222-5555", 3);
		stu[1] = new Student("최진평", "010-111-2222", 2);
		stu[2] = new Student("진현규", "010-444-7777", 4);
		
		for(int i=0;i<stu.length;i++) {
			stu[i].getData();
			System.out.println("============================");
		}
		

	}

}
