package bronze;

import java.util.Scanner;

public class B3_2884 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String [] num = scan.nextLine().split(" ");
        int H = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        if (M>=45) {
        	System.out.println(H + " " + (M-45));
        } 	else if (H==0 && M<45) {
        	System.out.println((H+23) + " " + (M+15));
        }	else if (M<45) {
        	System.out.println((H-1) + " " + (M+15));
        }
		scan.close();

	}

}
