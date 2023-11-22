package bloco04;

import java.text.DecimalFormat;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ignácio
 * @version 1.0
 * @since 15/10/2023
 * */

public class Exercicio_05 {

	public static void main(String[] args) {
		/*LOCADORA DE CARROS: leia o tipo de carro do cliente -> Popular ou Luxo, leia quantos dias de viagem e quantos km percorridos.
		 * POPULAR (R$90 p dia) - Até 100Km percorridos: R$0,20 por Km - > de 100Km: R$0,10 por Km
		 *LUXO (R$150 p dia)- Até 200Km percorridos: R$0,30 por Km - > de 200Km: R$0,25 por Km*/
		double totalPagar, qtdDias, kmPercorridos,carro;
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("LOCADORA DE CARROS:");
		System.out.println("\nEscolha o seu carro:");
		carro = Teclado.lerDouble("Digite '1' para carros populares e '2' para carros de luxo.");
		
			if(carro == 1) {
				qtdDias = Teclado.lerDouble("\nQuantos dias será a viagem: ");
				kmPercorridos = Teclado.lerDouble("Quantos km será a viagem:"); 
					if(kmPercorridos > 100) {
						totalPagar = (qtdDias * 90) + (kmPercorridos * 0.10);
				} 
					else {
						totalPagar = (qtdDias * 90) + (kmPercorridos * 0.20);
				}
				System.out.println("Valor total: R$"+formatador.format(totalPagar));
			}
			else if(carro == 2) {
				qtdDias = Teclado.lerDouble("\nQuantos dias será a viagem: ");
				kmPercorridos = Teclado.lerDouble("Quantos km será a viagem:"); 
					if(kmPercorridos > 200) {
						totalPagar = (qtdDias * 150) + (kmPercorridos * 0.25);
					} 
					else {
						totalPagar = (qtdDias * 150) + (kmPercorridos * 0.30);
					}
					
				System.out.println("Valor total: R$"+formatador.format(totalPagar));		
			}
			
			else {
				System.out.println("\nDigite uma opção válida!");
			}
	}

}
