import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0) {
			int a = sc.nextInt();
			int count = 0;
			int []arr = new int[a];
			for (int i=0; i<a; i++) {
				arr[i] = sc.nextInt();
				if(arr[i]>=1000) {
					count++;
				}
			}
			System.out.println(count);
		}
		

	}

}
