package sprint3;

import java.util.Arrays;
import java.util.Scanner;


public class Ranking {
	public static int i;
	public static String qntEquipes;
	public static String[] equipes;
	public static String[] equipesMid;
	public static String[] equipesTemp;
	public static String[] equipesTempE;
	public static String[] equipesTempD;
	public static String[] nota;
	public static String[] equipesFinal;
	public static void main(String[] args){
		Scanner tec = new Scanner (System.in);
		
			System.out.print("Insira a quantidade de equipes participantes: ");
			i = tec.nextInt();
			equipesFinal = new String[i];
			equipesTempE = new String[i];
			equipesTempD = new String[i];
			equipesTemp = new String[i];
			nota = new String[i];
		equipesMid = new String[i];
		equipes = new String[i];
		while (i <= 0) {
			System.out.println("Tente de novo, quantidade inválida.");
			System.out.println("Insira a quantidade de equipes participantes: ");
			i = tec.nextInt();
		}
		
		
		equipes[0] = tec.nextLine();
		for (int j = 0; j <equipes.length; j++) {
		System.out.println("Insira o nome das equipes: ");
		System.out.println("Equipe " + (j+1) + ": ");
		equipes[j] = tec.nextLine();
		}
		
		System.out.println("Nome final das equipes: ");
		System.out.println(Arrays.toString(equipes));
		
		
		
		for (int j = 0; j < equipesMid.length; j++) {
		System.out.println("Insira a quantidade de disputas para a equipe " + equipes[j] + ": ");
		equipesMid[j] = tec.nextLine();
		}
		
		System.out.println("Disputas de cada equipe: ");
		System.out.println("Equipes: " + Arrays.toString(equipes));
		System.out.println("Disputas: " + Arrays.toString(equipesMid));
		
		for (int j = 0; j < equipesTemp.length; j++) {
			System.out.println("Insira a quantidade de vitórias da equipe " + equipes[j] + ": ");
			equipesTemp[j] = tec.nextLine();
			while (Integer.parseInt(equipesTemp[j]) > Integer.parseInt(equipesMid[j])) {
				System.out.println("Quantidade inválida, tente novamente: ");
				System.out.println("Insira a quantidade de vitórias da equipe " + equipes[j] + ": ");
				equipesTemp[j] = tec.nextLine();
			}
		}
		
		for (int j = 0; j < equipesTempE.length; j++) {
			System.out.println("Insira a quantidade de empates da equipe " + equipes[j] + ": ");
			equipesTempE[j] = tec.nextLine();
			while (Integer.parseInt(equipesTempE[j]) > ((Integer.parseInt(equipesMid[j])-(Integer.parseInt(equipesTemp[j]))))) {
				System.out.println("Quantidade inválida, tente novamente: ");
				System.out.println("Insira a quantidade de empates da equipe " + equipes[j] + ": ");
				equipesTempE[j] = tec.nextLine();
			}
		}
		
		for (int j = 0; j < equipesTempD.length; j++) {
			System.out.println("Insira a quantidade de derrotas da equipe " + equipes[j] + ": ");
			equipesTempD[j] = tec.nextLine();
			while (Integer.parseInt(equipesTempD[j]) > ((Integer.parseInt(equipesMid[j])-(Integer.parseInt(equipesTemp[j])+Integer.parseInt(equipesTempE[j]))))) 
			{
				System.out.println("Quantidade inválida, tente novamente: ");
				System.out.println("Insira a quantidade de derrotas da equipe " + equipes[j] + ": ");
				equipesTempD[j] = tec.nextLine();
			}
		}
		
		for (int j = 0; j < nota.length; j++) {
			System.out.println("Insira a nota da equipe " + equipes[j] + ": ");
			nota[j] = tec.nextLine();
			while (Integer.parseInt(nota[j]) > 10) {
				System.out.println("Quantidade inválida, tente novamente: ");
				System.out.println("Insira a nota da equipe " + equipes[j] + ": ");
				nota[j] = tec.nextLine();
			}
		}
	String classificacao [] = new String [i];
	int tempV = 0;
	int tempE = 0;
	int tempFinal = 0;
	String vencedor = new String();
	
		for (int j = 0; j < equipesFinal.length; j++) {
			tempV = Integer.parseInt(equipesTemp[j]);
			tempE = Integer.parseInt(equipesTempE[j]);
			tempV = (tempV * 5);
			tempE = (tempE * 3);
			tempFinal = (tempV + tempE);
			classificacao[j] = (Integer.toString(tempFinal));
			int tempo = 1;
			if (classificacao[j] == classificacao[tempo]) {
				int s = 0;
				int desEmpate = Integer.parseInt(nota [s]);
				int desEmpate1 = Integer.parseInt(nota [s+1]);
				if (desEmpate > desEmpate1) {
					vencedor = equipes[s];
				}
				if (desEmpate < desEmpate1) {
					vencedor = equipes[s+1];
				}
			s++;
			}tempo++;
		}
		System.out.println("RESULTADO FINAL:");
		System.out.println();
		System.out.println("Disputas: ");
		System.out.println(Arrays.toString(equipes));
		System.out.println(Arrays.toString(equipesMid));
		System.out.println("Disputas vencidas: ");
		System.out.println(Arrays.toString(equipes));
		System.out.println(Arrays.toString(equipesTemp));
		System.out.println("Disputas perdidas: ");
		System.out.println(Arrays.toString(equipes));
		System.out.println(Arrays.toString(equipesTempD));
		System.out.println("Empates: ");
		System.out.println(Arrays.toString(equipes));
		System.out.println(Arrays.toString(equipesTempE));
		System.out.println("Nota: ");
		System.out.println(Arrays.toString(equipes));
		System.out.println(Arrays.toString(nota));
		System.out.println("Pontuação final: ");
		System.out.println(Arrays.toString(equipes));
		System.out.println(Arrays.toString(classificacao));
		System.out.println("VENCEDOR: ");
		System.out.println(vencedor);
		
		
		tec.close();
	
	
}
}