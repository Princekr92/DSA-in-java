public class LeetcodeQ1 {

    // smallest latter
    public static void main(String [] args){

    }

    public char nextGreatLatter(char[] latters, char target){
    // but what if the target is greater than the greatest no in the array
    // if(target > latters[latters.length - 1]){
    //     return -1;
    // }
    int start =0;
    int end =latters.length -1;

    while(start <= end){
        // find the middle element
        int mid=start +(end - start) /2;
        if(target < latters[mid]){
            end =mid -1;
        }
        else{
            start =mid +1;
        }
    }
    return latters[start % latters.length];

    }
     
    }
    
