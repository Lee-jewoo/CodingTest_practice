package bronze;

import java.util.Scanner;

public class B2_1009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i=0; i<T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int result = 1;
			for (int j=0; j<b; j++) {
				if (a%10==0) {
					result = 10;
				} else {
					result = result*a%10;
				}
			}
			System.out.println(result);
		}
		scan.close();

	}

}
