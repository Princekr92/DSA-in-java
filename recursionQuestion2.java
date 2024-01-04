public class recursionQuestion2 {
// input= 1947
// output= one nine four seven
public static void main(String[] args) {
    printDigits(1947);
}
 static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
public static void printDigits(int n){
    if(n==0){
        return;
    }
    int lastDigit=n%10;
    printDigits(n/10);
    System.out.print(digits[lastDigit]+" ");
}
}
