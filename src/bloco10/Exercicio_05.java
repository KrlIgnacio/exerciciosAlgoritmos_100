package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 21/11/2023
 * */
import util.Teclado;

public class Exercicio_05 {
	static int Somador(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Crie uma fun��o de soma
		int num1, num2;
		num1 = Teclado.lerInt("Digite um n�mero: ");
		num2 = Teclado.lerInt("Digite um segundo n�mero: ");
		// chamando a fun��o soma
		int soma = Somador(num1, num2);
		System.out.println("Soma: " + soma);
	}

}
