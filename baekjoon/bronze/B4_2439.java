package bronze;

import java.util.Scanner;

public class B4_2439 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=n; i>0; i--) {
			for (int j=1; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
