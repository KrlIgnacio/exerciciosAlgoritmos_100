package bloco02;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 12/10/2023
 * */
public class Exercicio_09 {

	public static void main(String[] args) {
		//  leia o nome e as duas notas de um aluno e calcule se ele teve um bom aproveitamento(media acima 7)
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		String nome, sobrenome;
		System.out.print("Caro aluno, qual seu nome? ");
		nome = sc.next();
		System.out.print("E seu sobrenome? ");
		sobrenome = sc.next();
		System.out.println("\nVamos descobrir se voc� teve um bom aproveitamento escolar");
		System.out.print("Digite sua primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
			if(media <= 7) {
				System.out.println("\nAluno,"+nome+" "+sobrenome+", voc� n�o teve um bom aproveitamento... ");
				System.out.println("Ter�s que fazer uma prova de recupera��o!");
				System.out.print("M�dia do aluno: "+media);
			}
			else {
				System.out.println("\nParab�ns,"+nome+ " "+sobrenome+" voc� tem um �timo aproveitamento!!");
				System.out.print("M�dia do aluno: "+media);
			}
		sc.close();

	}

}
