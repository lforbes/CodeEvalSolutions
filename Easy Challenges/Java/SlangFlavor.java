import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    String[] slang = new String[]{", yeah!",", this is crazy, I tell ya.",", can U believe this?", ", eh?", ", aw yea.", ", yo.", "? No way!", ". Awesome!"};
	    int everyOther = 0, slangPos = 0;
	    while ((line = in.readLine()) != null){
	    	for(int i = 0; i < line.length(); i++){
	    		if(line.charAt(i) == '.' || line.charAt(i) == '!' || line.charAt(i) == '?')
	    		{
	    			everyOther++;
	    			if(everyOther%2 == 0){
	    				System.out.print(slang[slangPos]);
	    				slangPos++;
	    				if(slangPos > 7)
	    					slangPos = 0;
	    			}
	    			else
	    				System.out.print(line.charAt(i));
	    		}
	    		else
	    			System.out.print(line.charAt(i));
	    	}
	    	System.out.println("");
	    }
	}
}