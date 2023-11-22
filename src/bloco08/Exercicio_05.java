package bloco08;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 15/11/2023
 * */
public class Exercicio_05 {
	public static void main(String[] args) {
		// fa�a um vetor com os 15 primeiros termos da sequencia de Fibonacci
		int[] fibonacci = new int[15];
		int termo1 = 0, termo2 = 1;
		for (int i = 0; i < fibonacci.length; i++) {
			fibonacci[i] = termo2;
			// o proximo termo � a soma dos dois primeiros
			int termo3 = termo1 + termo2;
			// 0 = 1;
			termo1 = termo2;
			// 1 = pr�x. termo
			termo2 = termo3;

		}
		System.out.println("Sequ�ncia de Fibonacci: ");
		for (int sequencia : fibonacci) {
			System.out.print(sequencia + " ");
		}
	}
}
