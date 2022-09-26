package arrayxarray;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int[][][] matriz3 = new int[3][3][3];
		
		int somaTotal = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3[i].length; j++) {
				for (int k = 0; k < matriz3[i][j].length; k++) {
					matriz3[i][j][k] = i + j + k;
					System.out.printf("Matriz tridimensional: [%d] + [%d] + [%d] = %d", i, j, k, matriz3[i][j][k]);
					
					somaTotal += matriz3[i][j][k];
					
					if (matriz3[i][j][k] % 2 == 0) {
						somaPares += matriz3[i][j][k]; 
					} else {
						somaImpares += matriz3[i][j][k];
					}
								
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Soma total: " + somaTotal + "\nSoma dos pares: " + somaPares + "\nSoma Impares: " + somaImpares);
		
	}
	
}
