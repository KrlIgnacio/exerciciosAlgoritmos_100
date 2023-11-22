package bloco02;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 12/10/2023
 * */
public class Exercicio_08 {

	public static void main(String[] args) {
		// leia o ano de nascimento de uma pessoa e calcule se ela pode votar ou não
		Scanner sc = new Scanner(System.in);
		int anoNasc, idade, anoAtual;
		System.out.print("Qual o ano de seu nascimento? ");
		anoNasc = sc.nextInt();
		System.out.println("Digite o ano ao qual estamos: ");
		anoAtual = sc.nextInt();
		idade = anoAtual - anoNasc;
		System.out.println("Você tem "+idade+" anos.");
			if(idade >= 18 && idade <= 70) {
				System.out.println("Voto é obrigatório!");
			}
			else if(idade >= 16 && idade < 18 || idade > 70) {
				System.out.println("Voto facultativo!");
			}
			else {
				System.out.println("Por lei, ainda não tem idade permitida para votar!");
			}
		sc.close();

	}

}
