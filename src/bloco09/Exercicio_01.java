package bloco09;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import java.util.ArrayList;
import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_01 {
	static DecimalFormat df = new DecimalFormat("##.##");

	public static void main(String[] args) {
		// vetors -> idade de 8 pessoas
		int[] vetorIdade = new int[8];
		int idade = 0, soma = 0, maiorIdade = Integer.MIN_VALUE;// menor valor possível
		double mediaIdade = 0;
		// armazenando as oito idades
		for (int i = 0; i < vetorIdade.length; i++) {
			idade = Teclado.lerInt("Digite uma " + (i + 1) + "° idade:");
			vetorIdade[i] = idade;
			// atribuindo a maior idade digitada a maiorIdade
			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
		}
		// lista posicao maior idade(pode haver repetições da maior idade)
		ArrayList<Integer> posicaoMI = new ArrayList<Integer>();
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] == maiorIdade) {
				posicaoMI.add(i);
			}
		}
		// somando as idades
		for (int cont = 0; cont < vetorIdade.length; cont++) {
			soma += vetorIdade[cont];
		}
		// calculo média das idades -> soma / 8
		mediaIdade = soma / vetorIdade.length;
		System.out.print("\nIdades digitadas: ");
		// for para mostrar as idades digitadas
		for (int v : vetorIdade) {
			System.out.print(v + " ");
		}
		System.out.println(" ");
		// arraylist para armazenar as posições - mais de 25 anos
		ArrayList<Integer> mais25 = new ArrayList<Integer>();
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] > 25) {
				mais25.add(i);
			}
		}

		System.out.println("Média das idades: " + df.format(mediaIdade));
		System.out.print("\nPosição com mais de 25 anos: " + mais25);
		System.out.println("\nMaior idade digitada: " + maiorIdade);
		System.out.print("Posição maior idade: " + posicaoMI);
	}

}
