package bloco06;

import java.util.Scanner;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 31/10/2023
 * */
public class Exercicio_03 {

	public static void main(String[] args) {
		/*leia a idade e sexo de 5 pessoas e mostre: quantas mulheres e homens foram cadastradas, 
		 * quantos mulheres > 20, a media dos 5 e a medias dos homens*/
		int idade;
		char sexo;
		int contador = 1,maiorQ20=0, somaIdade =0;
		double mediaIdade =0;
		int contadorMulher = 0, contadorHomem=0;
		int somaHomem=0, mediaHomem=0;
		Scanner sc = new Scanner(System.in);
			while(contador <= 5) {
				System.out.println("- Pessoa número "+contador);
				System.out.print("\nDigite a sua idade?");
				idade = sc.nextInt();
				System.out.print("Digite seu sexo?(F/M)");
				sexo = sc.next().charAt(0);
				
				//condição sexo fem > que 20
				if(sexo =='f' || sexo == 'F') {
					if(idade > 20) {
						maiorQ20++;
					}
					contadorMulher++;
				}
				if(sexo == 'm' || sexo == 'M') {
					contadorHomem++;
					 somaHomem += idade;
					 mediaHomem = somaHomem / contadorHomem;
					
				}
				//calculo média do grupo
				somaIdade += idade;
				mediaIdade = somaIdade / 5;
				contador++;
				
			}
		
			System.out.println("\nA média de idade do grupo é "+mediaIdade);
			System.out.println("\n"+contadorMulher+" mulheres foram cadastradaas.");
			System.out.println("\n"+contadorHomem+" homens foram cadastrados.");
			System.out.println("\n"+maiorQ20+" mulheres maiores que 20 anos.");
			System.out.println("\nA média de idade dos homens é "+mediaHomem);
			
			sc.close();
	}

}
