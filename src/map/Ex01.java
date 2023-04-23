package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 메뉴등록
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<>();
		String inputMenu = null;
		int num, price, index=0;
		while(true) {
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.print("등록할 메뉴이름 : ");
				inputMenu = sc.next();
				System.out.print(inputMenu+"의 가격 : ");
				price = sc.nextInt();
				boolean bool = menu.containsKey(inputMenu);
				if(bool) {
					System.out.println("중복되는 메뉴입니다");
				} else {
					menu.put(inputMenu, price);
					System.out.println("등록되었습니다");
				}
				System.out.println("메뉴등록");
			}
			else if(num==2) {
				Iterator<String> menuIt = menu.keySet().iterator();
				if(!menuIt.hasNext()) {
					System.out.println("먼저 메뉴등록해주세요");
				} else {
					while(true) {
						for(index=0;menuIt.hasNext();) {
							String key = menuIt.next();
							System.out.println((index+1)+"."+key+" : "+menu.get(key)+"원");
							index++;
						}
						System.out.println("1.수정 2.삭제 3.나가기");
						num = sc.nextInt();
						if(num==1) {
							System.out.print("수정할 가격의 메뉴이름 : ");
							inputMenu = sc.next();
							if (menu.get(inputMenu)==null) {
								System.out.println("없는 메뉴입니다");
							} else {
								System.out.print("수정할 가격 : ");
								price = sc.nextInt();
								menu.put(inputMenu, price);
								System.out.println("수정완료");
							}
							System.out.println("수정");
						}
						else if(num==2) {
							System.out.print("삭제할 메뉴이름 : ");
							inputMenu = sc.next();
							if (menu.get(inputMenu)==null) {
								System.out.println("없는 메뉴입니다.");
							} else {
								menu.remove(inputMenu);
								System.out.println("삭제완료");
							}
							System.out.println("삭제");
						}
						else if(num==3) { System.out.println("나가기"); break; }
						else { System.out.println("다시선택"); }
					}
				}
				System.out.println("메뉴별 가격보기");
			}
			else if(num==3) { System.out.println("종료"); break; }
			else { System.out.println("다시선택"); }
			
		}
	}
}
