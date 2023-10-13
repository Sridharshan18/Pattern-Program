import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = scanner.nextInt();
        for(int i = 1; i<=2*n ; i++)
        {
            int spaces = i<=n?n-i:i-n;
            int star = i<=n? 2*i-1:(2*(2*n-i))-1; //7531
            for(int j = 1 ; j<=spaces ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=star; j++)
            {
                if(j==1||j==2*i-1||j==(2*(2*n-i))-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}