package array;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 문제 - 로그인
		Scanner sc = new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputId=null, inputPwd=null;
		int num,index=0, count=0;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 특정회원 보기");
			System.out.println("4. 특정회원 비밀번호 수정");
			System.out.println("5. 특정회원 삭제");
			System.out.println("6. 모든 회원 보기");
			System.out.println("7. 나가기");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						if(inputPwd.equals(pwd[index])) {
							System.out.println("인증통과");
						}
						else {
							System.out.println("비밀번호 틀림");
						} break;
					}
				}
				if(index==id.length) {
					System.out.println("존재하지않는 아이디입니다");
					System.out.println("회원가입부터 진행하세요");
				}
				System.out.println("로그인");
			}
			else if(num==2) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				for(index=0; index<count; index++) {
					if(inputId.equals(id[index])) {
						System.out.println("동일한 아이디입니다");
					}
					if(count==5) {
						System.out.println("저장공간 부족");
						break;
					}
				}
				if(index==count) {
					id[count] = inputId;
					pwd[count] = inputPwd;
					count++;
					System.out.println("가입을 축하드립니다");
				}
				System.out.println("회원가입");
			}
			else if(num==3) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						System.out.println("아이디 : "+id[index]);
						System.out.println("비밀번호 : " + pwd[index]);
					}
				}
				System.out.println("특정회원보기");
			}
			else if(num==4) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						System.out.print("수정할 비밀번호 입력 : ");
						inputPwd = sc.next();
						pwd[index] = inputPwd;
						System.out.println("비밀번호 수정완료");
					}
				}
				System.out.println("특정회원 비밀번호 수정");
			}
			else if(num==5) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				for(index=0; index<id.length; index++) {
					if(inputId.equals(id[index])) {
						id[index] = null;
						pwd[index] = null;
						System.out.println("회원삭제완료");
					}
				}
				System.out.println("특정회원 삭제");
			}
			else if(num==6) {
				for(index=0; index<id.length; index++) {
					System.out.println((index+1)+". 아이디 : "+id[index]);
					System.out.println("   비밀번호 : "+pwd[index]);
				}
				System.out.println("모든 회원 보기");
			}
			else if(num==7) { System.out.println("나가기"); break; }
			else { System.out.println("다시선택"); }
		}
	}
	
}
