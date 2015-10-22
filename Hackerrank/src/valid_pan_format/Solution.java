package valid_pan_format;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
    static String isValidPAN(String PAN) {
      /* Complete this function */
    	
    	if(PAN.matches(regex)) 
    		return "YES";
    	
    	return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        
        for (int a = 0; a < T; a++) {
	        
        	String PAN = in.nextLine();
        	System.out.println(isValidPAN(PAN));
        }
        
        in.close();
    }
}
