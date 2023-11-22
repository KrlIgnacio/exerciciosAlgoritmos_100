package bloco05;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 19/10/2023
 * */
public class Exercicio_10 {

	public static void main(String[] args) {
		//faça o sorteio de 20 números entre 0 e 10 e mostre quantos numeros sorteados, qts > que 5 e qts divisiveis por 3
		int contador = 1;
		int divPor_3 = 0;
		int maiorCinco = 0;
		int sorteio = 0;
			while(contador <= 20) {
				sorteio =  (int)(Math.random()* 11);
				System.out.println(+contador+"° valor: "+sorteio);
				if(sorteio % 3 == 0) {
					//divPor3 = 0 quando o num for divisivel por 3 a varivel recebe +1
					divPor_3++;
				}else if(sorteio > 5) {
					// = 0 quando o num for divisivel por 3 a varivel recebe +1
					maiorCinco++;
				}
				contador++;
			}
			//no console é mostrado a quantidade números são divisiveis por 3 e > que 5
			System.out.println("Divisíveis por 3: "+divPor_3);
			System.out.println("Maior que 5: "+maiorCinco);
			//não é impresso QUAIS VALORES
			
	}

}
