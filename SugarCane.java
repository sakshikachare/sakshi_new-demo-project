import java.util.Scanner;

public class SugarCane {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				System.out.println(n*15);
			}
		}
		
		

	}

}
