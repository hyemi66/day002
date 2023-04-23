package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 문제 연락처저장
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String inputNa=null, inputPh=null;
		int num, index=0;
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.print("이름 : ");
				inputNa = sc.next();
				System.out.print("전화번호 : ");
				inputPh = sc.next();
				boolean bool01 = name.contains(inputNa);
				boolean bool02 = phone.contains(inputPh);
				if (bool01 || bool02) {
					System.out.println("중복");
				} else {
					name.add(inputNa);
					phone.add(inputPh);
					System.out.println("등록완료");
				}
				System.out.println("연락처등록");
			}
			else if(num==2) {
				System.out.print("이름 : ");
				inputNa = sc.next();
				boolean bool03 = name.contains(inputNa);
				if (!bool03) {
					System.out.println("목록에 없습니다");
				} else {
					index = name.indexOf(inputNa);
					System.out.println("이름 : "+name.get(index));
					System.out.println("연락처 : "+phone.get(index));
				}
				System.out.println("연락처보기");
			}
			else if(num==3) {
				System.out.print("이름 : ");
				inputNa = sc.next();
				boolean bool04 = name.contains(inputNa);
				if (!bool04) {
					System.out.println("목록에 없습니다");
				} else {
					index = name.indexOf(inputNa);
					name.remove(index);
					phone.remove(index);
					System.out.println("삭제완료");
				}
				System.out.println("연락처삭제");
			}
			else if(num==4) {
				for(index=0; index<name.size(); index++) {
					System.out.println((index+1)+".이름 : "+name.get(index));
					System.out.println(" .전화번호 : "+phone.get(index));
				}
				System.out.println("모든연락처보기");
			}
			else if(num==5) { System.out.println("종료"); break; }
			else { System.out.println("다시 선택"); }
		}
	}
}
