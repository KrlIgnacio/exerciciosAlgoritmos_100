package bloco01;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 10/10/2023
 *  
 * */

public class Exercicio_04 {

	public static void main(String[] args) {
		//  leia dois números inteiros e mostre a soma
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número inteiro:");
		numero1 = teclado.nextInt();
		System.out.print("Digite outro número interio:");
		numero2 = teclado.nextInt();
		int soma = numero1 + numero2;
		System.out.println("A soma entre "+ numero1+ " e "+numero2+" é: "+soma);
		teclado.close();

	}

}
