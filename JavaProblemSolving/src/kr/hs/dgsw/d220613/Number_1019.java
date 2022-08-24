package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1019 {
	// CodeUp 연월일 입력받아 그대로 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] arr = a.split("\\.");
		int A = Integer.valueOf(arr[0]); // String 값을 숫자로 변경해서 넣기
		int B = Integer.valueOf(arr[1]); // 원시 데이터가 필요할 땐 Integer.parseInt();
		int C = Integer.valueOf(arr[2]); // 객체가 필요할 땐 Integer.valueOf();
		
		System.out.printf("%04d.%02d.%02d", A, B, C);
	}
}
