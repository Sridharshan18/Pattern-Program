import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            int character = 64;
            for(int j = 1 ; j<=n-i+1; j++)
            {
                System.out.print((char)(character+n)+" ");
                character--;
            }
            System.out.println();
        }
    }
}


/*
   Output
        E D C B A
        E D C B
        E D C
        E D
        E
 */