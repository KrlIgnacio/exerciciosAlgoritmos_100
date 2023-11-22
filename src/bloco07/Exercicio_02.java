package bloco07;

import java.text.DecimalFormat;
import java.util.Scanner;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 03/11/2023
 * */
public class Exercicio_02 {
		static Scanner sc = new Scanner(System.in);
		static DecimalFormat formatador = new DecimalFormat("#0.00");
	public static void main(String[] args) {
		//Leia várias idades e no final mostre: Quantas idades digitadas | a media | quantos tem 21 ou +
		int cont=0, idade21=0, soma=0, mediaIdade, contIdade=0, idade;
		char continuar;
		boolean flag = false;
		System.out.println("-------------------------------");
		System.out.println("     CADASTRO DE IDADES");
		System.out.println("-------------------------------");
		do {
		cont++;
		System.out.println(cont+ "° Cadastro:\n");
		idade = Teclado.lerInt("Digite a sua idade: ");
		System.out.println("Desejas continuar? (s/n)");
		continuar = sc.next().charAt(0);
		if(continuar == 'n'|| continuar == 'N') {
			flag = true;
		}
		soma+=idade;
		mediaIdade = soma / cont;
		if(idade >= 21) {
			idade21++;
		}
		contIdade++;
		}while(!flag);
		 
		System.out.println("Foram "+contIdade+" idades cadastradas.");
		System.out.println("A média das idades: "+formatador.format(mediaIdade));
		System.out.println("Pessoas com 21 anos ou mais: "+idade21);
		sc.close();
	}

}
