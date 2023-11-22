package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 07/11/2023
 * */
import java.util.Arrays;

public class Exercicio_01 {

	public static void main(String[] args) {
		// Array com 8 posições com o valor 999
		
		int vetor999[] = new int [8];
		//preenchendo todas as posições com 999
		Arrays.fill(vetor999, 999);
		
		for(int vetor : vetor999) {
			System.out.print(vetor + " ");
		}
		
	}

}
