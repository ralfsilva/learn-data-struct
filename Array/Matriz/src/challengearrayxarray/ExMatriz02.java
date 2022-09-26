package challengearrayxarray;

import java.util.Random;

public class ExMatriz02 {
	public static void main(String[] args) {
		
		int[][] matrizRandom = new int[10][10];
		
		int maiorFive = Integer.MIN_VALUE;
		int menorFive = Integer.MAX_VALUE;
		
		int maiorSeven = Integer.MIN_VALUE;
		int menorSeven = Integer.MAX_VALUE;
		
//		for (int i = 0; i < matrizRandom[5].length; i++) {  Utiliza-se o 5 para restringir a linha 5
//			if (matrizRandom[5][i] > maiorFive) { O i vai iterar na linha 5
//				maiorFive = matrizRandom[5][i];
//			}
//			...
//		}
		
//		for (int i = 0; i < matrizRandom.length; i++) { Aqui vamos iterar as colunas 7 da matriz 
//			if (matrizRandom[i][7] < menorSeven) { Hard coded
//				menorSeven = matrizRandom[i][7];
//			}
//			...
//		}
		
		Random rand = new Random();
		
		for (int i = 0; i < matrizRandom.length; i++) {
			for (int j = 0; j < matrizRandom.length; j++) {
				matrizRandom[i][j] = rand.nextInt(100);
				
				if (i == 5) {
					if (matrizRandom[i][j] > maiorFive) {
						maiorFive = matrizRandom[i][j];
					}
					if (matrizRandom[i][j] < menorFive) {
						menorFive = matrizRandom[i][j];
					}
				}
				
				if (j == 7) {
					if (matrizRandom[i][j] > maiorSeven) {					
						maiorSeven = matrizRandom[i][j];
					}
					if (matrizRandom[i][j] < menorSeven) {
						menorSeven = matrizRandom[i][j];
					}
				}
			}
		}
		
		for (int i = 0; i < matrizRandom.length; i++) {
			for (int j = 0; j < matrizRandom[i].length; j++) {
				System.out.printf("[%d,%d] = %d %n", i, j, matrizRandom[i][j]);
			}
		}
		
		System.out.printf("%nMaior valor linha 5: %d %nMenor Valor linha 5: %d %nMaior valor coluna 7: %d %nMenor valor coluna 7: %d", maiorFive, menorFive, maiorSeven, menorSeven);
		
	}
}



