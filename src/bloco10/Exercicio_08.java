package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 21/11/2023
 * */
import util.Teclado;

public class Exercicio_08 {
	static int SuperSomador(int a, int b, int sm) {
		for (int i = a; i <= b; i++) {
			sm += i;
		}
		return sm;
	}//valor inicial do for -> v1 | valor final -> v2 
	//retorna a soma de v1 até o v2

	public static void main(String[] args) {
		// função super somador(utilizando um contator
		int v1, v2, soma = 0;
		System.out.println("Super Somador: ");
		v1 = Teclado.lerInt("Digite um valor: ");
		v2 = Teclado.lerInt("Digite um segundo valor: ");
		int r = SuperSomador(v1, v2, soma);
		System.out.println("Super Somador: " + r);
	}

}
