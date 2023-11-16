package bronze;

import java.util.Scanner;

public class B2_1152 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String [] t = s.split(" ");
        if (t[0].equals("")) {
        	System.out.println(0);
        } else {
        	System.out.println(t.length);
        }
		scan.close();

	}

}
