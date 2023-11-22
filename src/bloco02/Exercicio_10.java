package bloco02;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 12/10/2023
 * */
public class Exercicio_10 {

	public static void main(String[] args) {
		//leia um número inteiro e mostre se ele é PAR ou ÍMPAR
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Descubra se um número é par ou ímpar:");
		System.out.print("\nDigite um número: ");
		numero = sc.nextInt();
			//resto da divisão diferente de zero
			if(numero % 2 != 0) 
				System.out.println("\n"+numero+" é um número ÍMPAR!");
			
			else
				System.out.println("\n"+numero+" é um número PAR!");
		sc.close();

	}

}
