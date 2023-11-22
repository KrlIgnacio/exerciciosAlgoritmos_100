package bloco09;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import java.util.Arrays;
import java.util.Random;

public class Exercicio_03 {

	public static void main(String[] args) {
		// -> vetor[20] com números sorteados de 0 a 99
		int[] vetor = new int[20];
		for (int i = 0; i < vetor.length; i++) {
			Random aleatorio = new Random();
			vetor[i] = aleatorio.nextInt(99);// sorteio
		}
		// mostrando vetor
		System.out.println("Vetor sorteio: ");
		for (int v : vetor) {
			System.out.print(v + " ");
		}
		System.out.println(" ");
		// mostrando vetor ordenado
		System.out.println("\nVetor ordenado: ");
		Arrays.sort(vetor); // ordenando o vetor
		for (int vet : vetor) {
			System.out.print(vet + " ");
		}

	}

}
