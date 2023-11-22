package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 12/10/2023
 * */
import util.Teclado;

public class Exercicio_02 {

	public static void main(String[] args) {
		//leia o ano de nascimento de um rapaz e mostre a sua relação ao alistamento militar
		//mostre quantos anos faltam ou quantos anos passou do alistamento
		int anoNasc, idade, anoAtual, alistamento;
		System.out.println("	ALISTAMENTO MILITAR");
		System.out.println("___________________________________");
		anoNasc = Teclado.lerInt("\nQual o ano de seu nascimento?");
		anoAtual = Teclado.lerInt("Qual o ano atual?");
		idade = anoAtual - anoNasc;
		System.out.println("Sua idade é: "+idade);
			if(idade < 18) {
				alistamento = 18 - idade;
				System.out.println("Daqui "+alistamento+" ano(s), você terá que se alistar.");
			}
			else if(idade > 18) {
				alistamento = idade - 18;
				System.out.println("Faz "+alistamento+" ano(s) que passou seu período de alistamento.");
			}
	}

}
