package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		// 문제1
		// ArrayList방식
		ArrayList<Integer> arr = new ArrayList<>();
		int num01;
		while(true) {
			double ran = Math.random();
			num01 = (int)(ran*6+1);
			arr.add(num01);
			for (int i=0; i<arr.size()-1; i++) {
				if(arr.get(i)==num01) {
					arr.remove(i);
				}
			}
			if(arr.size()==6) { break; }
		}
		System.out.println(arr);
		
		// HashSet방식
		HashSet<Integer> hs = new HashSet<>();
		int num02;
		while(true) {
			double ran = Math.random();
			num02 = (int)(ran*6+1);
			boolean bool = hs.add(num02);
			if (!bool) {
				hs.remove(num02);
			}
			if (hs.size()==6) { break; }
		}
		System.out.println(hs);
		
		// HashMap방식
		HashMap<Integer, Integer> hm = new HashMap<>();
		int num03, index=0, count=0;
		while(true) {
			double ran = Math.random();
			num03 = (int)(ran*6+1);
			hm.put(index, num03);
			
			if(hm.size()==6) { break; }
		}
		System.out.println(hm);
	}
}
