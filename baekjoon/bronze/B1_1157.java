package bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B1_1157 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toUpperCase();
		String [] s = input.split("");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i=0; i<s.length; i++) {
			if (map.containsKey(s[i])) {
				int n = map.get(s[i]);
				n++;
				map.put(s[i], n);
			} else {
				map.put(s[i], 1);				
			}
		}
		int max = Collections.max(map.values());
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> maps : map.entrySet()) {
			if (maps.getValue()==max) {
				list.add(maps.getKey());
			}
		}
		
		String result = null;
		if (list.size()!=1) {
			result = "?";
		} else {
			result = list.get(0);
		}
		System.out.println(result);
		
		scan.close();

	}

}
