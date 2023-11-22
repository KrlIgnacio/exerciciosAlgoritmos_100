package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
import java.util.Random;

public class Exercicio_06 {

	public static void main(String[] args) {
		//vetor com 7 números gerados aleatroriamente pelo computador
		int []vetAleatorio = new int [7];
		for (int i =0; i<7; i++) {
			//instanciando a classe Random para gerar numeros aleatorios
			Random aleatorio = new Random();
			vetAleatorio[i] = aleatorio.nextInt(999 + 1);//gerando numeros de 0 a 999
		}
		//imprimindo o vetor
		for(int vet : vetAleatorio) {
			System.out.print(vet + " ");
		}
	}

}
