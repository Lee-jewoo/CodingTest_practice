package bronze;

import java.util.Scanner;

public class B5_1330 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String [] num = scan.nextLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        if (a > b) {
        	System.out.println(">");
        } else if (a < b) {
        	System.out.println("<");
        } else if (a == b) {
        	System.out.println("==");
        }
		scan.close();

	}

}
