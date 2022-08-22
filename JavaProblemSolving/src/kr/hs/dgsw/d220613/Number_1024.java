package kr.hs.dgsw.d220613;

import java.util.Scanner;

public class Number_1024 {
	// 단어 1개 입력받아 나누어 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m = sc.next();
		int len = m.length();

		for (int i = 0; i < len; i++) {
			System.out.printf("\'%c\'\n", m.charAt(i));
		}
	} // charAt은 ‘안녕하세요’를 입력했다쳤을때
	// String을 char로 바꿔서 ‘안’을 charAt(0)에 저장! 같은 느낌
}
