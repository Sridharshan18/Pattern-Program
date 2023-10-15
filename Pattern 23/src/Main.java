import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n; i++)
        {
            for(int j=1 ; j<=3*n; j++)
            {
                if(i%2!=0)
                {
                    if ((i + j) % 4 == 0) {
                        System.out.print("* "); //first row mod 4 only
                                                //second row mod 2 only
                    } else {
                        System.out.print("  ");
                    }
                }
                else if(j%2==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}