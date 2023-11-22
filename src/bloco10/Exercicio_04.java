package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
import util.Teclado;

public class Exercicio_04 {
	static void Fibonacci(int f) {
		int t1 = 0, t2 = 1, t3 = 1;
		for (int i = 0; i < f; i++) {
			// imprimindo o terceiro termo(1) - a sequencia começa com "1 1 ..."
			System.out.print(" " + t3);
			// calculando o terceiro termo
			t3 = t1 + t2;
			// 1° termo recebe 2° termo
			t1 = t2;
			// 2° termo recebe 3° termo
			t2 = t3;
			// loop gerando os elementos da sequencia de fibonacci
		}
	}

	public static void main(String[] args) {
		// leia um valor e guarde no procedimento para gerar a seguencia de fibonacci
		int valor;
		valor = Teclado.lerInt("Digite um parâmetro para a sequência de Fibonacci: ");
		System.out.println(" ");
		Fibonacci(valor);
	}

}
