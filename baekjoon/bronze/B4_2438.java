package bronze;

import java.util.Scanner;

public class B4_2438 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=1; i<=n; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}