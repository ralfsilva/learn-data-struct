package challengearrayxarray;

import java.util.Scanner;

public class ExMatriz04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		byte opcao = 0;
		int diaMes = 0;
		int horaDia = 0;
		boolean diaValido = false;
		boolean horaValida = false;

		while (!sair) {

			System.out.println("Entre com 1 para adicionar compromisso.");
			System.out.println("Entre com 2 para verificar compromisso.");
			System.out.println("Entre com 0 para sair.");
			opcao = sc.nextByte();

			if (opcao == 1) { // adicionando compromisso

				diaValido = false;
				horaValida = false;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					diaMes = sc.nextInt();

					if (diaMes >= 1 && diaMes <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente um valor entre 1 e 31.");
					}
				}
				
				while (!horaValida) {
					System.out.println("Entre com a hora do dia: ");
					horaDia = sc.nextInt();

					if (horaDia >= 1 && horaDia <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente um valor entre 0 e 23.");
					}
				}
				
				System.out.println("Entre com o compromisso: ");
				compromissos[diaMes][horaDia] = sc.next();
				
			} else if (opcao == 2) { // verificar compromisso
				horaValida = false;
				diaValido = false;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					diaMes = sc.nextInt();

					if (diaMes >= 1 && diaMes <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente um valor entre 1 e 31.");
					}
				}
				
				while (!horaValida) {
					System.out.println("Entre com a hora do dia: ");
					horaDia = sc.nextInt();

					if (horaDia >= 1 && horaDia <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente um valor entre 0 e 23.");
					}
				}
				
				
				System.out.println("O compromisso agendado é: ");
				if (compromissos[diaMes][horaDia] == null) {
					System.out.println("Não há compromisso.");
				}
				else {	
					System.out.println(compromissos[diaMes][horaDia]);
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
