import java.util.Scanner;

// 422 - number

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m1, n1, m2, n2;
        
        System.out.println("Enter number of rows for matrix A:");
        m1 = input.nextInt();
        System.out.println("Enter number of cols for matrix A");
        n1 = input.nextInt();
        
        System.out.println("Enter number of rows for matrix B:");
        m2 = input.nextInt();
        System.out.println("Enter number of cols for matrix B:");
        n2 = input.nextInt();
        
        if (m1 != m2 || n1 != n2) {
            System.out.println("Oops..Numbers of rows and cols for this operation must be equal! Please try again.");
            Main.main(args);
        } else {
        	short [][] matrixA = new short[m1][n1];
            short [][] matrixB = new short[m2][n2];
            short [][] matrixC = new short[m1][n1];
            int maxSum = 0, minSum = 0;

            for(int i = 0; i < m1; i++) {
            	for(int j = 0; j < n1; j++) {
    				matrixA[i][j] = (short) (Math.random() * (100 - 0));
    		        System.out.print(matrixA[i][j]+ " ");
            	}
                System.out.println();
            }
            
            System.out.println();
            
            for(int i = 0; i < m2; i++) {
            	for(int j = 0; j < n2; j++) {
    				matrixB[i][j] = (short) (Math.random() * (100 - 0));
    		        System.out.print(matrixB[i][j] + " ");
            	}
                System.out.println();
            }
            
            System.out.println();

            for(int i = 0; i < m1; i++) {
               	for(int j = 0; j < n2; j++) {
        			matrixC[i][j] = (short) (matrixA[i][j] + matrixB[i][j]);
               	}
            }
            
            for(int i = 0; i < m1; i++) {
            	for(int j = 0; j < n1; j++) {
    		        System.out.print(matrixC[i][j] + " ");
            	}
                System.out.println();
            }
            
            for(int i = 0; i < m1; i++) {
            	if(i % 2 == 0) {
            		int maxNumber = matrixC[i][0];
            		for(int j = 0; j < n1; j++) {
        		        maxNumber = Math.max(maxNumber, matrixC[i][j]);
                	}
    		        maxSum += maxNumber;
            	}
            }
            for(int i = 0; i < m1; i++) {
            	if(i % 2 != 0) {
            		int minNumber = matrixC[i][0];
            		for(int j = 0; j < n1; j++) {
        		        minNumber = Math.min(minNumber, matrixC[i][j]);
                	}
    		        minSum += minNumber;
            	}
            }
            
            System.out.println("Sum of max numbers in even rows: " + maxSum);
            System.out.println("Sum of min numbers in odd rows: " + minSum);
        }
	}
}
