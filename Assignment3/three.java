import java.util.*;
public class three {
    public static int sum(int n){
        if(n==0) return 0;
        int sum=sum(n-1)+ n;
        return sum;
    }  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));

    }
    
}
