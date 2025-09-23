import java.util.*;
public class five {
    public static int sumarr(int[]a,int b){
        if(b<0) return 0;
        int sum=sumarr(a,b-1)+ a[b];
        return sum;
        
    }  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=n-1;
        System.out.println(sumarr(a,b));       
        

    }
    
}
