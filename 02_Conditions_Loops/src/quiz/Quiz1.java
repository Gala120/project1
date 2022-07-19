package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// Q1. for문을 활용하여 x의 y승을 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값을 입력하시오 > ");
		int x = sc.nextInt(); // 2
		System.out.println("y의 값을 입력하시오 > ");
		int y = sc.nextInt(); // 2
		int result = 1;
		
		for (int i = 0; i < y; i++) { // 0 1 
			// result = result * x
			//   1         1     2
			//   2    =    1     2
			//   4    =    1   * 2
			//   8
			result *= x; // result(1) = 1*2 > result(2) = 2*2
		}
		
		System.out.println(result);
	}

}
