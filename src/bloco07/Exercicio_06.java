package bloco07;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 03/11/2023
 * */
public class Exercicio_06 {
	public static void main(String[] args) {
		//Leia um número e mostre a tabuada do mesmo
		int numTab;
		System.out.println("----------------------------------------");
		System.out.println("  DESCRUBRA A TABUADA DE UM NÚMERO: ");
		System.out.println("----------------------------------------");
		numTab = Teclado.lerInt("Digite um número: ");
		System.out.println("\nTABUDA DO "+numTab+":");
		//laço de repetição do 1 até 10
		for(int i=1; i<=10; i++) {
			//resultado tabuada (numTab vezes o número do loop
			System.out.println(i + " x "+numTab+" = "+(numTab * i));
		}
	}
}
