package bloco02;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 11/10/2023
 * */
public class Exercicio_02 {

	public static void main(String[] args) {
		//  leia o pre�o de um produto, calcule e mostre o seu PRE�O PROMOCIONAL, com 5% de desconto
		Scanner sc = new Scanner(System.in);
		double produto, desconto, valorProduto;
		System.out.println("Descubra o valor final de um produto com 5% de DESCONTO:\n");
		System.out.print("Digite o valor do produto R$: ");
		produto = sc.nextDouble();
		desconto = produto * 5 / 100;
		valorProduto = produto - desconto ;
		System.out.println("O valor final do produto � R$"+valorProduto);
		
		sc.close();
	}

}
