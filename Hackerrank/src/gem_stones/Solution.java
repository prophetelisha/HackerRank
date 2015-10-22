package gem_stones;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void findGems(String[] strings, int N) {
      /* Complete this function */
    	HashMap<String, Integer> track = new HashMap<String, Integer>();
    	
    	int sum = 0;
    	for (int i = 0; i < N; i++) {
    		HashMap<String, String> loopTrack = new HashMap<String, String>();
    		for (int j = 0; j < strings[i].length(); j++) {
    			String letter = strings[i].substring(j, j+1);
    			if (track.get(letter) == null) {
    				track.put(letter, 0);
    			}
    			if (loopTrack.get(letter) == null) {
    				track.put(letter, track.get(letter) + (i + 1));
    				loopTrack.put(letter, letter);
    			}
    		}
    		sum += (i + 1);
    	}
    	int num = 0;
    	for (String key : track.keySet()) {
    		if (track.get(key) == sum) {
    			num++;
    		}
    	}
    	
    	//System.out.println("sum: " + sum);
    	//System.out.println(track);
    	
    	System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        
        String[] strings = new String[N];
        
        for (int i = 0; i < N; i++ ){
        	strings[i] = in.nextLine();
        }
        
        findGems(strings, N);
        in.close();
    }
}
