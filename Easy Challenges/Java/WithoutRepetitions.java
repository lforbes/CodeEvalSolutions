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
	    	char check = line.charAt(0);
	    	System.out.print(line.charAt(0));
	    	for(int i = 1; i < line.length(); i++){
	    		if(line.charAt(i) == check)
	    			;
	    		else{
	    			check = line.charAt(i);
	    			System.out.print(line.charAt(i));
	    		}
	    	}
	    	System.out.println();
	    }
	}
}