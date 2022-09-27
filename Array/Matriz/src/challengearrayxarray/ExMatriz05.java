package challengearrayxarray;

import java.util.Scanner;

public class ExMatriz05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][24];

		boolean sair = false;
		byte opcao = 0;
		int mes = 0;
		int dia = 0;
		int hora = 0;
		boolean diaValido = false;
		boolean horaValida = false;
		boolean mesValido = false;

		while (!sair) {
			mesValido = false;
			diaValido = false;
			horaValida = false;

			System.out.println("Entre com 1 para adicionar compromisso.");
			System.out.println("Entre com 2 para verificar compromisso.");
			System.out.println("Entre com 0 para sair.");
			opcao = sc.nextByte();

			if (opcao == 1) { // adicionando compromisso
				
				while (!mesValido) {
					System.out.println("Entre com o mês: ");
					mes = sc.nextInt();
					
					if (mes >= 1 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente um número entre 1 e 12.");
					}
				}
				
				while (!diaValido) {
					System.out.println("Entre com o dia: ");
					dia = sc.nextInt();

					if (dia >= 1 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente um número entre 1 e 31.");
					}
				}
				
				while (!horaValida) {
					System.out.println("Entre com a hora: ");
					hora = sc.nextInt();

					if (hora >= 1 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente um número entre 1 e 24.");
					}
				}
				
				System.out.println("Entre com o compromisso: ");
				compromissos[++mes][++dia][++hora] = sc.next();
				
			} else if (opcao == 2) { // verificar compromisso
				while (!mesValido) {
					System.out.println("Entre com o mês: ");
					mes = sc.nextInt();
					
					if (mes >= 1 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente um número entre 1 e 12.");
					}
				}
				
				while (!diaValido) {
					System.out.println("Entre com o dia: ");
					dia = sc.nextInt();

					if (dia >= 1 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente um número entre 1 e 31.");
					}
				}
				
				while (!horaValida) {
					System.out.println("Entre com a hora: ");
					hora = sc.nextInt();

					if (hora >= 1 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente um valor entre 1 e 24.");
					}
				}
				
				System.out.println("O compromisso agendado é: ");
				if (compromissos[dia][hora] == null) {
					System.out.println("Não há compromisso.");
				}else {	
					System.out.println(compromissos[++mes][++dia][++hora]);
				}
				
				
			} else if (opcao == 0) { // sair
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente.");
			}

		}

		sc.close();
	}
}
