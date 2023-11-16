package bronze;

import java.util.Scanner;

public class B3_1085 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        int wx = Math.abs(w-x);
        int hy = Math.abs(h-y);
        int [] num = {x, y, w, h, wx, hy};
        for (int i=0; i<num.length; i++) {
        	if (min>num[i]) {
        		min = num[i];
        	}
        }
        System.out.println(min);
        
		scan.close();

	}

}
