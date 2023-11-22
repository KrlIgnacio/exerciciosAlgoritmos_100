package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import util.Teclado;

public class Exercicio_02 {
	public static void ParOuImpar(int valor) {
		if (valor % 2 == 0) {
			System.out.println("O valor " + valor + " é par!");
		} else {
			System.out.println("O valor " + valor + " é ímpar!");
		}
	}

	public static void main(String[] args) {
		// leia um valor inteiro e verifique no Procedimento se é Par ou Impar
		int valor;

		valor = Teclado.lerInt("Digite um valor: ");
		ParOuImpar(valor);
	}

}
