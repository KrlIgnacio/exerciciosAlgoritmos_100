package bloco06;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 19/10/2023
 * */
public class Exercicio_01 {
	public static void main(String[] args) {
		// leia o preço de 8 produtos e no final mostre o menor e o maior valor
		double valorProduto;
		int i = 1;
		// garante que o menorValor digitado seja menor que o max valor double
		double menorValor = Double.MAX_VALUE;
		// garante que o maiorValor digitado seja maior que o min valor double
		double maiorValor = Double.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Digite o valor de produtos:");
		while (i <= 8) {
			System.out.print("Digite o valor do " + i + "° produto R$:");
			valorProduto = sc.nextDouble();
			// se o valor digitado for maior que maiorValor
			// meiorValor receber valorProduto
			if (valorProduto > maiorValor) {
				maiorValor = valorProduto;

			}
			// verificação de menorValor
			else if (valorProduto < menorValor) {
				menorValor = valorProduto;

			}
			i++;
		}
		System.out.println("Menor valor: R$" + formatador.format(menorValor));
		System.out.println("Maior valor: R$" + formatador.format(maiorValor));
		sc.close();
	}
}
