package bloco09;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import java.util.Scanner;

public class Exercicio_04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// ler nome e idade de 9 pessoas e guardar em 2 vetores
		String[] vetorNome = new String[9];
		int[] vetorIdade = new int[vetorNome.length];

		for (int i = 0; i < vetorNome.length; i++) {
			System.out.println(i + 1 + "° pessoa, digite seu nome: ");
			vetorNome[i] = sc.nextLine();
			System.out.println("Digite sua idade:");
			vetorIdade[i] = sc.nextInt();
			sc.nextLine();
			System.out.println("  ");
		}
		// mostre os dados dos menores de 18 em uma lista (relacionada)
		System.out.println("\nPessoas menores de idade: ");
		for (int i = 0; i < vetorNome.length; i++) {
			if (vetorIdade[i] < 18) {
				System.out.println(vetorNome[i] + ", " + vetorIdade[i] + " anos.");
			}
		}
	}

}
