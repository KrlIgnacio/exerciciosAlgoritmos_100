package bloco04;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/10/2023
 * */

import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_04 {

	public static void main(String[] args) {
		/* Calculo do IMC(Já fiz esse exercício com o Prof José de Assis)
		
		TABELA IMC ATUAL: IMC < 18.5 abaixo do peso | IMC 18.5 < 25 peso ideal
		IMC 25 < 30 sobrepeso |IMC 30 < 35 Obesidade Grau I | IMC 35 < 40 Obesidade Grau II
		IMC > 40 Obesidade Mórbida */
		
		double peso, altura, imc;
		System.out.println("CÁLCULO DE ÍNDICE DE MASSA CORPORAL");
		peso = Teclado.lerDouble("\nDigite o seu peso: ");
		altura = Teclado.lerDouble("Digite sua altura: ");
		//calculo imc
		imc = peso / (altura * altura);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("\nPeso: "+peso+"kg.");
		System.out.println("Altura: "+formatador.format(altura)+"m.");
		System.out.println("IMC: "+formatador.format(imc)+".");
		System.out.println(" ");
			
			//condição menor que 18,5 -> abaixo do  peso
			if(imc < 18.5){
				System.out.println("IMC: ABAIXO DO PESO.");
			} 
			else if(imc < 25){
				System.out.println("IMC: PESO IDEAL.");
			} 
			else if(imc < 30 ){
				System.out.println("IMC: SOBREPESO.");
			} 
			else if(imc < 35) {
				System.out.println("IMC: OBESIDADE GRAU I.");
			}
			else if(imc < 40) {
				System.out.println("IMC: OBESIDADE GRAU II.");
			} 
			//imc 40 ou mais -> obesidade mórbida
			else {
				System.out.println("IMC: OBESIDADE MÓRBIDA.");
			}
	}

}
