import java.util.*;
public class one {
    public static void beats(int n){
        if(n==0) return;
        beats(n-1);
        System.out.print(n + " ");
    }  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        beats(n);

    }
    
}
