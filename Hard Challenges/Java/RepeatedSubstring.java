// Challenge description: https://www.codeeval.com/open_challenges/53/
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
	    	String rep = "", temp = "";
	    	int longest = 0, count = 0, check1 = 0, check2 = 0;
	    	boolean none = true, match = true;
	    	for(int dub = 0; dub < line.length()-1; dub++){ // Remove any double spaces
				if(line.charAt(dub) == ' ' && line.charAt(dub+1) == ' ')
					line = line.substring(0, dub) + line.substring(dub+1, line.length());
			}
	    	for(int i = 0; i < line.length()-1; i++){
	    		for(int j = i + 1; j < line.length(); j++){
	    			check1 = i;
	    			check2 = j;
	    			while(match && check2 < line.length()){
	    				if(count < 1 && line.charAt(check1) == ' ')
    						match = false;
	    				else if(line.charAt(check1) == line.charAt(check2)){
	    					temp += line.charAt(check1);
	    					none = false;
	    	    			count++;
	    				}
	    				else
	    					match = false;
	    				check1++;
	    				check2++;
	    			}
	    			if(count > longest){
	    				longest = count;
	    				rep = temp;
	    			}
	    			match = true;
	    			temp = "";
	    			count = 0;
	    		}
	    	}
	    	if(none)
    			System.out.println("NONE");
    		else{
    			if(rep.length() > 1 && rep.charAt(0) == rep.charAt(rep.length()-1))
    				rep = rep.substring(0, rep.length()-1);
    			System.out.println(rep);
    		}
	    	rep = "";
    		longest = 0;
    		none = true;
	    }
	}
}