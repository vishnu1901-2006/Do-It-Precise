import java.util.Scanner;

public class six{
    public static int way(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return way(n - 1) + way(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(way(n));
        sc.close();
    }
}
