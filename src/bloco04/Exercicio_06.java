package bloco04;

import java.text.DecimalFormat;

import util.Teclado;

/*Exercicio da lista de exercicios de algortitmos do professor Gustavo Guanabara
 * 
 * @author Karolaine Ign�cio
 * @version 1.0
 * @since 15/10/2023
 * */
public class Exercicio_06 {
	public static void main(String[] args) {
		/*Pontos de atividade f�sica: leia quantas horas por m�s uma pessoa faz atividade f�sica
		at� 10h -> 2 pontos por hora | 10h a 20h -> 5 pontos por hora
		acima de 20h -> 10 pontos por hora | cada ponto vale R$0,05*/
		System.out.println("PONTOS EM ATIVIDADES F�SICAS");
		double horaTreinoDia, horaMensal, qtdDias, pontosDinheiro;
		DecimalFormat formatador = new DecimalFormat("#0.00");
		qtdDias = Teclado.lerDouble("\nQuantos dias voc� treina por semana: ");
		horaTreinoDia = Teclado.lerDouble("Quantos horas voc� faz atividade f�sica por dia: ");
		
		//calculo hora de atividade por m�s
		horaMensal = (qtdDias * horaTreinoDia) * 4;//4 semanas no m�s
			if(horaMensal < 10) {
				pontosDinheiro = (horaMensal * 2) * 0.05;
				System.out.println("Parab�ns voc� ganhou R$"+formatador.format(pontosDinheiro));
				System.out.println("Voc� faz atividade f�sica por "+horaMensal+"h por m�s");
			}
			else if(horaMensal > 10 && horaMensal < 20) {
				pontosDinheiro = (horaMensal * 5) * 0.05;
				System.out.println("Parab�ns voc� ganhou R$"+formatador.format(pontosDinheiro));
				System.out.println("Voc� faz atividade f�sica por "+horaMensal+"h por m�s");
			}
			else if(horaMensal > 20) {
				pontosDinheiro = (horaMensal * 10) * 0.05;
				System.out.println("Parab�ns voc� ganhou R$"+formatador.format(pontosDinheiro));
				System.out.println("Voc� faz atividade f�sica por "+horaMensal+"h por m�s");
			}
		
	}
}
