package bloco02;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 11/10/2023
 * */
public class Exercicio_03 {
	
	public static void main(String[] args) {
		//leia o salário de um funcionário, calcule e mostre - o com 15% de aumento
		Scanner sc = new Scanner(System.in);
		double salario, aumentoSalarial, salarioFinal;
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Caro funcionário, digite seu salário R$: ");
		salario = sc.nextDouble();
		aumentoSalarial = salario * 15 / 100;
		salarioFinal = aumentoSalarial + salario;
		System.out.println("Você recebeu um aumento salarial de 15%.");
		System.out.println("Salário atual R$: "+formatador.format(salarioFinal));
		
		
		sc.close();

	}

}
