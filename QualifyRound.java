import java.util.Scanner;

public class QualifyRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 
		while(t-->0) {
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(x<=(a+(b*2))) {
				System.out.println("Qualify");
			}
			else {
				System.out.println("Not Qualify");
			}
		}

	} 

}
