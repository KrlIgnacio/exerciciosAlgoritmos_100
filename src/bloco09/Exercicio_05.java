package bloco09;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
public class Exercicio_05 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// vetor -> ler nome, salario e sexo [5]
		String[] vetNome = new String[5];
		char[] vetSexo = new char[vetNome.length];
		double[] vetSalario = new double[vetSexo.length];
		for (int i = 0; i < vetNome.length; i++) {
			System.out.println(i + 1 + " ° funcionário, digite seu nome: ");
			vetNome[i] = sc.nextLine();
			System.out.print("Digite seu sexo: (f/m)");
			vetSexo[i] = sc.next().charAt(0);
			System.out.print("Digite seu salário R$: ");
			vetSalario[i] = sc.nextDouble();
			sc.nextLine();
			System.out.println(" ");
		}
		System.out.println("Mulheres que ganham mais de R$5.000,00: ");
		for (int i = 0; i < vetSalario.length; i++) {
			if (vetSexo[i] == 'f' || vetSexo[i] == 'F') {
				if (vetSalario[i] > 5000) {
					System.out.println(vetNome[i] + ", R$" + vetSalario[i] + ".");
				}
			}
		}
	}

}
