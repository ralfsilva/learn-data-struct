package challengearrayxarray;

import java.util.Scanner;

public class ExMatriz03 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] fillMatrix = new int[3][3];
		
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < fillMatrix.length; i++) {
			for (int j = 0; j < fillMatrix.length; j++) {
				fillMatrix[i][j] = sc.nextInt();
				
				if (fillMatrix[i][j] % 2 == 0) {
					par++;
				} 
				else {
					impar++;
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < fillMatrix.length; i++) {
			for (int j = 0; j < fillMatrix[i].length; j++) {
				System.out.printf("[%d,%d] = %d%n", i, j, fillMatrix[i][j]);
			}
		}
		
		System.out.println("\nPares: " + par + "\nImpares: " + impar);
		
		sc.close();
	}
}
