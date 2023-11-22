package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
public class Exercicio_02 {

	public static void main(String[] args) {
		// preencher automaticamente {5,10,15,20,25,30,35,40,45,50}
		
		int []ate50 = new int [10];

			//loop for para preencher o array com os valores pedido
			for (int i =0; i <10; i++) {
				/*o i representa o índice do array, ou seja, 5 + (5 x 0) = 5
				 *e assim por diante, sendo o indice 9 -> 5 + (5 x 9) = 50. 
				 */
				ate50[i] = 5 + (5 * i); 
			}
			//imprimindo o array 
			for(int meuVet : ate50) {
				System.out.print(meuVet+" ");
			}
	}

}
