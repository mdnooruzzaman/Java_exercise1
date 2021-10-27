//Factorial of number
import java.util.*;

public class exercise2{   
    public static void main(String []args){
       int fact=1, i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the limit of factorial");
       int n = sc.nextInt();

       for(i=n ; i>0 ; i--){
           fact = fact * i ;
       }
    System.out.println(fact);
    }
}