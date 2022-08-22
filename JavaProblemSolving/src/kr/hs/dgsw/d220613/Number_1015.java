package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1015 {
	// 실수 입력받아 둘째 자리까지 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		
		System.out.printf("%.2f", n);
	}
}
