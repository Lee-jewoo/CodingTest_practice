package bronze;

import java.util.Scanner;

public class B3_2480 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String [] num = scan.nextLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);
        int max = 0;
        if (a>b && a>c) {
        	max = a;
        } else if (b>a && b>c) {
        	max = b;
        } else if (c>a && c>b) {
        	max = c;
        }
        
        if (a==b && b==c) {
        	System.out.println(10000+(a*1000));
        } else if (a==b && b!=c) {
        	System.out.println(1000+(a*100));
        } else if (a!=b && b==c) {
        	System.out.println(1000+(b*100));
        } else if (a!=b && a==c) {
        	System.out.println(1000+(a*100));
        } else {
        	System.out.println(max*100);
        }
		scan.close();

	}

}
