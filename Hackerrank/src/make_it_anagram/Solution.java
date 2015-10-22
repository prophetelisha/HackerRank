package make_it_anagram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void findDeletions(String first, String second) {
      /* Complete this function */
    	char[] firstChars = first.toCharArray();
    	char[] secondChars = second.toCharArray();
    	
    	Arrays.sort(firstChars);
    	Arrays.sort(secondChars);
    	
    	int a = 0, b = 0;
    	int deletions = 0;
    	
    	while (a < first.length() || b < second.length()) {
    		if (a >= first.length()) {
    			deletions++;
    			b++;
    		} else if (b >= second.length()) {
    			deletions++;
    			a++;
    		} else {
	    		if (firstChars[a] < secondChars[b]) {
	    			deletions++;
	    			a++;
	    		} else if (firstChars[a] > secondChars[b]) {
	    			deletions++;
	    			b++;
	    		} else {
	    			a++;
	    			b++;
	    		}
    		}
    	}
    	
    	System.out.println(deletions);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String first = in.nextLine();
        String second = in.nextLine();
        findDeletions(first, second);
        
        in.close();
    }
}
