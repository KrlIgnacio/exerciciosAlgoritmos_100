package bloco06;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 03/11/2023
 * */
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		//Leia Nome idade sexo e mostre: Nome do mais jovem | Nome da mulher mais Jovem | Media do grupo
		//Quantos homens > 30 anos | Quantas mulheres < 18 | Pergunte sempre se o usuário desejas continuar
		String nome, nomeJovem = "", mulherMaisJovem="";
		char sexo;
		char continuar;
		int idade, mediaGrupo=0, homens30=0, mulheres18=0, cont=0;
		int mulherJovem=Integer.MAX_VALUE, pessoaJovem=Integer.MAX_VALUE;	
		boolean flag = false;
		int soma = 0;
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("--------------------------------------");
		 	System.out.println("      CADASTRO DE PESSOAS");
		 	System.out.println("--------------------------------------");
			
		 	while(!flag) {
				System.out.println(     cont+1+"° CADASTRO:     \n");
				System.out.println("Digite seu nome completo: ");
				nome = sc.nextLine();
				
				System.out.println("Digite seu sexo: (f/m)");
				sexo = sc.next().charAt(0);
				sc.nextLine();// Consuma a quebra de linha pendente
				
				System.out.println("Digite sua idade: ");
				idade = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Desejas continuar? (s/n)");
				continuar = sc.next().charAt(0);
				sc.nextLine();
				
				if(continuar == 'n' || continuar == 'N') {
					flag = true;
				}
				
				soma+=idade;
				
				if(sexo == 'm'|| sexo == 'M') {
					if(idade > 30) {
						homens30++;
					}
				}else if(sexo == 'f'|| sexo == 'F') {
					if(idade < 18) {
						mulheres18++;
						//mulher mais jovem entre as mulheres cadastradas 
					}else if(idade < mulherJovem) {
						mulherJovem = idade;
						mulherMaisJovem = nome;
					}
				}
				//atribuindo a idade mais jovem ao nome da pessoa correspondente
				if(idade < pessoaJovem) {
					//tipo int com tipo int
					pessoaJovem = idade;
					//tipo string com tipo string
					nomeJovem = nome;	
				}
				
				cont++;				
				
			}
			mediaGrupo = soma / cont;
			System.out.println("Mulher mais jovem do grupo: "+mulherMaisJovem);
			System.out.println("Pessoa mais jovem: "+nomeJovem);
			System.out.println("Média de idade do grupo: "+mediaGrupo);
			System.out.println("Homens com mais de 30 anos: "+homens30);
			System.out.println("Mulheres com menos de 18 anos: "+mulheres18);
		sc.close();
	}

}
