//Program to find odd number and even number
import java.util.*;

public class exercise4{
    public static void main(String []args){
        int i ;
        int a[] = {1,2,3,4,5,6,7};
        //even number
        System.out.println("The even numbers");
        for(i=0 ; i<a.length ; i++){
                if(a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }
        //odd numbers
        System.out.println("The odd numbers");
        for(i=0 ; i<a.length ; i++){
            if(a[i] % 2 != 0){
                System.out.println(a[i]);
            }
        }
    }
}