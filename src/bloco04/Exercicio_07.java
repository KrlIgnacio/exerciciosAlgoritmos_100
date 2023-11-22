package bloco04;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/10/2023
 * */
import java.util.Scanner; //classe Scanner para o tipo de dado Char 

import util.Teclado;
 

public class Exercicio_07 {

	public static void main(String[] args) {
		/*Empresa fará reajuste salarial: MULHERES -> < 15 anos de empresa: 5% | 15 a 20 anos: 12% | > 20: 23%
		 * HOMENS -> < 15 anos de empresa: 3% | 15 a 30 anos: 13% | > 30 anos: 25%*/
			
			System.out.println("REAJUSTE SALARIAL:");
			double salarioAtual, reajuste, salarioFinal, anosEmpresa;
			char genero;
			Scanner sc = new Scanner(System.in);
			System.out.println("\nQual seu gênero? \nF.Feminino \nM.Masculino");
			genero = sc.next().charAt(0);
				
					if(genero == 'f' || genero == 'F') {
						salarioAtual = Teclado.lerDouble("Qual seu salário atual? \nR$:");
						anosEmpresa = Teclado.lerDouble("Quantos anos de empresa? ");
							if(anosEmpresa < 15) {
								reajuste = (salarioAtual * 5) / 100;
								salarioFinal = salarioAtual + reajuste;
								System.out.println("Salário reajustado: \nR$: "+salarioFinal);
							} else if(anosEmpresa >= 15 && anosEmpresa <= 20) {
								reajuste = (salarioAtual * 12) / 100;
								salarioFinal = salarioAtual + reajuste;
								System.out.println("Salário reajustado: \nR$: "+salarioFinal);
							} else if(anosEmpresa > 20) {
								reajuste = (salarioAtual * 23) / 100;
								salarioFinal = salarioAtual + reajuste;
								System.out.println("Salário reajustado: \nR$: "+salarioFinal);
							}
					}
					else if(genero == 'm' || genero == 'M') {
						salarioAtual = Teclado.lerDouble("Qual seu salário atual? ");
						anosEmpresa = Teclado.lerDouble("Quantos anos de empresa? ");
							if(anosEmpresa < 15) {
								reajuste = (salarioAtual * 3) / 100;
								salarioFinal = salarioAtual + reajuste;
								System.out.println("Salário reajustado: \nR$: "+salarioFinal);
							} else if(anosEmpresa >= 15 && anosEmpresa <= 30) {
								reajuste = (salarioAtual * 13) / 100;
								salarioFinal = salarioAtual + reajuste;
								System.out.println("Salário reajustado: \nR$: "+salarioFinal);
							} else if(anosEmpresa > 30) {
								reajuste = (salarioAtual * 25) / 100;
								salarioFinal = salarioAtual + reajuste;
								System.out.println("Salário reajustado: \nR$: "+salarioFinal);
							}
					}
					else {
						System.out.println("DIGITE UMA OPÇÃO VÁLIDA!");
					}
			sc.close();
	}

}
