import java.util.Scanner;

public class SharkTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a*10 > b*5) {
				System.out.println("First");
			}
			else if(a*10 < b*5) {
				System.out.println("Second");
			}
			else {
				System.out.println("Any");
			}
		}

	}

}
