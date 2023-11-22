package bloco07;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 03/11/2023
 * */
public class Exercicio_06 {
	public static void main(String[] args) {
		//Leia um n�mero e mostre a tabuada do mesmo
		int numTab;
		System.out.println("----------------------------------------");
		System.out.println("  DESCRUBRA A TABUADA DE UM N�MERO: ");
		System.out.println("----------------------------------------");
		numTab = Teclado.lerInt("Digite um n�mero: ");
		System.out.println("\nTABUDA DO "+numTab+":");
		//la�o de repeti��o do 1 at� 10
		for(int i=1; i<=10; i++) {
			//resultado tabuada (numTab vezes o n�mero do loop
			System.out.println(i + " x "+numTab+" = "+(numTab * i));
		}
	}
}
