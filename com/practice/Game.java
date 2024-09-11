package com.practice;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(x%n==0 && n<=x) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
