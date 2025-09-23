import java.util.*;
public class eight {
    public static int sumf(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int sum=sumf(n-1)+sumf(n-2);
        return sum;
    }  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumf(n));

    }
    
}
