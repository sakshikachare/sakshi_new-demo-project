
// display the reverse of the given number N

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		while (testCases-- >0){
		    int number = sc.nextInt();
		    int reverseNumber = 0;
		    
		    while(number!=0){
		        int lastDigit = number%10;
		        reverseNumber = (reverseNumber*10)+lastDigit;
		        number= number/10;
		    }
		    System.out.println(reverseNumber);
		} 
	

	}

}
