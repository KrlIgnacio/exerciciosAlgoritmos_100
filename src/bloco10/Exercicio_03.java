package bloco10;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 18/11/2023
 * */
public class Exercicio_03 {
	public static void Contador(int inicio, int fim, int cont) {
		System.out.println("Contador: ");
		for (int i = inicio; i < fim; i += cont) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// leia valor incial, final e incremento e guarde no contador e mostre na tela
		int vInicial, vFinal, incremento;
		vInicial = Teclado.lerInt("Digite um valor para o ÍNICIO: ");
		vFinal = Teclado.lerInt("Digite um valor para o FINAL: ");
		incremento = Teclado.lerInt("Digite um valor para o INCREMENTO: ");
		System.out.println(" ");
		Contador(vInicial, vFinal, incremento);
	}
}
