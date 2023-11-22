package bloco06;

import java.util.Scanner;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 02/11/2023
 * */
public class Exercicio_09 {
		static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*Leia sexo e idade de varias pessoas e mostre maior idade lida | quantos homens cadastrados
		a idade da mulher mais jovem |media de idade dos homens*/
		char sexo;
		char continuar;
		int idade, contHomens=0, cont=0;
		int maiorIdadeLida = 0;
		int mulherJovem = Integer.MAX_VALUE;
		double mediaIdadeHomens=0;
		int somaIdade=0;
		boolean flag = false;
		System.out.println("-------------------------------");
		System.out.println("     CADASTRO DE PESSOAS");
		System.out.println("-------------------------------");
			while(!flag) {
				cont++;
				System.out.println(cont+"° Pessoa:");
				System.out.println("Digite seu sexo:(f/m)");
				sexo = sc.next().charAt(0);
				System.out.println("Digite sua idade:");
				idade = sc.nextInt();
				System.out.println("Desejas continuar? (s/n)");
				continuar = sc.next().charAt(0);
				if(sexo == 'm'|| sexo == 'M') {
					contHomens++;
				}else if(sexo == 'f'|| sexo == 'F') {
					if(idade < mulherJovem) {
						mulherJovem = idade;
					}
				}
				if(idade > maiorIdadeLida) {
					maiorIdadeLida = idade;
				}
				if(contHomens>0) {
					somaIdade += idade;
					mediaIdadeHomens = (double) somaIdade / contHomens;
				}
				
				if(continuar == 'n'|| continuar == 'N') {
					flag = true;
				}else if(continuar == 's'|| continuar == 'S') {
					continue;
				}
			}
			
			sc.close();
			System.out.println("Homens cadastrados: "+contHomens);
			System.out.println("Média de idade dos homens:"+mediaIdadeHomens);
			System.out.println("Maior idade lida:"+maiorIdadeLida);
			System.out.println("Idade da mulher mais jovem: "+mulherJovem);
	}

}
