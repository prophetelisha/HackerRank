package two_arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String determineAnswer(int[] A, int[] B, int K, int N) {
      /* Complete this function */
    	Arrays.sort(A);
    	Arrays.sort(B);
    	
    	for (int i = 0; i < N; i++) {
    		if ((A[i] + B[N-i-1]) < K) {
    			return "NO";
    		}
    	}
    	
    	return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        
        for (int a = 0; a < T; a++) {
	        
        	String[] n_k = in.nextLine().split(" ");
        	int N = Integer.parseInt(n_k[0]);
        	int K = Integer.parseInt(n_k[1]);
        	
        	String[] a_string = in.nextLine().split(" ");
        	String[] b_string = in.nextLine().split(" ");
        	int[] A = new int[N];
        	int[] B = new int[N];
        	for (int i = 0; i < a_string.length; i++) {
        		A[i] = Integer.parseInt(a_string[i]);
        		B[i] = Integer.parseInt(b_string[i]);
        	}
        	
        	System.out.println(determineAnswer(A, B, K, N));
        }
        
        in.close();
    }
}
