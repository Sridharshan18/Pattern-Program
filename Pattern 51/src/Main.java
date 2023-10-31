import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            int character = 64;
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char)(character+(n-i+1))+" ");
                character++;
            }
            System.out.println();
        }
    }
}

/*
   Output:

         E
         D E
         C D E
         B C D E
         A B C D E
 */