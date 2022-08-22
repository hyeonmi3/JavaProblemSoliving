package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1027 {
	// 년월일 입력 받아 형식 바꿔 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ymd = sc.next();
		String[] dmy = ymd.split("\\.");
		
		System.out.printf("%02d-%02d-%04d", Integer.parseInt(dmy[2]), Integer.parseInt(dmy[1]), Integer.parseInt(dmy[0]));
	}
}
