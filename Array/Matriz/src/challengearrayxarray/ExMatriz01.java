package challengearrayxarray;

public class ExMatriz01 {
	public static void main(String[] args) {

		int[][] matrizRandom = new int[4][4];

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matrizRandom.length; i++) {
			for (int j = 0; j < matrizRandom[i].length; j++) {
				matrizRandom[i][j] = (int) Math.round(Math.random() * 100);

				if (matrizRandom[i][j] > maior) {
					maior = matrizRandom[i][j];
					linha = i;
					coluna = j;
				}
				if (matrizRandom[i][j] < menor) {
					menor = matrizRandom[i][j];
				}
			}
		}
		
		for (int i = 0; i < matrizRandom.length; i++) {
			for (int j = 0; j < matrizRandom[i].length; j++) {
				System.out.printf("[%d,%d] = %d %n", i, j, matrizRandom[i][j]);
			}
		}

		System.out.println("\nMaior número da Matriz: " + maior + " posição: [" + linha + "," + coluna + "]");

	}
}
