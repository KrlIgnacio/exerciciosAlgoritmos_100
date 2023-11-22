package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 21/11/2023
 * */
import util.Teclado;

public class Exercicio_06 {
	// Função cálculo média:
	static double Media(double a, double b) {
		return (a + b) / 2;
	}

	public static void main(String[] args) {
		// Crie uma função média - ler duas notas
		double nota1, nota2;
		System.out.println("Cálculo média aluno: ");
		nota1 = Teclado.lerDouble("Digite sua n1: ");
		nota2 = Teclado.lerDouble("Digite sua n2: ");
		double media = Media(nota1, nota2);
		System.out.println("Média: " + media);
	}

}
