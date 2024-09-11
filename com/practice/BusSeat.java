package com.practice;

import java.util.Scanner;

public class BusSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			if(n<=10) {
				System.out.println("Lower double");
			}
			else if(n<=15) {
				System.out.println("Lower single");
			}
			else if(n<=25) {
				
				System.out.println("Upper double");
			}
			else {
				System.out.println("Upper single");
			}
		}

	}

}
