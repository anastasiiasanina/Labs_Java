import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, m, n;
		final int C = 2;
        double Sum = 0;
        
        System.out.println("Enter a and b:");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Enter m and n:");
        n = input.nextInt();
        m = input.nextInt();
        
        if(m < b) {
            System.out.println("m can't be less than b! Enter again:");
            Main.main(args);
        } else if (n < a) {
        	System.out.println("n can't be less than a! Enter again:");
            Main.main(args);
        } else if (a < 0 || b < 0 || m < 0 || n < 0) {
        	System.out.println("Invalid numbers! Enter arguments above zero:");
            Main.main(args);
        } else if (b == 0) {
        	System.out.println("Dividing on zero!");
        } else {
            for (int i = (int) a; i <= n; i++) {
                for (int j = (int) b; j <= m; j++) {
                    Sum += ((double)(i%j) / (double)(i + C));
                }
            }
            System.out.println("Your result is:" + Sum);
        }
    }
}
