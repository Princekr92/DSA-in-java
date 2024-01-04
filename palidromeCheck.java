public class palidromeCheck {
    public static void main(String[]args){
        int ans = 0;
        int nums[]={111,222,333,555};
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
                int s =0; //1, 11, 111;
                int t = num;
                while(num>0){
                int r= num%10;
                s=s*10+r;
                num/=10;
            }
            if(s == t)  ans++;
            else ans--;
        }
        if(nums.length == ans){
            System.out.println("true"); 
        }
        else{
             System.out.println("false");
        }
  
    }
    
}
