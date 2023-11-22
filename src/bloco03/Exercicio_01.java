package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 12/10/2023
 * */
import util.Teclado;

public class Exercicio_01 {

	public static void main(String[] args) {
		// leia um determinado ano e mostre se ele é ou não BISSEXTO
		int ano;
		ano = Teclado.lerInt("Digite um ano e descubra se é bissexto ou não:");
			
			if((ano % 100 != 0 && ano % 4 == 0) || (ano % 400 == 0)) {
				System.out.println(ano+" É BISSEXTO");
			}
			
			else {
				System.out.println(ano+" NÃO É BISSEXTO");
			}
	}	//para um ano ser bissexto ele precisa ser múltiplo de 4 ou de 400
		// detalhe: o ano 2000 é múltiplo de 100 mas também é múltiplo de 4 e 400, logo, é um ano bissexto!
		//anos centenários não são bissexto

}
