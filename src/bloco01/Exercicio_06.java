package bloco01;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 10/10/2023
 *  
 * */
public class Exercicio_06 {
	public static void main(String[] args) {
		//leia um número inteiro e mostre o seu antecessor e sucessor
		int numero, antecessor, sucessor;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = teclado.nextInt();
		antecessor = numero - 1;
		sucessor = numero + 1;
		System.out.println("O Antecessor de "+numero+ " é "+antecessor);
		System.out.println("O Sucessor de "+numero+ " é "+sucessor);
		teclado.close();
		
	}

}
