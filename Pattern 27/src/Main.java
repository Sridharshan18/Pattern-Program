import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count =1;
        int second = n*n+1;
        int space = 0;

        for(int i = 1 ; i<=n; i++)
        {
            for (int j = 1; j <=space; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j<=n-i+1; j++)
            {
                System.out.print(count+" ");
                count++;
            }
           for(int j = 1 ; j<=n-i+1; j++)
           {
               if (count == second)
               {
                   System.out.print(second++);
               }
               else
               {
                   System.out.print(" "+second++);
               }

           }
           second = second - 1 - ((n-i+1) - 1) * 2;
           space = space+2;

           System.out.println();
        }
    }
}