import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            int character = 65;
            for(int j = 1 ; j<=(2*i)-1; j++ )
            {
                System.out.print((char)(character)+" ");
                character++;
            }
            System.out.println();
        }
    }
}

/*
    Output:
             A
             A B C
             A B C D E
             A B C D E F G
             A B C D E F G H I
 */