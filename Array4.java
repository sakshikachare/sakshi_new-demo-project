import java.util.ArrayList;
import java.util.Scanner;

public class Array4 {
   
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    int n = read.nextInt();
		    int x = read.nextInt();
		    for(int j=1; j<=n; j++){
		        int ele = read.nextInt();
    		    a.add(ele);
		    }
		    // Update the code below to solve the problem
		    int maxDestroyed =  0;
		    for (int index = 0 ; index<n; index++){
		      if (a.get(index)< x){
		        maxDestroyed = index + 1;
		      }
		    }
          System.out.println(maxDestroyed);
		}
	}
}