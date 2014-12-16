public class Main {
	public static void main(String[] args){
	    int count = 0, sum = 7; // Accounts for 2 and 5 that are ruled out in first if statement below
	    boolean check;
	    for(int i = 2; count < 998; i++){
	    	check = true;
	    	int j = 3;
	    	if(i % 10 != 0 && i % 10 != 2 && i % 10 != 4 && i % 10 != 5 && i % 10 != 6 && i % 10 != 8){
	    		while(check && j < i/2){
	    			if(i % j == 0)
	    				check = false;
	    			j++;
	    		}
	    		if(check){
		    		sum += i;
		    		count++;
		    		System.out.println(count + " - " + i);
	    		}	
	    	}
	    }
	    System.out.println("Sum: " + sum);
	}
}