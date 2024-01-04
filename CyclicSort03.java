import java.util.*;
public class CyclicSort03 {
    public static void main(String[]args){
      int nums[]={1,2,4,6,10,3,7,5};
      System.out.println(findDisapearedNumbers(nums));
    }
    public List<Integer> findDisapearedNumbers(int[]nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
