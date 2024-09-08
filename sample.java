import java.util.Scanner;

public class sample {
	
	public static void main(String[] args) {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int HeOnMoon = x*y;
		    int Energy = a*b;
		    if(HeOnMoon>= Energy) {
		        System.out.println("Yes");
		    }
		    else {
		        System.out.println("No");
		    }
		
		    
		}

	}
	
}