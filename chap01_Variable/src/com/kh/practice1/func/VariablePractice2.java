package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int inum3 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int inum4 = sc.nextInt();
		//System.out.println(inum1-inum2);
		System.out.print("더하기 결과: ");
		System.out.println(inum3+inum4);
		System.out.print("빼기 결과: ");
		System.out.println(inum3-inum4);
		System.out.print("곱하기 결과: ");
		System.out.println(inum3*inum4);
		System.out.print("나누기 결과: ");
		System.out.println(inum3/inum4);
		System.out.print("나머지 결과: ");
		System.out.println(inum3%inum4);
	}
}
