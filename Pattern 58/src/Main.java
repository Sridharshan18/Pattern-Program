import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i<=n ; i++)
        {

            for(int j = 1 ; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            int character = 64;
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print((char)(character+i)+" ");
                character--;
            }
            int anotherCharacter = 64;
            for(int j = 2 ; j<=i; j++)
            {

                System.out.print((char) (anotherCharacter+j)+" ");
                character++;
            }
            System.out.println();
        }
    }
}

/*
   Output:
                  A
                B A B
              C B A B C
            D C B A B C D
          E D C B A B C D E


 */