import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int anothercharacter= 64;
        for(int i = 1 ; i<= n ; i++)
        {
            int character = 65;
            for(int j = 1 ; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print((char)(character)+" ");
                character++;
            }

            for(int j = i-1 ; j>=1 ; j--)
            {
                System.out.print((char) (anothercharacter+j)+" ");
            }

            System.out.println();
        }
    }
}


/*
   Output:
              A
            A B A
          A B C B A
        A B C D C B A
      A B C D E D C B A
 */