package bronze;

import java.util.Scanner;

public class B5_11382 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String [] num = scan.nextLine().split(" ");
        long a = Long.parseLong(num[0]);
        long b = Long.parseLong(num[1]);
        long c = Long.parseLong(num[2]);
		System.out.println(a+b+c);
		scan.close();

	}

}
