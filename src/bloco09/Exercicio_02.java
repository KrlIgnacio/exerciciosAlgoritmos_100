package bloco09;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import java.text.DecimalFormat;
import java.util.ArrayList;

import util.Teclado;

public class Exercicio_02 {
	static DecimalFormat df = new DecimalFormat("##.##");

	public static void main(String[] args) {
		// vetor -> ler notas de 10 alunos
		double nota = 0, soma = 0, mediaNota = 0, acimaMedia = 0, maiorNota = Integer.MIN_VALUE;
		double[] vetorNota = new double[10];
		// lendo os valores e atribuindo ao vetor
		for (int i = 0; i < vetorNota.length; i++) {
			nota = Teclado.lerDouble(i + 1 + "° aluno, digite sua nota: ");
			vetorNota[i] = nota;// armazenando a nota no vetor
			if (nota > maiorNota) {
				maiorNota = nota;
			}
		}
		// somando notas
		for (int i = 0; i < vetorNota.length; i++) {
			soma = soma + vetorNota[i];
		}
		// media das notas
		mediaNota = soma / vetorNota.length;
		// quantidade de alunos acima da média
		for (int i = 0; i < vetorNota.length; i++) {
			if (vetorNota[i] > mediaNota) {
				acimaMedia++;
			}
		}
		// array list para encontrar as posições da maior nota digitada
		ArrayList<Integer> posicaoMN = new ArrayList<Integer>();// tipo de dado inicial maiúscula
		for (int i = 0; i < vetorNota.length; i++) {
			if (vetorNota[i] == maiorNota) {
				posicaoMN.add(i);
			}
		}
		System.out.println("\nNotas dos alunos: ");
		// imprimindo o array vetorNota
		for (double v : vetorNota) {
			System.out.print(v + " - ");
		}
		System.out.println(" ");
		System.out.println("\nMédia nota dos alunos: " + df.format(mediaNota));
		System.out.println("Alunos acima da média: " + acimaMedia);
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Posições da maior nota: " + posicaoMN);

	}

}
