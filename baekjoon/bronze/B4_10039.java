package bronze;

import java.util.Scanner;

public class B4_10039 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] score = new int [5];
		int sum = 0;
		for (int i=0; i<score.length; i++) {
			score[i] = scan.nextInt();
			if (score[i]<40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		scan.close();
		System.out.println(sum/score.length);

	}

}
