import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Array2 {
    public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		int n = read.nextInt();
    		for(int j=0; j<n; j++)
            {
    		    ele = read.nextInt();
    		    a.add(ele);
    		}
    		// Weekend holiday dates
    		ArrayList<Integer> weekend = new ArrayList<>(Arrays.asList(6, 7, 13, 14, 20, 21, 27, 28));
    		
    		// addAll() method is used to merge 2 ArrayList, this appends 'weekend' to 'a'
    		a.addAll(weekend);
    		
    		// create an ArrayList with unique elements of 'a'
    		HashSet<Integer> unique = new HashSet(a);
    		
    		// number of elements in the final holiday list
    		System.out.println(unique.size());
		}
	}
}
