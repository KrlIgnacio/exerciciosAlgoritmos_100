package bloco04;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/10/2023
 * */

import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_03 {

	public static void main(String[] args) {
		//empréstimo bancário de imóvel(casa): pergunte o valor da casa, o salário e em quantos anos vai pagar
		//Calcule o valor da prestação mensal, caso a prestação exceda 30% do salário o empréstmo é negado.
		double salario, anosPag, prestacaoMensal, valorImovel, trintaPorCento_Salario;
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Empréstimo bancário: CASA\n");
		valorImovel = Teclado.lerDouble("Qual o valor do Imóvel?");
		salario = Teclado.lerDouble("Digite o seu salário: ");
		anosPag = Teclado.lerDouble("Em quantos anos deseja quitar o empréstimo?");
		//calculo para descobrir a prestação
		prestacaoMensal = valorImovel / (12 * anosPag); 
		// 12 meses X a quantidade de anos -> o resultado se divide pelo valor do ímovel
		
		//calculo 30% do Salário
		trintaPorCento_Salario = (salario * 30) / 100;
			//condição para negar o empréstimo
			if(prestacaoMensal > trintaPorCento_Salario) {
				System.out.println("\nEMPRÉSTIMO NEGADO!");
				System.out.println("Prestação Mensal R$: "+formatador.format(prestacaoMensal));
				System.out.println("O valor da prestação excedeu 30% do salário.");
			}
			else {
				System.out.println("\nEMPRÉSTIMO APROVADO!");
				System.out.println("Você está pronto para ter a casa própria.");
				System.out.println("Prestação Mensal R$: "+formatador.format(prestacaoMensal));
			}

	}

}
