import java.util.*;
public class two {
    public static void echo(int n){
        if(n==0) return;
        System.out.print(n + " ");
        echo(n-1);
    }  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        echo(n);

    }
    
}
