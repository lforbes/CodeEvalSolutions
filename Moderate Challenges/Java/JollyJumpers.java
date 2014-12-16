import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null){
	    	System.out.println(line);
	    	String[] nums = line.split(" ");
	    	int[] diffs = new int[nums.length-1];
	    	for(int i = 0; i < diffs.length; i++){
	    		diffs[i] = Math.abs(Integer.parseInt(nums[i]) - Integer.parseInt(nums[i + 1]));
	    	}
	    	Set<Integer> set = new HashSet<Integer>();
	    	for(int i = 0; i < diffs.length; i++)
	    		  set.add(diffs[i]);
	    	
	    	int[] arr = new int[set.size()];
	    	int pos = 0;

	    	for( Integer i : set ) {
	    	  arr[pos++] = i;
	    	}
	    	Arrays.sort(arr);
	    	boolean check = true;
	    	for (int i = 1; i <= arr.length-1; i++) {
	            if (arr[i-1] != i) {
	                System.out.println("Not jolly");
	                check = false;
	                break;
	            }
	        }
	    	if(check)
	    		System.out.println("Jolly");
	    }
	}
}