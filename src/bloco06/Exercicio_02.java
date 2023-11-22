package bloco06;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 24/10/2023
 * */

public class Exercicio_02 {

	public static void main(String[] args) {
		// e leia a idade de 10 pessoas e mostre> media das idades | quantos maiores de
		// 18 | quantos < de 5 | qual maior idade lida
		int i = 1;
		int idade = 0;
		int maiorIdade = Integer.MIN_VALUE; // menor valor possível para idade;
		int maiorQue18 = 0, menorQue5 = 0, somaIdade = 0;
		double mediaIdades = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá caro grupo, por favor digitem suas idades\n");
		while (i <= 10) {
			System.out.print(i + "°-" + "Digite uma idade:");
			idade = sc.nextInt();
			// verificação dentro do loop + de 18
			if (idade > 18) {
				maiorQue18++;

			} // verificação < que 5
			else if (idade < 5) {
				menorQue5++;
			}
			//verificando maior idade lida 
			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
			somaIdade += idade;
			mediaIdades = somaIdade / 10;
			i++;
		}

		System.out.println("Quantidade de idades maiores que 18: " + maiorQue18);
		System.out.println("Quantidade de idades menores que 5: " + menorQue5);
		System.out.println("Maior idade lida: " + maiorIdade);
		System.out.println("Média das Idades: " + mediaIdades);
		sc.close();
	}

}
