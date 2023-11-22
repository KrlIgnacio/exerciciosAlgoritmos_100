package bloco08;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
import util.Teclado;

public class Exercicio_08 {

	public static void main(String[] args) {
		// vetor -> leia 15 números inteiros e mostre posições dos multiplos de 10
		int[] vetMultiplos = new int[15];
		int num = 0;
		// um for para armazenar os valores
		for (int i = 0; i < 15; i++) {
			num = Teclado.lerInt("Digite um " + (i + 1) + "° valor inteiro: ");
			vetMultiplos[i] = num;

		}
		System.out.println("-------------------");
		// for para mostrar o vetor
		for (int v : vetMultiplos) {
			System.out.print(v + " ");
		}
		System.out.println(" ");

		System.out.println("\nPosição múltiplos de 10: ");
		// for semelhante ao primeiro para mostrar as posições dos múltiplos de 10!
		for (int i = 0; i < 15; i++) {
			if (vetMultiplos[i] % 10 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
