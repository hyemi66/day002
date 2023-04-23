package str;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		// 문제1
		String a = "Have a nice day Have a nice day Have a nice day";
		String[] aa = a.split("");
		ArrayList<String> aaa = new ArrayList<>();
		for(int i=0; i<aa.length; i++) {
			if (aa[i].equals("a")) {
				aaa.add(i+"");
			}
		}
		System.out.println(aaa);
		
		// 문제2
		String b = "It is a fun java programming";
		String[] bb = b.split("");
		int countA=0, countG=0;
		for(int i=0; i<bb.length; i++) {
			if(bb[i].equals("a")) {
				countA++;
			}
			if(bb[i].equals("g")) {
				countG++;
			}
		}
		System.out.println("총 개수 : "+bb.length);
		System.out.println("a 개수 : "+countA);
		System.out.println("g 개수 : "+countG);
		
		// 문제3
		String str = new String("tESt sTring   change   first");
		System.out.println("변경 전 : "+str);
		String changeStr = new String();
		String[] cc = str.split("");
		for(int i=0; i<cc.length; i++) {
			cc[i] = cc[i].toLowerCase();
			if (i==0) { cc[i] = cc[i].toUpperCase(); }
			if (i>0) {
				if (cc[i-1].equals(" ")) {
					cc[i] = cc[i].toUpperCase();
				}
			}
			changeStr += cc[i];
		}
		System.out.println(changeStr);
		
		// 문제4
		String str01 = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		System.out.println("==== 변경 전 str ====");
		System.out.println(str01);
		System.out.println("==== 변경 후 str ====");
		str01 = str01.replace("-", ":");
		str01 = str01.replace("2017", "1999");
		str01 = str01.replace("2015", "1999");
		str01 = str01.replace("2018", "1999");
		System.out.println(str01);
	}
}
