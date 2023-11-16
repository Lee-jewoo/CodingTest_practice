package bronze;

import java.util.Scanner;

public class B1_1037 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<N; i++) {
        	int n = scan.nextInt();
        	if (max<n) {
        		max = n;
        	}
        	if (min>n) {
        		min = n;
        	}
        }
        System.out.println(max*min);
        
		scan.close();

	}

}
