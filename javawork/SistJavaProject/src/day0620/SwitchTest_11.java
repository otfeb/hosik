package day0620;

import java.util.Scanner;

public class SwitchTest_11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("숫자입력");
		num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("숫자 1입니다");
			break;
		case 2:
			System.out.println("숫자 2입니다");
			break;
		case 3:
			System.out.println("숫자 3입니다");
			break;
		default :
			System.out.println("숫자 1,2,3이 아닙니다");
			break;
		}
		
		switch(num%2) {
		case 0:
			System.out.println(num+"은 짝수입니다");
			break;
		case 1:
			System.out.println(num+"은 홀수입니다");
			break;
		}
	}

}
