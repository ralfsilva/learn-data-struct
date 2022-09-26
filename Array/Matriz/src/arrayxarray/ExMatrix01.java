package arrayxarray;

public class ExMatrix01 {
	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4]; // 3 alunos, 4 notas

		// Notas do primeiro aluno
		notasAlunos[0][0] = 8.7;
		notasAlunos[0][1] = 9.1;
		notasAlunos[0][2] = 7.7;
		notasAlunos[0][3] = 8.5;

		notasAlunos[1][0] = 8.4;
		notasAlunos[1][1] = 9.7;
		notasAlunos[1][2] = 7.2;
		notasAlunos[1][3] = 8.9;

		notasAlunos[2][0] = 7.4;
		notasAlunos[2][1] = 6.7;
		notasAlunos[2][2] = 5.2;
		notasAlunos[2][3] = 7.9;

		for (int i = 0; i < notasAlunos.length; i++) {

			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("Aluno: " + i + ", " + " nota " + j + ": " + notasAlunos[i][j]);
			}
			System.out.println();
		}

		notasAlunos[1][0] = 5.5;

		double sum = 0;
		double average = 0;
		
		for (int i = 0; i < notasAlunos.length; i++) {

			sum = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				sum += notasAlunos[i][j];
			}
			System.out.println("Média Aluno " + i + ": " + String.format("%.1f", (sum/4)));
		}
		
		
		// Inicializando valores
		double[] iniciaArray = {6, 8, 9};
		double[][] iniciaArrayArray = {{3, 2, 5}, {4, 4, 4}};
		
		System.out.println();
		
		for (int i = 0; i < iniciaArrayArray.length; i++) {

			for (int j = 0; j < iniciaArrayArray[i].length; j++) {
				System.out.println("Output Matriz: " + iniciaArrayArray[i][j]);
			}
			
		}
		
	}
}








