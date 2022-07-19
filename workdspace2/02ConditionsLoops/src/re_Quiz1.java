import java.util.Scanner;

// Q1. for문을 활용하여 x의 y승을 구하세요

public class re_Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값을 입력하세요");
		int x = sc.nextInt();
		
		System.out.println("y의 값을 입력하세요");
		int y = sc.nextInt();
		
		int result = 1;
		
		for(int i = 0; i < y; i++) {
			result = result*x;
			// 1 = 1*2 > 2
			// 2 = 1*2 > 4
			// 4 = 1*2 > 8
		}
		System.out.println("입력한 x의 y승 값: "+ result);
	}
}
