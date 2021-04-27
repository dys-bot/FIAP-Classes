package Check01;

import java.util.Scanner;

public class Ex_1_INSS_IRRF {

		public static void main(String[] args) {

			Scanner tec = new Scanner(System.in);
			double salBruto, INSS, salLiq, IRRF, salLiqFinal;
			
			System.out.println("Informe o salário bruto: ");
			salBruto = tec.nextDouble();
			if (salBruto <=1100.00)
				INSS = salBruto * 0.075;
			else
				if ((salBruto >=1100.01) && (salBruto <=2203.48))
					INSS = salBruto * 0.09;
				else
					if ((salBruto >=2203.49) && (salBruto <= 3305.22))
						INSS = salBruto * 0.12;
					else
						if ((salBruto >=3305.23) && (salBruto <=6403.57))
							INSS = salBruto * 0.14;
						else
							INSS = 751.99;
			
			
			
			System.out.println("para salário bruto de R$" + salBruto);
			System.out.println("contribuição de: R$" + INSS);
			
			salLiq = (salBruto - INSS);
			
			if (salLiq <= 1903.98)
				IRRF = salLiq;
				else
					if ((salLiq >= 1903.99) && (salLiq <= 2826.65))
						IRRF = salLiq * 0.075;
					else
						if ((salLiq >= 2826.66) && (salLiq <= 3751.05))
							IRRF = salLiq * 0.15;
						else
							if ((salLiq >= 3751.06) && (salLiq <= 4664.68))
								IRRF = salLiq * 0.225;
							else
								IRRF = salLiq * 0.275;
			
			salLiqFinal = salLiq - IRRF;
			
			System.out.println("Para salário líquido de R$ " + salLiq);
			System.out.printf("IRRF de " + IRRF + " descontado do salário");
			System.out.printf("O salário final é de R$ " + "%.2f" , salLiqFinal);
			
			tec.close();
		}

	}