package bloco03;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 14/10/2023
 * */
import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_09 {

	public static void main(String[] args) {
		/*leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e faça o reajuste salarial
		 * até 3 anos - aumento 3% | 3 - 10 anos - aumento 12.5% | +10 anos - aumento 20% */
		String nome, sobrenome;
		double salario, reajuste, reajusteSalarial, anosEmpresa;
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Reajuste salarial aos funcionários");
		nome = Teclado.lerTexto("\nDigite seu primeiro nome: ");
		sobrenome = Teclado.lerTexto("Digite seu sobrenome: ");
		salario = Teclado.lerDouble("Qual seu salário atual: ");
		anosEmpresa = Teclado.lerDouble("Quantos anos de empresa: ");
		System.out.print("Funcionário: "+nome+" "+sobrenome+".");
		System.out.print("\nSalário atual: R$"+salario+".");
		System.out.println("\nAnos de empresa: "+anosEmpresa+" anos.");
			if(anosEmpresa <= 3) {
				reajuste = (salario * 3) / 100;
				reajusteSalarial = reajuste + salario;
				System.out.println("\nReajuste salarial: R$"+formatador.format(reajusteSalarial));
				System.out.println("\nReajuste de "+formatador.format(reajuste)+", 3% do salário atual.");
			}
			else if(anosEmpresa >= 3 && anosEmpresa <= 10) {
				reajuste = (salario * 12.5) / 100;
				reajusteSalarial = reajuste + salario;
				System.out.println("\nReajuste salarial: R$"+formatador.format(reajusteSalarial));
				System.out.println("\nReajuste de R$"+formatador.format(reajuste)+", 12,5% do salário atual.");
			}
			else if(anosEmpresa > 10) {
				reajuste = (salario * 20) / 100;
				reajusteSalarial = reajuste + salario;
				System.out.println("\nReajuste salarial: R$"+formatador.format(reajusteSalarial));
				System.out.println("\nReajuste de R$"+formatador.format(reajuste)+", 20% do salário atual.");
			}
	}

}
