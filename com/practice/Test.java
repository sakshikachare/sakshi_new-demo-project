package com.practice;

import java.util.Scanner;

public class Test {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(y%x==0 && (y%x)<=n) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
	
	}

}
