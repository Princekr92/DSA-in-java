import java.util.Arrays;
public class LinearSearchAlgo5 {
    // search in 2d arrays
    public static void main(String[] args) {
        int [][]arr= {
                    {45,89,5},
                    {34,5,2,6 },
                    {45,7,8,98},
                    {78,89,56,2},
                    {18,23}
    };
    int target=98;
    int[]ans=search(arr,target);//format of return value(row,col)
    System.out.println(Arrays.toString(ans));
        
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row < arr.length;row++){
            for(int col=0; col < arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};

    }
    
}
