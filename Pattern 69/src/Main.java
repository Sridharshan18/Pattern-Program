import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 1 ; i<=n ; i++)
        {

            for(int j = i ; j<=n ; j++)
            {
                System.out.print(j+" ");
            }
            count = count+1;
            for(int k = 1 ; k<count; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

/*
    Output:
          1 2 3 4 5
          2 3 4 5 1
          3 4 5 1 2
          4 5 1 2 3
          5 1 2 3 4
 */