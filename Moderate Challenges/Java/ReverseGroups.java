// Challenge description: https://www.codeeval.com/open_challenges/71/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
	
public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null){
	    	String[] split = line.split(";");
	    	String[] nums = split[0].split(",");
	    	String[] reverse = new String[nums.length];
	    	int index = 0;
	    	int k_items = Integer.parseInt("" + line.charAt(line.length()-1));
	    	int rem = reverse.length % k_items;
	    	for(int outer = 0; outer < (nums.length - rem); outer += k_items){
	    		for(int inner = outer + k_items-1; inner >= outer; inner--){
	    			reverse[index] = nums[inner];
	    			index++;
	    		}
	    	}
	    	if(rem != 0){
	    		while(index < reverse.length){
	    			reverse[index] = nums[index];
	    			index++;
	    		}
	    	}
	    	for(int print = 0; print < reverse.length; print++){
	    		System.out.print(reverse[print]);
	    		if(print != reverse.length-1)
	    			System.out.print(",");
	    	}
	    	System.out.println();
	    }
	}
}