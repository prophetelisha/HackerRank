package the_love_letter_mystery;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void removeEdges(HashMap<String, ArrayList<String>> map) {
      /* Complete this function */
    	int[] start = new int[2];
    	start[0] = 0;
    	start[1] = 0;
    	int[] res = countVertices("1", map, start);
    	
    	System.out.println(res[1]);
    	
    }
    
    static int[] countVertices(String node, HashMap<String, ArrayList<String>> map, int[] res) {
    	int vertices = 1;
    	if (map.get(node).size() != 0) {
    		
    		for (String child : map.get(node)) {
    			res = countVertices(child, map, res);
    			int childVertex = res[0];
    			if (childVertex % 2 == 0) {
    				res[1]++;
    			} else {
    				vertices += childVertex;
    			}
    		}
    	}
    	
    	res[0] = vertices;
    	return res;
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] n_k = in.nextLine().split(" ");
        int N = Integer.parseInt(n_k[0]);
        int K = Integer.parseInt(n_k[1]);
        
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (int i = 0; i < K; i++ ){
        	String[] u_v = in.nextLine().split(" ");
        	if (map.get(u_v[1]) == null) {
        		map.put(u_v[1], new ArrayList<String>());
        	}
        	if (map.get(u_v[0]) == null) {
        		map.put(u_v[0], new ArrayList<String> ());
        	}
        	
        	map.get(u_v[1]).add(u_v[0]);
        }
        
        removeEdges(map);
        
        in.close();
    }
}
