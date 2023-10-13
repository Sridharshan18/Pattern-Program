import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=2*n-1; i++)
        {
            int spaces = i<=n ? n-i : i-n;
            for(int j = 1 ; j<=spaces ; j++)
            {
                System.out.print(" ");
            }
            int star = i<=n?i:2*n-i;
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}