package com.kh.practice.array;

import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
			배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
			그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값: ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}
}
