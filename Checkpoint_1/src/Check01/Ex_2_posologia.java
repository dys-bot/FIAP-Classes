package Check01;

import java.util.Scanner;

public class Ex_2_posologia {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		
		float peso;
		
		System.out.println("Insira o peso do paciente (kg): ");
		peso = tec.nextFloat();
		
		if (peso <= 5)
			System.out.println("ESTE MEDICAMENTO É CONTRAINDICADO!");
		else
			if ((peso >= 5.01) && (peso <= 8))
				System.out.println("Para crianças de " + peso + " kg a dose é de " + "2,5ml");
			else
				if ((peso >=8.01) && (peso <= 15))
					System.out.println("Para crianças de " + peso + " kg a dose é de " + "5ml");
				else
					if ((peso >= 15.01) && (peso <= 23))
						System.out.println("Para crianças de " + peso + " kg a dose é de " + "7,5ml");
					else
						if ((peso >=23.01) && (peso <= 30))
							System.out.println("Para crianças de " + peso + " kg a dose é de " + "10ml");
						else
							if ((peso >= 30.01) && (peso <= 45))
								System.out.println("Para crianças de " + peso + " kg a dose é de " + "15ml");
							else
								if ((peso >=45.01) && (peso <= 53))
									System.out.println("Para crianças de " + peso + " kg a dose é de " + "17,5ml");
								else
									if (peso > 54)
										System.out.println("Para pacientes com mais de 54kg é recomendado o uso adulto" );
		tec.close();
	}

}
