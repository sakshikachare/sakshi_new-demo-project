import java.util.*;
class array
{
    public static void main (String args[])
    {
       
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		int n = read.nextInt();
    		for(int j=0; j<n; j++){
    		    ele = read.nextInt();
    		    a.add(ele);
    		}
    		
    		// HashSet is a class that can be used to store unique values of an ArrayList.
    		HashSet<Integer> unique = new HashSet(a);
    		
    		// create an ArrayList to store the sorted unique list
    		ArrayList<Integer> uniquesort = new ArrayList<Integer>(unique);
    		Collections.sort(uniquesort);
    		
    		ArrayList<Integer> freq = new ArrayList<Integer>();
    		for(int j=0; j<uniquesort.size(); j++){
    		    // count the occurrence of each element in ArrayList 'a'
    		    freq.add(Collections.frequency(a, uniquesort.get(j)));
    		}
    		
    		System.out.println(uniquesort);
    		System.out.println(freq);
		}
    }
}
