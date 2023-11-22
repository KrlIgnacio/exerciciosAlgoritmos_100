package bloco10;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 21/11/2023
 * */
import java.text.DecimalFormat;

import util.Teclado;

public class Exercicio_09 {
	static double Potencia(double base, double expoente) {
		double resultado = 1;
		// caso expoente negativo
		if (expoente < 0) {
			base = 1 / base;
			expoente = -expoente;
		}
		for (int i = 0; i < expoente; i++) {
			resultado *= base;
			// durante cada iteração a base é multiplicada pelo resultado
		}
		return resultado;
	}

	public static void main(String[] args) {
		// Função potencia - leia valor para a base
		DecimalFormat df = new DecimalFormat("##.##");
		double base, exp;
		base = Teclado.lerInt("Digite o valor da base: ");
		exp = Teclado.lerInt("Digite o valor do expoente: ");
		double r = Potencia(base, exp);
		System.out.println("Potência: " + df.format(r));
	}

}
