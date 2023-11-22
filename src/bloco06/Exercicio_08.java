package bloco06;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 03/11/2023
 * */
import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_08 {

	public static void main(String[] args) {
		// Leia a idade de alunos e mostre a media, digite 999 para encerra o loop
		int idade, cont=0, somaIdade=0, qtdAlunos=0;
		int media=0;
		boolean flag = false;
		DecimalFormat ft = new DecimalFormat("#0.00");
		System.out.println("-------------------------------");
		System.out.println("     CADASTRO DE ALUNOS");
		System.out.println("-------------------------------");
			while(!flag) {
				System.out.println((cont+1)+"° aluno:");
				idade = Teclado.lerInt("Digite a sua idade: (999 p/ parar)");
				//saindo do loop
				if(idade == 999) {
					flag = true;
				}
				//somando as idades
				else {
					somaIdade += idade;					
				}
				//calculo media
				if(cont > 0) {
					media = somaIdade / cont;		
					qtdAlunos++;
				}
				cont++;
			}
			System.out.println("Média das idades: "+ft.format(media));
			System.out.println("Quantidade de alunos: "+qtdAlunos);
				

	}

}
