package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);		
		System.out.println("-----URNA-----");
		System.out.println(" (13) lULINHA <3");
		System.out.println(" (12)Ciro ");
		System.out.println("(666) Bozo");
		System.out.println(" (0) Branco ou Nulo");
		
		System.out.println("-----URNA-----");
		
		int voto=sc.nextInt();
		int votosLula=0;
		int votosCiro=0;
		int votosBolsonaro=0;
		int votosBrancoNulo=0;
		int votoTotal=0;
		int maior=0;
		String vencedor="";
		
		
		while(voto>=0) {
			if(voto==13) {
				votosLula=votosLula+1;
				System.out.println("O seu voto foi para o candidato Lulinha");
			}else if (voto==12) {
				votosCiro++;
				System.out.println("O seu voto foi para o Ciruzinho");
			}else if(voto==666) {
				votosBolsonaro++;
				System.out.println("O seu voto foi para o Monstro");
			}else if(voto==0) {
				votosBrancoNulo++;
				System.out.println("Você votou nulo ou branco");
			}else {
				System.out.println("Candidato incorreto, Vote novamente");
			}
			if (voto==12 || voto==13 || voto==666 || voto==0) {
				votoTotal++;
				}
			if(votosBolsonaro>maior) {
				maior = votosBolsonaro;
				vencedor="Bolsonaro";
			}if(votosLula>maior) {
				maior = votosLula;
				vencedor="Lula";
				}if(votosCiro>maior) {
					maior=votosCiro;
					vencedor="Ciro";
				}
			
			
			
			System.out.println("Vote Novamente; ");
			System.out.println("(-1) Para Sair");
		voto =sc.nextInt();
		
		}
		
		System.out.println("-----RESULTADO-----");
		System.out.println("Total =" +votoTotal+ "= 100%");
		double porcLula=(100*votosLula)/votoTotal;
		System.out.println("Lula = "+porcLula+"%");
		double porcCiro=(100*votosCiro)/votoTotal;
		System.out.println("Ciro= "+String.format("%.2f", porcCiro)+"%");
		double porcBolsonaro=(100*votosBolsonaro)/votoTotal;
		System.out.println("Bolsonaro= "+porcBolsonaro+"%");
		double porcBrancoNulo=(100*votosBrancoNulo)/votoTotal;
		System.out.println("Voto branco ou nulo: "+porcBrancoNulo+"%");
		System.out.println("Vencedor: " +vencedor);
		System.out.println("-----RESULTADO-----");
		sc.close();
		
		
	}

}
