package dataType;

public class NumberMethods {
	public static void main(String[] args) {
		int num = -1024;
		
		//반올림
		System.out.println(Math.round(1024.56)); // 1025 
		
		//절대값(음수 > 양수 변환)
		System.out.println(Math.abs(num)); // 1024
		
		// 최대값, 최소값
		System.out.println(Math.max(1024, num)); // 1024
		System.out.println(Math.min(1024, num)); // -1024
		
		// 실수가 갖을 수 있는 정수값
		System.out.println(Math.ceil(1024.16)); // 1025.0 천장값
		System.out.println(Math.floor(1024.56)); // 1024.0 바닥값
		System.out.println(Math.floor(-1024.56)); // -1025.0
		
		// 제곱
		System.out.println(Math.pow(2, 10)); // 2^10 = 1024.0
		
		// 루트
		System.out.println(Math.sqrt(144)); // 12.0
		
		// 랜덤
		// 0.xxxx ~ 0.8xxx 까지의 값을 반환
		// 보통 랜덤함수 사용이유 > 정수형 난수를 뽑아내기 위해
		// 랜덤하수는 기본형이 Double형이기에 (int)로 정수화 시켜야 한다
		// 1부터 값을 뽑고 싶다면 랜덤함수는 0부터 나와서 +1을 꼭 시켜준다
		// *수 만큼 개수가 출력된다.
		System.out.println(Math.random()); // 0~1 사이의 실수
		System.out.println((int)(Math.floor(Math.random()*45) +1)); // 1 ~ 45 랜덤 정수
		System.out.println((int)(Math.random()*10) +1); // 1 ~ 10까지 랜덤 정수
	
		// 로그 > 어떤 특정한 수를 1로 만들기 위해 필요한 나누기 횟수
		// 웹 분야에서는 사용빈도가 매우 낮음 > 데이터분석 분야에서는 자주 사용
		System.out.println(Math.log(1024.56));
		System.out.println(Math.log10(1024.56));
		System.out.println(Math.log1p(1024.56));
	}
}
