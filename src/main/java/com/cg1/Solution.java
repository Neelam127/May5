package com.cg1;

import java.util.ArrayList;

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        
        int kth=0;
		
		char[] s1Arr=s1.toCharArray();
        char[] s2Arr=s2.toCharArray();
        
        ArrayList<Character> s1Ch= new ArrayList<>();
        
        if(s1Arr.length!=s2Arr.length){
            return false;
        }
       
        
        for(int i=0;i<s1Arr.length;i++) {
        	s1Ch.add(s1Arr[i]);
        
        	
        }
        
        for(int i=0;i<s1Arr.length;i++) {
        	if(!s1Ch.contains(s2Arr[i])) {
        		kth+=1;
        	}
        }
        if(kth<=k){
            return true;
        }
        return false;
    }
}