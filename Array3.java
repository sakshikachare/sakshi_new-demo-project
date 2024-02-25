//import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Array3 
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    int n = read.nextInt();
		    for(int j=1; j<=n; j++){
		        int ele = read.nextInt();
    		    a.add(ele);
		    }
		    
		    // Update the minimum value to the first element of the array
		    int mn = a.get(0);
		    int total_prize = 0;
		    
		    for(int j=0; j<n; j++){
    		    total_prize = total_prize + a.get(j);
    		    mn = Math.min(mn, a.get(j));
		    }
		    
		    int max_prize = total_prize - mn;
		    System.out.println(max_prize);
		}
	}
}
