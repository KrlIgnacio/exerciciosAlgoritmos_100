package bloco01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 10/10/2023
 *  
 * */

public class Exercicio_03 {

	public static void main(String[] args) {
		// e leia o nome, mês e o salário de um funcionário
		
		//variaveis
		String nome,sobrenome, mes, ano;
		double salario;
		//classe objeto que armazena os dados do usuário
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Olá,caro funcionário,qual seu nome?");
		nome = teclado.next();
		System.out.print(nome+ ", seu sobrenome?");
		sobrenome = teclado.next();
		System.out.print("Em qual ano estamos?");
		ano = teclado.next();
		System.out.print("Em qual mês do ano estamos?");
		mes = teclado.next();
		System.out.print(nome +",qual seu salário?");
		salario = teclado.nextDouble();
		System.out.println("  ");
		System.out.println("O funcionário "+ nome +" " +sobrenome +" tem um salário de "+ formatador.format(salario)+ " em "+mes+ " de "+ano);
		
		teclado.close();

	}

}
