package day0623;

public class ArrInt_06 {

	public static void main(String[] args) {

		int[] arr = {5,7,8,9,12,23,56,47};
		int i;
		
		System.out.println("개수: "+arr.length);
		
		System.out.println("출력_1:   1 ==> 5");
		
		for(i=0;i<arr.length;i++) {
			System.out.println((i+1)+"==>"+arr[i]);
		}

		System.out.println("출력_2");
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
