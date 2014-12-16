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
	    	char t = line.charAt(line.length()-1);
	    	String S = line.substring(0, line.length()-2);
	    	int pos = -1;
	    	for(int i = 0; i < S.length(); i++){
	    		if(S.charAt(i) == t){
	    			pos = i;
	    		}
	    	}
	    	System.out.println(pos);
	    }
	}
}