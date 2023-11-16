package bronze;

import java.util.Scanner;

public class B5_5597 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        boolean [] num = new boolean [30];
        for (int i=0; i<28; i++) {
        	int n = scan.nextInt();
        	num[n] = true;
        }
        for (int i=0; i<30; i++) {
        	if (num[i]==false) {
        		System.out.println(i+1);
        	}
        }
		scan.close();

	}

}
