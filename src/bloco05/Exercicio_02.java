package bloco05;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 17/10/2023
 * */
import util.Teclado;

public class Exercicio_02 {

	public static void main(String[] args) {
		//Pergunte ao usuário um valor inteiro e positivo e mostre a contagem até o valor digitado
		System.out.println("Contagem de números");
		int numero;
		numero = Teclado.lerInt("Digite um valor: ");
		int i = 1;
			while (i <= numero) {
				System.out.print(" "+i);
				i++;
			}

	}

}
