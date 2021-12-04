package sprint_2_watts;

import java.util.Scanner;

public class Sprint_2Watts {

	public static final int CIMA = 1;
	public static final int BAIXO = 2;
	public static final int DIREITA = 3;
	public static final int ESQUERDA = 4;
	public static final int ENCERRAR = 5;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int xr, yr, xt, yt, comando, direcao, distancia, DIRECOES, dTotal;
		int comCorreto;
		double bateria;
		boolean alertaBateria50 = false;
		boolean COMPLETO = false;
		 

		comando = 0;
		xr = 2;
		yr = 1;
		xt = 13;
		yt = 6;
		direcao = 0;
		distancia = 0;

		bateria = 0;
		while (bateria <=0 || bateria > 5)
		{
		System.out.println("Informe a carga da bateria [V]: ");
		bateria = entrada.nextDouble();
		}
		
		direcao = 0;		
		while ((direcao != CIMA && direcao != BAIXO && direcao != ESQUERDA && direcao != DIREITA) ||
				(distancia <= 0 || distancia % 10 != 0))
		{
			System.out.println("Informe o " + (comando + 1) + "o comando:");
			System.out.print("Direção: ");
			direcao = entrada.nextInt();
			System.out.print("Distância: ");
			distancia = entrada.nextInt();
		}
			

			if (direcao == DIREITA && distancia == 70) 
			{
				System.out.println("\nComando bem sucedido!\n");
				comando++;
				xr = xr + (distancia/10);
				bateria = bateria - ((double) (distancia)/100);
				System.out.printf("Carga restante: %3.1f\n", bateria);
				if (bateria >= 1 && bateria <= 2.5 && alertaBateria50 == false)
				{
					alertaBateria50 = true;
					System.out.println("AVISO: Bateria em estado de alerta.");
				}
				else
				{
					if (bateria > 0 && bateria < 1)
						System.out.println("CRÍTICO: Bateria FRACA.");
					if (bateria <= 0)
					{
						System.out.println("AVISO DE OPERATIVIDADE: Bateria sem carga restante, robô incapaz de realizar funções.");
						System.out.println("Objetivo não alcançado.");
					}
				}
				
				System.out.println("Informe o " + (comando + 1) + "° comando: ");
				System.out.print("Direção: ");
				direcao = entrada.nextInt();
				System.out.print("Distancia: ");
				distancia = entrada.nextInt();

				if (direcao == BAIXO && distancia == 50) {
					System.out.println("\nComando bem sucedido!\n");
					comando++;
					

					System.out.println("Informe o " + (comando + 1) + "° comando: ");
					System.out.print("Informe a direÃ§Ã£o: ");
					direcao = entrada.nextInt();
					System.out.print("Informe a distancia: ");
					distancia = entrada.nextInt();

					if (direcao == DIREITA && distancia == 80) {
						System.out.println("\nComando bem sucedido!\n");
						comando++;
						

						System.out.println("Informe o " + (comando + 1) + "Â° comando: ");
						System.out.print("Informe a direÃ§Ã£o: ");
						direcao = entrada.nextInt();
						System.out.print("Informe a distancia: ");
						distancia = entrada.nextInt();

						if (direcao == CIMA && distancia == 110) {
							System.out.println("\nComando bem sucedido!\n");
							comando++;
							

							System.out.println("Informe o " + (comando + 1) + "Â° comando: ");
							System.out.print("Informe a direÃ§Ã£o: ");
							direcao = entrada.nextInt();
							System.out.print("Informe a distancia: ");
							distancia = entrada.nextInt();
							
							if(direcao == ESQUERDA && distancia == 40) {
								System.out.println("\nComando bem sucedido!\n");
								comando++;
								

								System.out.println("Informe o " + (comando + 1) + "Â° comando: ");
								System.out.print("Informe a direÃ§Ã£o: ");
								direcao = entrada.nextInt();
								System.out.print("Informe a distancia: ");
								distancia = entrada.nextInt();
								
								if(direcao == BAIXO && distancia == 70) {
									System.out.println("\nComando bem sucedido!\n");
									comando++;
									xr = xt;
									yr = yt;
									
									if(xr == xt && yr == yt) {
										System.out.println("OBJETIVO ALCANÃ‡ADO!");
										System.out.println("A potÃªncia gasta foi de 480 W");
									}
									else 
										System.out.println("Objetivo NÃƒO ALCANÃ‡ADO!");
									
										
								} else 
									System.out.println("Comando mal sucedido. (MissÃ£o abortada)");
							}else 
								System.out.println("Comando mal sucedido. (MissÃ£o abortada)");
						}else
							System.out.println("Comando mal sucedido. (MissÃ£o abortada)");

					}else 
						System.out.println("Comando mal sucedido. (MissÃ£o abortada)");
				}else
					System.out.println("Comando mal sucedido. (MissÃ£o abortada)");

			}else
				System.out.println("Comando mal sucedido. (MissÃ£o abortada)");
			
			
		entrada.close();
		
		}
	}


