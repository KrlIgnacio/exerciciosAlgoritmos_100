package bloco10;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
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
			return "Recuperação!";
		} else {
			return "Aprovado!";
		}
		//a -> media do aluno
	}

	public static void main(String[] args) {
		// função Média e função Situacao
		double nota1, nota2;
		System.out.println("Cálculo média aluno: ");
		nota1 = Teclado.lerDouble("Digite sua n1: ");
		nota2 = Teclado.lerDouble("Digite sua n2: ");
		double media = Media(nota1, nota2);
		System.out.println("Média: " + media);
		System.out.println(" ");
		//função recebe a média como parametro
		String r = Situacao(media);
		//imprimindo situação do aluno
		System.out.println("Situação aluno: " + r);

	}

}
