package bloco04;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 15/10/2023
 * */

import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_03 {

	public static void main(String[] args) {
		//empr�stimo banc�rio de im�vel(casa): pergunte o valor da casa, o sal�rio e em quantos anos vai pagar
		//Calcule o valor da presta��o mensal, caso a presta��o exceda 30% do sal�rio o empr�stmo � negado.
		double salario, anosPag, prestacaoMensal, valorImovel, trintaPorCento_Salario;
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Empr�stimo banc�rio: CASA\n");
		valorImovel = Teclado.lerDouble("Qual o valor do Im�vel?");
		salario = Teclado.lerDouble("Digite o seu sal�rio: ");
		anosPag = Teclado.lerDouble("Em quantos anos deseja quitar o empr�stimo?");
		//calculo para descobrir a presta��o
		prestacaoMensal = valorImovel / (12 * anosPag); 
		// 12 meses X a quantidade de anos -> o resultado se divide pelo valor do �movel
		
		//calculo 30% do Sal�rio
		trintaPorCento_Salario = (salario * 30) / 100;
			//condi��o para negar o empr�stimo
			if(prestacaoMensal > trintaPorCento_Salario) {
				System.out.println("\nEMPR�STIMO NEGADO!");
				System.out.println("Presta��o Mensal R$: "+formatador.format(prestacaoMensal));
				System.out.println("O valor da presta��o excedeu 30% do sal�rio.");
			}
			else {
				System.out.println("\nEMPR�STIMO APROVADO!");
				System.out.println("Voc� est� pronto para ter a casa pr�pria.");
				System.out.println("Presta��o Mensal R$: "+formatador.format(prestacaoMensal));
			}

	}

}
