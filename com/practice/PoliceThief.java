//The initial location of the policeman on the number line is X and his speed is 
//2 units per second.The initial location of the thief on the number line is 
//Y and his speed is 1 unit per second.


package com.practice;

import java.util.Scanner;

public class PoliceThief {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(Math.abs(y-x));
		}

	}

}
