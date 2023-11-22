package bloco05;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/10/2023
 * */
public class Exercicio_07 {

	public static void main(String[] args) {
		// Crie um laço entre os valores 500 a 0(de 50 em 50) e mostre o somatório
		int numero = 500;
		int soma = 0;
			while(numero >= 0) {
				System.out.print(" "+numero);
				soma+= numero;
				numero-= 50;
			}
			
			System.out.println("\nResultado do somatório do laço: "+soma);
	}

}
