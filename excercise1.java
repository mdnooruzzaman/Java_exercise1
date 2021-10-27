//Java program to merge two arrays

import java.util.*;

class exercise1{
    public static void main(String[] args){
        int i ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        System.out.println("Enter the array value a");
        for(i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the array value b");
        for(i=0 ; i<n ; i++){
            b[i] = sc.nextInt();
        }
        for(i=0 ; i<n ; i++){
            c[i] = a[i];
            c[i] = b[i];
        }
        
        for(i=0 ; i<n ; i++){
            System.out.print(c[i]);
        }
       
    }
}