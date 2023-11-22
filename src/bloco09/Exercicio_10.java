package bloco09;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import util.Teclado;

public class Exercicio_10 {
	public static void Somador(int a, int b) {

		System.out.println("Soma entre os valores: " + (a + b));

	}

	public static void main(String[] args) {
		// procedimento que some dois valores digitados pelo usuário
		int valor1, valor2;
		valor1 = Teclado.lerInt("Digite um primeiro valor: ");
		valor2 = Teclado.lerInt("Digite um segundo valor: ");
		Somador(valor1, valor2);

	}

}
