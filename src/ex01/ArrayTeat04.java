package ex01;

public class ArrayTeat04 {

	public static void main(String[] args) {
		String [] bts = {"RM", "제이홉", "정국", "지민", "진", "슈가", "뷔"
	};   //= String [] bts = new String[] {};
	
	helloBts( bts );	// 빈칸에 bts를 넣음으로써 위에 정보를 밑에 넘겨준다. 
		
	
	
	}

	private static void helloBts(String[] bts) {

		for (int i = 0; i < bts.length; i++) {
			System.out.println(bts[i]);
		}
		
	}		

}


