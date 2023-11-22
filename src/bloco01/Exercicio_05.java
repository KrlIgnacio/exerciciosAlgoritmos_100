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
public class Exercicio_05 {

	public static void main(String[] args) {
		// leia as duas notas de um aluno em uma mat�ria e calcule a m�dia
		
		//variaveis em double pois nem sempre uma nota tem valor inteiro
		double nota1, nota2, media;
		System.out.println("Ol� aluno, vamos calcular a sua m�dia!");
		Scanner nota = new Scanner(System.in);
		System.out.println("Escreva a mat�ria: ");
		String materia = nota.next();
		System.out.print("Digite o seu N1: ");
		nota1 = nota.nextDouble();
		System.out.println("Digite o seu n2: ");
		nota2 = nota.nextDouble();
		DecimalFormat formatadorMedia = new DecimalFormat("#0.00");
		media = (nota1 + nota2) / 2;
		System.out.println("Sua m�dia na disciplina de "+materia+" �: "+ formatadorMedia.format(media)+".");
		
		
		nota.close();
	}

}
