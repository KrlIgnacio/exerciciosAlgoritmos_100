package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
import util.Teclado;

public class Exercicio_09 {

	public static void main(String[] args) {
		// vetor -> leia 10 números inteiros e mostre as posições dos pares:
		int [] vetorPares = new int [10];
		int num=0; 
		for (int i =0; i <10; i++) {
			num = Teclado.lerInt("Digite um "+(i+1)+ "°número: ");
			vetorPares[i] = num;
		}
		System.out.println("--------------------");
		for (int v : vetorPares) {
			System.out.print(v + " ");
		}
		System.out.println(" ");
		System.out.println("\nPosições com número par: ");
		//posicao é != tamanho do array
		//posicao 0 = primeiro valor, posicao 9 = último valor!
		for(int i =0; i<10; i++) {
			if(vetorPares[i] % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
