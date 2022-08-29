package kr.hs.dgsw.d220824;

import java.util.Iterator;
import java.util.Scanner;

public class Step1_10 {
	// 3003
	// BaekJoon 1단계 10번
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		// 배열 만듦
		int[] cnt = new int[6];
		
		// 비교할 배열 만듦
		int[] full = new int[] { 1, 1, 2, 2, 2, 8 };
		
		// 입력 받음
		for (int i = 0; i < 6; i++) {
			cnt[i] = sc.nextInt();
		}

		// 비교
		for (int i = 0; i < full.length; i++) {
			cnt[i] = full[i] - cnt[i];
			
			// 출력
			System.out.printf("%d ",cnt[i]);
		}
	}
}
