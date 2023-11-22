package bloco08;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
import java.util.Random;

import util.Teclado;

public class Exercicio_10 {

	public static void main(String[] args) {
		// -> vetor de 30 posições com números sorteados(entre 1 e 15)
		/*
		 * usuario deve digitar um valor a ser mostrado em qual posicao encontra - se e
		 * quantas vezes foi sorteado
		 */
		int[] vetPosicoes = new int[30];
		int valor = 0, contP = 0;
		for (int i = 0; i < 30; i++) {
			Random aleatorio = new Random();
			vetPosicoes[i] = aleatorio.nextInt(15) + 1;
		}

		valor = Teclado.lerInt("Digite uma chave(valor): ");
		System.out.println(" ");
		for (int v : vetPosicoes) {
			System.out.print(v + " ");
		}
		System.out.println(" ");
		System.out.println("\nA chave está na posição:  ");
		for (int i = 0; i < 30; i++) {
			if (valor == vetPosicoes[i]) {
				contP++;
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		System.out.println("\nO valor " + valor + " foi sorteado: " + contP + " vezes");
	}

}
