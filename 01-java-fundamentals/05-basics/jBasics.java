import java.util.ArrayList;
import java.util.Arrays;
public class jBasics{
    public void countEven(){
        for (int i =0; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void countOdd(){
        for (int i=0; i<256; i++){
            if (i % 2 !=0)
            System.out.println(i);
        }
    }

    public int addSum(){
        int sum=0;
        while (sum <=255){
            sum=sum + (sum+1);
        }
        return sum;
    }

    public int arrays(){
        int i;
        int [] numbers = {1,3,5,7,9,13};
         for (i = 0; i < numbers.length; i++) {
            System.out.println(num + " ");
            int num = numbers[i];
        }
        return (num);
    }
    public int max(){
       int [] arr = new int [] {-3,-5,-7};  
       int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {    
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Max is: " + max);  
    }
    return (max);

    public int oddArray();
        int a[]={1,2,5,6,3,2};    
            for(int i=0;i<a.length;i++){  
            if(a[i]%2!=0){  
            System.out.println(a[i]);  
        }  
    } 
}

