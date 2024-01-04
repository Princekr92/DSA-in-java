import java.util.*;
public class greedy4 {
    public static void main(String[] args) {
        // Q Indians coins [1,2,5,10,20,50,100,500,2000]
        // how to change value
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int countCoins=0;
        int amount=590;

        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
               while(coins[i]<=amount){
                countCoins++;
                ans.add(coins[i]);
                amount-=coins[i];
               }
            }
        }
        System.out.println("total min coins used ="+countCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
