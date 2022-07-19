import java.util.Scanner;

public class forex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단을 입력하세요!");
		int dan = sc.nextInt(); 
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + "x" + i + " = " + (dan * i));
		}
		System.out.println("다음 시간에 만나요!");
	}
}
