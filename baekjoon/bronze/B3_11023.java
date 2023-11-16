package bronze;

import java.util.Scanner;

public class B3_11023 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String [] s = scan.nextLine().split(" ");
        int sum = 0;
        for (int i=0; i<s.length; i++) {
        	sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
        
		scan.close();

	}

}
