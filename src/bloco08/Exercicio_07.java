package bloco08;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/11/2023
 * */
import java.util.Scanner;


public class Exercicio_07 {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// vetor -> ler 7 nomes e imprimi- los de forma inversa 
		String [] nomes = new String [7];
		
		for (int i =0; i <7; i++) {
			System.out.println("Digite " + (i+1)+ "° nome: ");
			String nome = sc.nextLine();
			nomes[i] = nome;
		}
		System.out.println("-----------------------------");
		//imprimindo os nomes de forma inversa ao qual foram digitados:
		for (int i =6; i >=0; i--) {
			System.out.println(nomes[i]);
			/*temos 7 posições de 0 a 7, logo,
			o indice 6 é o último valor(nome) digitado!
			o último valor é sempre:  tamanhoVetor - 1*/
			
		}
		}
	}


