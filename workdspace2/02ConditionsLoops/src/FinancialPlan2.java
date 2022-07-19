import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 1. 꼭 구매하고 싶은 것 입력 받기. 예) 아파트, 자동차, 등등...
// 2. 구매할 대상의 가격 입력 받기
// 3. 미래에 수령할 월급 입력받기 => 현실적으로 입력
// 4. 월급의 몇 %를 저축할지? => 현실적으로 입력
// 5. 대상을 구매하기 위해 소요되는 시간 구하기 (월, 년 상관없음)
// 6. 연 이율은 적금을 기준으로 2.5%로 가정

public class FinancialPlan2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구매하고 싶은 차종을 입력하시오."); // 아반떼 cn7
		String wantBuy = scanner.nextLine();

		System.out.println("가격이 얼마 입니까?"); // 2800만원 
		int wantPrice = Integer.parseInt(scanner.nextLine());
		
		System.out.println("미래에 수령할 월급은?"); // 220만원
		int myPay = scanner.nextInt();
		
		System.out.println("월급의 몇 %를 저축하시겠습니까?"); // 10%
		double mySaving = scanner.nextDouble();
		
		int saveMoney = ((int) (myPay/mySaving)); // 22
		
		int yearSavings = ((int) (saveMoney*0.025)*12);
		
		int timeTaken = (int) Math.floor(wantPrice/yearSavings);
		
	//	Date date = new Date();
	//	SimpleDateFormat wasteTime = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("아반떼 cn7을 구매하기 위해 소요되는 시간은 " + timeTaken +"개월 입니다.");
	
	}
}
