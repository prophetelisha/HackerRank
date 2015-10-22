package maxsubarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void findMaxSubArray(int[] nums, int N) {
      /* Complete this function */
    	
    	int bestSum = Integer.MIN_VALUE;
    	int currentSum = Integer.MIN_VALUE;
    	int nonContiguousSum = Integer.MIN_VALUE;
    	int threshold = nums[0];
    	
    	for(int i = 0; i < N; i++) {
    		if (nums[i] < threshold)
    			threshold = nums[i];
    	}
    	
    	for (int i = 0; i < N; i++) {
    		int val;
    		if (currentSum == Integer.MIN_VALUE || (currentSum < 0 && nums[i] >= 0)) 
    			val = nums[i];
    		else
    			val = currentSum + nums[i];
    		
    		if (val >= threshold) {
    			currentSum = val;	
    		} else {
    			currentSum = Integer.MIN_VALUE;
    		}
    		
    		if (currentSum > bestSum) {
    			bestSum = currentSum;
    		}
    		
    		if (i == 0)
    			val = nums[i];
    		else
    			if (nums[i] >= 0 && nonContiguousSum < 0) {
    				val = nums[i];
    			} else {
    				val = nonContiguousSum + nums[i];
    			}
    		
    		if (val > nonContiguousSum) {
    			nonContiguousSum = val;
    		}
    	}
    	
    	System.out.println(bestSum + " " + nonContiguousSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        
        for (int a = 0; a < T; a++) {
	        
        	int N = Integer.parseInt(in.nextLine());
        	String[] numString = in.nextLine().split(" ");
        	int[] nums = new int[N];
        	
        	for(int i = 0; i < N; i++) {
        		nums[i] = Integer.parseInt(numString[i]);
        	}
        	
        	findMaxSubArray(nums, N);
        }
        
        in.close();
    }
}
