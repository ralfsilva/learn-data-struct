package arrayxarray;

import java.util.Scanner;

public class MatrizIrregular {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número dos entrevistados: ");
		int numEntrevistados = sc.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos do entrevistado " + (i+1));
			int qtdFilhos = sc.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				
				System.out.println("Digite o nome do filho " + (j+1));
				nomesFilhos[i][j] = sc.next();
			}
		}
		
		// output
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem Filhos " + nomesFilhos[i].length);
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
		
		
		
		sc.close();
	}
}








