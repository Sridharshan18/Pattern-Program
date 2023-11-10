import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i<=n ; i++)
        {
            int character = 64+i;
            int difference = n-1;
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print((char)(character)+" ");
                character = character + difference;
                difference--;
            }
            System.out.println();
        }
    }
}

/*
   Output:
            A
            B F
            C G J
            D H K M
            E I L N O

 */