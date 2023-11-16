package bronze;

import java.util.Scanner;

public class B3_2525 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String [] num = scan.nextLine().split(" ");
        int A = Integer.parseInt(num[0]);
        int B = Integer.parseInt(num[1]);
        int C = scan.nextInt();
        if (B+C<60) {
        	System.out.println(A + " " + (B+C));
        } 	else if (A+(B+C)/60 >= 24 && B+C>=60) {
        	A += (B+C)/60-24;
        	B = (B+C)%60;
        	System.out.println(A + " " + B);
        }	else if (B+C>=60) {
        	A += (B+C)/60;
        	B = (B+C)%60;
        	System.out.println(A + " " + B);
        }	
		scan.close();

	}

}
