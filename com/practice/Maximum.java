package com.practice;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int m = Math.max(a,  b);
			int n = Math.max(c,  d);
			System.out.println(m + n);
		}

	}

}
