package bloco01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 10/10/2023
 *  
 * */

public class Exercicio_03 {

	public static void main(String[] args) {
		// e leia o nome, m�s e o sal�rio de um funcion�rio
		
		//variaveis
		String nome,sobrenome, mes, ano;
		double salario;
		//classe objeto que armazena os dados do usu�rio
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Ol�,caro funcion�rio,qual seu nome?");
		nome = teclado.next();
		System.out.print(nome+ ", seu sobrenome?");
		sobrenome = teclado.next();
		System.out.print("Em qual ano estamos?");
		ano = teclado.next();
		System.out.print("Em qual m�s do ano estamos?");
		mes = teclado.next();
		System.out.print(nome +",qual seu sal�rio?");
		salario = teclado.nextDouble();
		System.out.println("  ");
		System.out.println("O funcion�rio "+ nome +" " +sobrenome +" tem um sal�rio de "+ formatador.format(salario)+ " em "+mes+ " de "+ano);
		
		teclado.close();

	}

}
