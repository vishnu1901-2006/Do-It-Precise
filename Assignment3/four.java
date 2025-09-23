import java.util.*;
public class four {
    public static void reversestring(String a,int n){
        if(n<0) return;
        System.out.print(a.charAt(n));
        reversestring(a,n-1);
        
    }  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length()-1;
        reversestring(a,n);

    }
    
}
