package bloco02;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 11/10/2023
 * */
public class Exercicio_04 {

	public static void main(String[] args) {
		/* Locadora de carros: a locação custa a R$90 por dia e R$0,20 por Km rodado
		pergunte a quantidade de km rodados e a qtd de dias ao qual o carro foi alugado*/
		
		//variaveis 
		double totalPagar, kmRodado, qtdDias;
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");
		System.out.println("	PAGAMENTO LOCAÇÃO DE VEÍCULO");
		System.out.println("__________________________________________");
		System.out.print("\nInforme a quantidade de dias alugados: ");
		qtdDias = sc.nextDouble();
		System.out.print("Informe os Kilômetros rodados: ");
		kmRodado = sc.nextDouble();
		qtdDias = qtdDias * 90;
		System.out.println("\nValor dos dias usados R$: "+qtdDias);
		kmRodado = kmRodado * 0.20;
		System.out.println("Valor dos km rodados R$: "+kmRodado);
		totalPagar = qtdDias + kmRodado;
		System.out.println("\nValor total a pagar R$: "+format.format(totalPagar));
		sc.close();
	}

}
