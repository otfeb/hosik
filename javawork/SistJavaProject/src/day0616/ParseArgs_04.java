package day0616;

public class ParseArgs_04 {

	public static void main(String[] args) {

		String name = args[0];
		String su = args[1];
		String pay = args[2];
		int total = Integer.parseInt(su) * Integer.parseInt(pay);
		
		System.out.println("[상품정보]");
		System.out.println("상품명: " + name);
		System.out.println("수량: " + su + "개");
		System.out.println("단가: " + pay + "원");
		System.out.println("총금액: " + total + "원");

	}

}
