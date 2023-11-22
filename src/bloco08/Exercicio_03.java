package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
public class Exercicio_03 {

	public static void main(String[] args) {
		// array com 10 posições de {9.....0}
		int [] vetorRegressivo = new int [10];
		
		for(int i = 9; i>=0; i--) {
			/*i = índice, ou seja, a expressão abaixo seria:
			 * vetorRegressivo[9 - 9] = i -> 0 = i;*/
			vetorRegressivo[9 - i] = i;
		}
		for (int vet : vetorRegressivo) {
			System.out.print(vet + " ");
		}
	}

}
