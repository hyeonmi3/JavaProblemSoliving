package kr.hs.dgsw.d220824;

import java.util.Iterator;
import java.util.Scanner;

public class Step1_10 {
	// 3003
	// BaekJoon 1�ܰ� 10��
	public static void main(String[] args) {
		// �Է�
		Scanner sc = new Scanner(System.in);
		
		// �迭 ����
		int[] cnt = new int[6];
		
		// ���� �迭 ����
		int[] full = new int[] { 1, 1, 2, 2, 2, 8 };
		
		// �Է� ����
		for (int i = 0; i < 6; i++) {
			cnt[i] = sc.nextInt();
		}

		// ��
		for (int i = 0; i < full.length; i++) {
			cnt[i] = full[i] - cnt[i];
			
			// ���
			System.out.printf("%d ",cnt[i]);
		}
	}
}
