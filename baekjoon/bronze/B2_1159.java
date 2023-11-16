package bronze;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class B2_1159 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Integer> player = new HashMap<>();
        for (int i=0; i<n; i++) {
        	String initial = scan.next().substring(0, 1);
        	if (player.containsKey(initial)) {
        		int num = player.get(initial);
        		num ++;
        		player.put(initial, num);
        	} else {
        		player.put(initial, 1);        		
        	}
        }
        
        String entry = "";
        Set<String> keys = player.keySet();
        for (String initial : keys) {
			if (player.get(initial) >= 5) {
				entry += initial;
			}
		}
        
        if (entry.equals("")) {
        	System.out.println("PREDAJA");
        } else {
        	System.out.println(entry);
        }
        
		scan.close();

	}

}
