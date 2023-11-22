package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 15/11/2023
 * */
import util.Teclado;

public class Exercicio_09 {

	public static void main(String[] args) {
		// vetor -> leia 10 n�meros inteiros e mostre as posi��es dos pares:
		int [] vetorPares = new int [10];
		int num=0; 
		for (int i =0; i <10; i++) {
			num = Teclado.lerInt("Digite um "+(i+1)+ "�n�mero: ");
			vetorPares[i] = num;
		}
		System.out.println("--------------------");
		for (int v : vetorPares) {
			System.out.print(v + " ");
		}
		System.out.println(" ");
		System.out.println("\nPosi��es com n�mero par: ");
		//posicao � != tamanho do array
		//posicao 0 = primeiro valor, posicao 9 = �ltimo valor!
		for(int i =0; i<10; i++) {
			if(vetorPares[i] % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
