package com.cg1;

//Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
class Solution2{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        
        int maxDiff=0;
        // Your code here
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                
                if(A[i]<=A[j]){
                    if(maxDiff<=(j-i)){
                        maxDiff=j-i;
                    }
                }
                
            }
        }
        
        return maxDiff;
        
    }
}


