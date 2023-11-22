package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import util.Teclado;

public class Exercicio_01 {
	public static void Maior(int v1, int v2) {
		if (v1 > v2) {
			System.out.println(v1 + " é maior que " + v2);
		} else if (v2 > v1) {
			System.out.println(v2 + " é maior que " + v1);
		} else {
			System.out.println("Valores iguais.");
		}
	}

	public static void main(String[] args) {
		// ler dois valor e os guardar em um procedimento
		// mostre qual o maior valor ou se são valores iguais
		int v1, v2;
		v1 = Teclado.lerInt("Digite um valor: ");
		v2 = Teclado.lerInt("Digite um segundo valor: ");
		System.out.println(" ");
		Maior(v1, v2);

	}

}
