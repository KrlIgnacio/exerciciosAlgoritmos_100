package bloco07;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 03/11/2023
 * */
public class Exercicio_10 {

	public static void main(String[] args) {
		// Em um laço mostre os 10 primeiros elementos da Sequencia de Fibonacci
		int anterior=0, atual=1, proximo=1;
		
		for(int i = 1; i<=10; i++) {
			//imprimindo o primeiro valor(1) de fibonacci
			System.out.print(" "+proximo);
			//1 = 0 + 1 -> 1 
			proximo = anterior + atual;
			//0 = 1
			anterior = atual;
			//1 = proximo
			atual = proximo;
			//loop até 10
		}
			
		}

}
