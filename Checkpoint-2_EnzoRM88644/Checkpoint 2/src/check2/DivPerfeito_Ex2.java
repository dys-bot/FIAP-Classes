package check2;

public class DivPerfeito_Ex2 {
	public static void main(String[] args)
	{
	    int n, i, cont = 0, soma;
	    int divPerfeitos[] = new int [3];
            	    	   	 
	     n=1;
	    while( cont < 3)
	    {
	       soma = 0;
	       for (i = 1; i < n; i++)
	    	   if(n%i == 0)
	    		   soma = soma + i;
	       i++;
	if(soma == n)
	{
		divPerfeitos[cont] = n;
		cont++;
	}
	n++;
}
	    System.out.println("Os 3 primeiros números perfeitos correspondem a: ");
	    for (i = 0; i < divPerfeitos.length; i++)
	    	System.out.println(divPerfeitos[i]);
	    }
}