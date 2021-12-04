package sprint4;

import java.util.Arrays;
import java.util.Scanner;

public class Sprint4 {
	public static int i;
	public static String qntEquipes;
	public static String[] equipes;
	public static int[] equipesMid;
	public static String[] equipesTemp;
	public static String[] equipesTempE;
	public static String[] equipesTempD;
	public static String[] equipesFinal;
	public static void main(String[] args){

		Scanner tec = new Scanner (System.in);
			System.out.print("Insira a quantidade de equipes participantes: ");
			i = tec.nextInt();
			equipesFinal = new String[3];
			equipesTempE = new String[i];
			equipesTempD = new String[i];
			equipesTemp = new String[i];
			int[] nota = new int[i];
		equipesMid = new int[i];
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
		
		for (int j = 0; j < nota.length; j++) {
			int notaRandom = 0;
			int r = (int) (Math.random()*10);
			notaRandom = r;
			nota[j] = notaRandom;
			
		}
		int ponto[] = new int [i];
		for (int j = 0; j < (equipesTemp.length); j++) {
			int pontoRandom = 0;
			int r = (int) (Math.random()*10);
			pontoRandom = r;
			equipesMid[j] = pontoRandom;
			for (int i = 0; i < j; i++) {
			System.out.println(equipes[i] +" " +equipesMid[i] + " X " + equipesMid[j]+" "+ equipes[j]);
			if (equipesMid[i] == equipesMid[j]) {
				int u = (int) (Math.random()*10);
				if (nota[i] > nota[j]) {
					nota[j] = u;
				}
				else
					nota[i] = u;
			}
			bubbleSort(equipesMid,equipesTemp.length);
			}
			}
		
		 for (int i=0;i<equipes.length-1;++i){

	            for(int j=0;j<equipes.length-i-1; ++j){

	                if(ponto[j+1]<ponto[j]){

	                    int swap = ponto[j];
	                    ponto[j] = ponto[j+1];
	                    ponto[j+1] = swap;
	                    String nomeFinal = new String();
	                    nomeFinal = equipes[j];
	                    equipes[j] = equipes[j+1];
	                    equipes[j+1] = nomeFinal;
	                    int notaFinal = nota[j];
	                    nota[j] = nota[j+1];
	                    nota[j+1] = notaFinal;

	                }
	            }
	        }
		 int notaFinal2[] = new int[3];
		 notaFinal2[0] = nota[0];
		 notaFinal2[1] = nota[1];
		 notaFinal2[2] = nota[2];
			int tempV[] = new int[3];
			int tempE[] = new int[3];
	    equipesFinal[0] = equipes[0];
	    equipesFinal[1] = equipes[1];
	    equipesFinal[2] = equipes[2];
		 System.out.println("TOP 3: ");
		 System.out.println(Arrays.toString(equipesFinal));
		 System.out.println("Batalhas finais: ");
		 for (int i = 0; i < equipesFinal.length; i++) {
			 ponto[i] = 0;
			 for (int j = 0; j < i; j++) {
				 int r = (int) (Math.random()*10);
				 int x = (int) (Math.random()*10);
				 equipesMid[i] = r;
				 equipesMid[j] = x;
		 System.out.println(equipesFinal[i] +" " +equipesMid[i] + " X " + equipesMid[j]+" "+ equipesFinal[j]);
		 if (equipesMid[i] > equipesMid[j]) {
				tempV[i] = tempV[i]+1;
			}
			 if ((equipesMid[i]) < equipesMid[j]) {
				tempV[j] = tempV[j]+1;
			}
			 if ((equipesMid[i]) == (equipesMid[j])) {
				tempE[j] = tempE[j]+1;
				tempE[i] = tempE[i]+1;
			}
			
				if ((notaFinal2[i]) > notaFinal2[j]) {
					tempE[i] = tempE[i]+1;
				}
				
			 }
			 
			
	}int classificacao[] = new int[equipesFinal.length];
		 String vencedor = new String();
		 for (int j = 0; j < equipesFinal.length; j++) {
	
			 int tempVI = (tempV[j] * 2);
			 int tempEI = tempE[j];
				int tempFinal = (tempVI + tempEI);
				
				
				classificacao[j] = tempFinal;
				int len = equipesFinal.length;
				bubbleSort(classificacao,len);
				int tempo = 1;
				if (classificacao[j] == classificacao[tempo]) {
					int s = 0;
					int desEmpate = notaFinal2 [s];
					int desEmpate1 = notaFinal2 [s+1];
					
					if (desEmpate > desEmpate1) {
						vencedor = equipesFinal[s];
					}
					if (desEmpate < desEmpate1) {
						vencedor = equipesFinal[s+1];
					}
				s++;
				}tempo++;
			}
	 System.out.println("VENCEDOR: ");
	 System.out.println(vencedor);
	
	
	 
	 tec.close();
	}
public static void bubbleSort(int[] classificacao, int len){
        
        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(classificacao[j+1]<classificacao[j]){

                    int swap = classificacao[j];
                    classificacao[j] = classificacao[j+1];
                    classificacao[j+1] = swap;

                }
            }
        }
        
    }}
    