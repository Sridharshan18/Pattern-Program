import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 2*n-1;
        for(int i = 1 ; i<=count; i++)
        {

            int star = i==1||i==count ? n :count;
            for(int j = 1 ; j<=star; j++)
            {
                if(i==1 || i==count)
                {
                    System.out.print("* ");
                }
                else if(j==i || j==(count-i+1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}