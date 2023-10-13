import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int alpha = 97;
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                if(alpha % 2 == 0)
                {
                    System.out.print(((char) (alpha-32))+" ");
                    alpha++;
                }
                else
                {
                    System.out.print(((char) (alpha++))+" ");
                }
            }
            System.out.println();
        }
    }
}