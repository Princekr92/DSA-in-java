public class LinearSearchAlgo7 {
    // Q.find no of nos that have no of digits
    public static void main(String[]args){

    }
    static int findNumbers(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check wheather a number contains even digits or not
       static boolean even(int num){
        int numberOfDigits=digits(num);
        // if(numberOfDigits % 2==0){
        //     return true;
        // }
        // return false;
        return numberOfDigits %2==0;

    }
    //count number of digits in a number
    static int digits2(int num){
        if(num < 0){
            num=num* -1;

        }
        return (int)(Math.log10(num))+1;
    }
    // count no of digits in a number
    static int digits(int num){
        if(num < 0){
            num=num* -1;

        }

        if(num==0){
            return 1;
        }
        int count=0;

        while(num > 0){
            count++;
            num=num/10;
        }
        return count;

    }
    
}
