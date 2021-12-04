package check2;

import java.util.Random;

public class UniaoVetores_Ex3 {

	public static void main(String[] args) {
				
				int X[] = new int [10];
				int Y[] = new int [10];
				int U[] = new int [20];
				int i;
				int e;
				int j;
				boolean uniao;
				
				Random r = new Random();
				
				for(i = 0; i < X.length; i++)
				{
					X[i] = r.nextInt(10);
					Y[i] = r.nextInt(10)+5;
			}

				System.out.print("X[] = { ");
				for(i = 0; i < X.length; i++)
					System.out.printf("%d%s", X[i], ", ");
				System.out.println("}");
				
				System.out.print("Y[] = { ");
				for(i = 0; i < Y.length; i++)
					System.out.printf("%d%s", Y[i], ", ");
				System.out.println("}");
				
				e = 0;
				U[e++] = X[0];
				
				for (i = 0; i < X.length; i++)
				{
					uniao = true;
					for(j = 0; j < U.length; j++)
						if(U[j] == X[i])
						{
							uniao = false;
							break;
						}if (uniao == true)
						U[e++] = X[i];
					}
				if (e > i)
					i = 0;
					for (i = 0; i < Y.length; i++)
					{
						uniao = true;
						for (j = 0; j < U.length; j++)
							if(U[j] == Y[i])
							{
								uniao = false;
								break;
							}if (uniao == true)
								U[e++] = Y[i];
					}
				System.out.print("U[] = { ");
				for(i = 0; i < e; i++)
					System.out.printf("%d%s", U[i], ", ");
				System.out.println("}");
		}
	}
				



