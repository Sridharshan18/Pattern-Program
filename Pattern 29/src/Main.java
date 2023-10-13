import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i<=2*n-1; i++)
        {
            int star = i<=5 ? i : (2*n) - i;
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print("*");
            }
            int spaces = i<=5 ? (n-i)*2 : (i-n)*2;
            for(int j = 1 ; j<=spaces; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}