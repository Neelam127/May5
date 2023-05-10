package com.cg1;
//Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
//NOTE: Add the whole string if other string is empty.
public class Solution4 {
	 String merge(String S1, String S2)
	    { 
	        // code here
	        char arr1[]=S1.toCharArray();
	        char arr2[]=S2.toCharArray();
	        
	        int len=0;
	        int len2=0;
	        String output="";
	        
	        if(arr1.length==arr2.length){
	            len=arr1.length;
	            len2=arr1.length;
	            for(int i=0;i<len;i++){
	                output=output+arr1[i]+arr2[i];
	            }
	            return output;
	        }
	        else if(arr1.length>arr2.length){
	            len=arr2.length;
	            len2=arr1.length;
	            
	            for(int i=0;i<len;i++){
	                output=output+arr1[i]+arr2[i];
	              
	            }
	            for(int i=len;i<arr1.length;i++){
	                output=output+arr1[i];
	            }
	            return output;
	        }
	        else{
	            len=arr1.length;
	            len2=arr1.length;
	            
	            for(int i=0;i<len;i++){
	                output=output+arr1[i]+arr2[i];
	            }
	            for(int i=len;i<arr2.length;i++){
	                output=output+arr2[i];
	                
	            }
	            return output;
	        }
	        }
}
