package com.cg1;
//Given a string str, convert the first letter of each word in the string to uppercase. 
public class Solution3 {
	public String transform(String s)
    {
        // code here
        
     String newStr="";
		
			 
String[] str=s.split(" ");

        
        for(int i=0;i<str.length;i++){
            newStr +=(Character.toUpperCase(str[i].charAt(0))) +str[i].substring(1)+" ";
            
        }
        
        return newStr;
    }
}
