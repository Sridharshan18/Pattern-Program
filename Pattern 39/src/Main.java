import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 2*n-1;
        for(int i = 1 ; i<=count; i++)
        {
                int spaces = i<=n ? 2*(i-1) : (2*n)-((i-n)*2)-2;
                for(int k = 1 ; k<=spaces; k++)
                {
                    System.out.print(" ");
                }

                int star = i<=n? (n-i)+1 : (i-n) +1;

                for(int s = 1 ; s<=star ; s++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
