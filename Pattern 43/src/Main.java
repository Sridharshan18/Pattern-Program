import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int character = 65;
        for(int i = 1 ; i<=n; i++)
        {
            for(int j = 1 ; j<=n-i+1; j++)
            {
                System.out.print((char) (character)+" ");
            }
            character++;
            System.out.println();
        }
    }
}

/*
   Output:
             A A A A A
             B B B B
             C C C
             D D
             E
 */