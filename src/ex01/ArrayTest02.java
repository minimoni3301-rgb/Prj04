package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int [] sales = new int [] {
			100, 80, 90, 110	
		};
		
		int sum = 0;
		/*
		sum  += sales[0]; //sum = sum + sales[0];
		sum  += sales[1];
		sum  += sales[2];
		sum  += sales[3];
		*/
		
		for (int i = 0; i < sales.length; i++) {
			sum += sales[i];
		}
		
		System.out.println(sum);
		
	
		
		
	}

}
