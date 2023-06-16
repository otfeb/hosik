package day0616;

import java.util.Calendar;

public class MyAge_12 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		String name = args[0];
		int myb = Integer.parseInt(args[1]);
		int age = cal.get(cal.YEAR)-myb;
		
		System.out.println("이름: "+name);
		System.out.println("태어난 연도: "+myb+"년도");
		System.out.println("나이: "+age+"세");
		

	}

}
