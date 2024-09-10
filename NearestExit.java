//output LEFT if the passenger chooses the exit beside seat 1, RIGHT otherwise.


import java.util.Scanner;

public class NearestExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			if(x>50)
			{
				System.out.println("Right");	
			}
			else {
				System.out.println("Left");
			}
		}
		

	}

}
