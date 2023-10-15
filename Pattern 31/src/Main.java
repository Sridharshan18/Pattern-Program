import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int originalN = n+1;
        n = 2*n;
        for(int i = 1; i<n; i++) {
            for (int j = 1; j <n; j++)
            {
                int numberat = originalN - Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(numberat+" ");
            }
            System.out.println();
        }
    }
}