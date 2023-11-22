package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 21/11/2023
 * */
import util.Teclado;

public class Exercicio_07 {
	//Função que retorna o maior valor 
	static int Maior(int a, int b, int c) {
		if ((a >= b) && (a >= c)) {
			return a;
		} else if ((b >= a) && (b >= c)) {
			return b;
		} else if ((c >= a) && (c >= b)) {
			return c;
		}
		return 0;
	}

	public static void main(String[] args) {
		// Crie uma função Maior(){} - leia 3 valores
		int v1, v2, v3;
		v1 = Teclado.lerInt("Digite um valor: ");
		v2 = Teclado.lerInt("Digite um segundo valor: ");
		v3 = Teclado.lerInt("Digite um terceiro valor: ");
		System.out.println(" ");
		int r = Maior(v1, v2, v3);
		System.out.println("Valor maior: " + r);
	}

}
