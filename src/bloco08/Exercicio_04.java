package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
public class Exercicio_04 {

	public static void main(String[] args) {
		int [] vetor = new int [10];
		//preencher com os valores {5,3,5,3,5,3...}
		for (int i =0; i <10; i++) {
			if(i % 2 == 0) {
				vetor[i] = 5;
			}else {
				vetor[i] = 3;
			}
		}
		for(int n : vetor) {
			System.out.print(n + " ");
		}

	}

}
