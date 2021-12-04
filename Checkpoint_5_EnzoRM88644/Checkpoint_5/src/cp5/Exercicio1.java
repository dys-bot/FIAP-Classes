package cp5;
public class Exercicio1 {
public static int x;

	public static void main(String[] args) 
	{
		String charfiap = new String("EU ESTUDO NA FIAP");
		String frase[] = charfiap.split(" ");
		
		
		String charfiapOUT = new String("");
		StringBuffer temp = new StringBuffer();
		
		
		
		for (x = frase.length-1; x >= 0; x--)
		{
			temp.append(frase[x]).reverse();
			charfiapOUT = charfiapOUT + temp.toString() + " " + temp.toString() + " ";
			temp.delete(0, temp.length());
		}
		
		System.out.println("Entrada inicial: " + charfiap);
		System.out.println("Saída finalizada: " + charfiapOUT.trim());
		
		

	}

}
