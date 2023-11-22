package bloco06;
/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 02/11/2023
 * */
import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		//Leia o sexo e salario de varios funcionarios e mostre o total de salario de homens e mulheres
		//sempre pergunte se o usuário desejas continuar
		char genero;
		char continuar = 0;
		double salario, totalSalHomens=0, totalSalMulheres=0;
		int cont=0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
			while(!flag) {
				cont++;
				System.out.println("Funcionário número "+cont+":");
				System.out.println("Digite seu genero: (f/m)");
				genero = sc.next().charAt(0);
				System.out.print("Digite seu salário: R$");
				salario = sc.nextDouble();
				if (genero == 'm' || genero == 'M') {
					totalSalHomens+= salario;
				}else if (genero == 'f' || genero == 'F') {
					totalSalMulheres+=salario;
				}else {
					System.out.println("Gênero inválido!!");
					
				}
				System.out.println("Desejas continuar? (s/n)");
				continuar = sc.next().charAt(0);
				if(continuar == 'n'|| continuar == 'N') {
					flag = true;	
				}else if(continuar == 's'|| continuar == 'S') {
					continue;
				}else {
					System.out.println("Opção inválida!");
				}
				
			}
			sc.close();

			System.out.println("Total salário homens: "+totalSalHomens);
			System.out.println("Total salário mulheres: "+totalSalMulheres);
	}

}
