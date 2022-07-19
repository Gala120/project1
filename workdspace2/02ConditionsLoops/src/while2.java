
public class while2 {
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		while (i < 5) {
			sum += i;
			System.out.println(i + "=>" + sum);
			i++;
		}
		
		int j = i;
		int sum2 = 0;
		do {
			sum2 += j;
			System.out.println(j + "=>" + sum);
			j++;
		} while(j < 10);
	}
}
