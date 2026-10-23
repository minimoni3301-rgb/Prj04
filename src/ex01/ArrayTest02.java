package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int [] sales = new int [] {
			//   0   1    2   3
				100, 80, 90, 110	
		};
		
		int sum = 0;
		int tot = 0;
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
		
		
		
		//2차원 배열 연습 ..! 
		            //전체배열이름 :salesTot
		double [][] salesTot = new double[][] {
			// 1/4  2/4  3/4  4/4
			{100,  101,   90,  80}, // 2022 :0 = salesTot[0] : 해당배열의 이름
			{120,  101,   90, 180}, // 2023 :1 = salesTot[1]
			{100,  130,   190, 280}, // 2024:2 = salesTot[2]
			{100,  103,   290, 80}, // 2025 :3
			{100,  101,   390, 180} // 2026	:4
		};
		System.out.println("연도의 갯수:" + salesTot.length );
		System.out.println("2024년의 매출갯수:" + salesTot[2].length);
		System.out.println(salesTot[3][1]);
		
		
		// 2024년 매출수량의 합?
		//tot += salesTot[2][0]
		//tot += salesTot[2][1]
		//tot += salesTot[2][2]
		//tot += salesTot[2][3]
		
		tot = 0;
		for (int j = 0; j < salesTot[2].length; j++) {
			tot += salesTot[2][j];
			
			
			
		} System.out.println("2024년 총합" + tot);
	}
}

		
