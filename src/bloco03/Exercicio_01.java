package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 12/10/2023
 * */
import util.Teclado;

public class Exercicio_01 {

	public static void main(String[] args) {
		// leia um determinado ano e mostre se ele � ou n�o BISSEXTO
		int ano;
		ano = Teclado.lerInt("Digite um ano e descubra se � bissexto ou n�o:");
			
			if((ano % 100 != 0 && ano % 4 == 0) || (ano % 400 == 0)) {
				System.out.println(ano+" � BISSEXTO");
			}
			
			else {
				System.out.println(ano+" N�O � BISSEXTO");
			}
	}	//para um ano ser bissexto ele precisa ser m�ltiplo de 4 ou de 400
		// detalhe: o ano 2000 � m�ltiplo de 100 mas tamb�m � m�ltiplo de 4 e 400, logo, � um ano bissexto!
		//anos centen�rios n�o s�o bissexto

}
