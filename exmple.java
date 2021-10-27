import java.util.*;
//Java program to sum nth natural number
public class exmple{
    public static void main(String []args){
        int i , j=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(i=0 ; i<n ; i++){
            j = j + i;  
        }
        System.out.println("The sum of "+ n +" number = " + j);
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("k = " + k);

    }
}