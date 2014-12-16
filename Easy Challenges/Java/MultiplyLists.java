// This is a simplified way of solving this problem.
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
	    	int[] list1 = new int[100];
		    int[] list2 = new int[100];
		    boolean[] check = new boolean[100];
	    	int pos = 0, arr1 = 0, arr2 = 0;
	    	String s_num = "";
	    	while(line.charAt(pos) != '|'){
	    		if(line.charAt(pos) != ' ')
	    			s_num += line.charAt(pos);
	    		else{
	    			list1[arr1] = Integer.parseInt(s_num);
	    			check[arr1] = true;
	    			arr1++;
	    			s_num = "";
	    		}
	    		pos++;
	    	}
	    	
	    	pos+= 2;
	    	while(pos < line.length()){
	    		if(line.charAt(pos) != ' ')
	    			s_num += line.charAt(pos);
	    		else{
	    			list2[arr2] = Integer.parseInt(s_num);
	    			arr2++;
	    			s_num = "";
	    		}
	    		pos++;
	    	}
	    	list2[arr2] = Integer.parseInt(s_num);
	    	
	    	for(int i = 0; i < list1.length; i++){
	    		if(check[i] == true){
	    			int result = list1[i] * list2[i];
	    			System.out.print(result + " ");
	    		}
	    	}
	    	System.out.println();
	    }
	}
}