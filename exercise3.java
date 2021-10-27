// Linear search
import java.util.*;

class exercise3{
    public static void main(String []args){
        int  i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of limit");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the value array elements");
        for(i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
       
       for(i=0 ; i<n ; i++){
           System.out.print(a[i]);
       }
       System.out.println("Enter the value of search key ");
       int key = sc.nextInt();
        for(i=0 ; i<n ; i++){
           if(a[i] == key){
               System.out.println("we got the key" + a[i]);
           }
           
       }
    }
}