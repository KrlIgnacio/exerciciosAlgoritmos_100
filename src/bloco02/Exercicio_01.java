package bloco02;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 11/10/2023
 * */
public class Exercicio_01 {
		// leia os valores de A, B e C de uma equação e mostre o valor de Delta
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//variaveis
		int valorA, valorB, valorC;
		double delta;
		//formula delta = b² - 4 * a*c
		System.out.println("Vamos descobrir o valor de Delta: ");
		System.out.print("Digite um valor para B:");
		valorB = teclado.nextInt();
		System.out.print("Digite um valor para A:");
		valorA = teclado.nextInt();
		System.out.print("Digite um valor para C:");
		valorC = teclado.nextInt();
		delta = (valorB * valorB) - 4 * (valorA)*(valorC);
		System.out.println("O valor de Delta desta equação do segundo grau equivale a "+delta+"!");
		
		teclado.close();
		
		
	}
}
