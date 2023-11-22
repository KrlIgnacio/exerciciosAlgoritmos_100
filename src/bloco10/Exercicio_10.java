package bloco10;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 21/11/2023
 * */
import util.Teclado;

public class Exercicio_10 {
	static double Media(double a, double b) {
		return (a + b) / 2;
	}
	//retorna String " " - parametro var double (media)
	static String Situacao(double a) {
		if (a < 5) {
			return "Reprovado!";
		} else if ((a > 5) && (a < 7)) {
			return "Recupera��o!";
		} else {
			return "Aprovado!";
		}
		//a -> media do aluno
	}

	public static void main(String[] args) {
		// fun��o M�dia e fun��o Situacao
		double nota1, nota2;
		System.out.println("C�lculo m�dia aluno: ");
		nota1 = Teclado.lerDouble("Digite sua n1: ");
		nota2 = Teclado.lerDouble("Digite sua n2: ");
		double media = Media(nota1, nota2);
		System.out.println("M�dia: " + media);
		System.out.println(" ");
		//fun��o recebe a m�dia como parametro
		String r = Situacao(media);
		//imprimindo situa��o do aluno
		System.out.println("Situa��o aluno: " + r);

	}

}
