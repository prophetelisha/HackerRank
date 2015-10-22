package sherlock_and_watson;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int[] rotateArray(int[] nums, int N, int K) {
      /* Complete this function */
    	int[] res = new int[N];
    	K = K % N;
    	
    	for (int i = 0; i < K; i++) {
    		res[i] = nums[N-K+i];
    	}
    	for (int i = K; i < N; i++) {
    		res[i] = nums[i-K];
    	}
    	
    	//printArray(res);
    	return res;
    	
    }
    
    static void printArray(int[] array) {
    	StringBuffer string = new StringBuffer();
    	for (int i = 0; i < array.length; i++) {
    		string.append(array[i] + " ");
    	}
    	
    	System.out.println(string);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] n_k_q = in.nextLine().split(" "); 
        int N = Integer.parseInt(n_k_q[0]);
        int K = Integer.parseInt(n_k_q[1]);
        int Q = Integer.parseInt(n_k_q[2]);
        
        String[] numString = in.nextLine().split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
        	nums[i] = Integer.parseInt(numString[i]);
        }
        
        int[] newNums = rotateArray(nums, N, K);
        
        for (int i = 0; i < Q; i++) {
        	int idx = Integer.parseInt(in.nextLine());
        	System.out.println(newNums[idx]);
        }
        in.close();
    }
}
