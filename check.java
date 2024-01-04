import java.util.*;
public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(a.charAt(i) == a.charAt(j)){
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("-1");
        }else
        System.out.println(n - count);
    }
    
}
