//Progrma to sort the array
import java.util.*;

public class exercise5{
    public static void main(String []args){
        int i,j ,temp=0;
        int a[] = {34 ,23 ,54, 12 ,36,123 ,-123};
        int b[] = new int[100];
        for(i=0 ; i<a.length ; i++){
            for(j=i + 1 ; j<a.length ; j++){
                if(a[i] > a[j]){
                    temp = a[i] ;
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i=0; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }
}