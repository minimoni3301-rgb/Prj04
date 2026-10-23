package ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArrayTest03 {

	public static void main(String[] args) {

		
		// ⭕ 현재 날짜와 시간을 불러와서 변수에 저장합니다.
        LocalDateTime now = LocalDateTime.now(); 
		System.out.println("현재 날짜와 시간:" +  now);
		
		
		String yoil = getyoil(); // 함수(메소드) 호출하는 방법, 
		System.out.println("요일 한자:" +  yoil );
	
	}

	private static String getyoil() {
		String [] y = new String[] {
				"月","火","水","木","金","土","日"
		};
		LocalDate now = LocalDate.now(); //오늘날짜를 가지고와
		int wk = now.getDayOfWeek().getValue(); //오늘날짜 중에서 요일(getDayOfWeek)를 가지고오고 그걸 숫자로 가지고와 (1(월) ~ 7(일) 
		String yoil = y[ wk -1]; //요일 계산 
		return yoil + "曜日";  // 계산 값 + "요일" 붙여서 'getyoil'에 올려
		
	}

}
