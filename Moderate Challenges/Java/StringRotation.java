// Challenge description: https://www.codeeval.com/open_challenges/76/
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
	    	int first = 0, letter1 = 0, letter2 = 0;
	    	boolean foundFirst = false, check = true;
	    	String[] words = line.split(",");
	    	
	    	if(words[0].length() != words[1].length()) // Make sure both strings are same size
	    		check = false;
	    	char start = words[0].charAt(0);
	    	for(int i = 0; i < words[0].length(); i++){
	    		if(words[1].charAt(i) == start){ // Find position of first letter
	    			if(i == words[1].length()-1){
	    				if(words[1].charAt(0) == words[0].charAt(1)){ // Make sure it is first letter by also checking second letter
	    					first = letter2 = i;
		    				foundFirst = true;
		    				break;
		    			}
	    			}
	    			else{
	    				if(words[1].charAt(i+1) == words[0].charAt(1)){ // Make sure it is first letter by also checking second letter
		    				first = letter2 = i;
		    				foundFirst = true;
		    				break;
		    			}
	    			}
	    		}
	    	}
	    	if(!foundFirst)
	    		check = false;
	   		while(check && letter2 < words[1].length()){ // Check letters to end of second string
	    		if(words[0].charAt(letter1) == words[1].charAt(letter2)){
	    			letter1++;
	    			letter2++;
	    		}else{
	    			check = false;
	    			break;
	    		}
	   		}
	   		letter2 = 0;
	    	while(check && letter1 < words[0].length()-1){ // Check letters from beginning of second string
	    		for(int j = 0; j < first; j++){
	    			if(words[0].charAt(letter1) == words[1].charAt(letter2)){
		    			letter1++;
		    			letter2++;
		    		}else{
		    			check = false;
		    			break;
		    		}
	    		}
	    	}
	    	if(check)
				System.out.println("True");
			else
				System.out.println("False");
			check = true;
	    }
	}
}