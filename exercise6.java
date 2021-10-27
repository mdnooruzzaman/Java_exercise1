//Program to 2nd largest number in the array

import java.util.*;
public class exercise6{
    public static void main(String []args){
        int i,j , temp=0;

        int a[] = {23 , 43 ,14 ,24,46};
        for(i=0 ; i<a.length ; i++){
            for(j = i+1 ; j<a.length ; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("The second largest number is " + a[a.length - 2]);
    }
}