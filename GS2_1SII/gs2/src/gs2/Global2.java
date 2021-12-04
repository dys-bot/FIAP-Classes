package gs2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Global2 {
	public static void main(String[] args) {

	
		Scanner tec = new Scanner (System.in);
		int op = 0;
		HashMap<String,ArrayList<String>> arraynames1 = new HashMap<String,ArrayList<String>>();
		HashMap<String,ArrayList<String>> arraynames = new HashMap<String,ArrayList<String>>();
		HashMap<String,ArrayList<String>> arraynames2 = new HashMap<String,ArrayList<String>>();
		arraynames1.put("caprino", new ArrayList<String>());
		arraynames2.put("suíno", new ArrayList<String>());
		arraynames.put("bovino", new ArrayList<String>());
		boolean loop = true;
		
		Animal caprino1 = new Animal();
		Animal bovino1 = new Animal();
		Animal suino1 = new Animal();
		

		 do
		    { 
		   
		System.out.println("Opções:" );
		System.out.println("1. Cadastrar");
		System.out.println("2. Relatório");
		System.out.println("3. Pesquisa");
		System.out.println("4. Sair");
		System.out.println("Insira a opção desejada: "); 
		op = tec.nextInt();
		
		
		switch(op) {
		case 1:
			System.out.println("Insira o tipo de animal que deseja cadastrar: ");
			System.out.println("1. Bovino");
			System.out.println("2. Suíno");
			System.out.println("3. Caprino");
			int i = tec.nextInt();
			switch(i) {
			case 1:	
				
				System.out.println("Raça do animal: ");
				bovino1.raça = tec.next();
				System.out.println("Peso do animal: ");
				bovino1.peso = tec.nextInt();
				System.out.println("Idade do animal: ");
				bovino1.idade = tec.nextInt();
						
				
				 int leftLimit = 97; 
				    int rightLimit = 122;
				    int targetStringLength = 3;
				    Random random = new Random();
				    StringBuilder buffer = new StringBuilder(targetStringLength);
				    for (int i1 = 0; i1 < targetStringLength; i1++) {
				        int randomLimitedInt = leftLimit + (int) 
				          (random.nextFloat() * (rightLimit - leftLimit + 1));
				        buffer.append((char) randomLimitedInt);
				    }
				    String generatedString = buffer.toString().toUpperCase();

				    String nome = "BO"+generatedString;
				    System.out.println(nome);
				   
				    String ciphertext = "";
			        char alphabet;
			        for(int i1=0; i1 < nome.length();i1++) 
			        {
			            alphabet = nome.charAt(i1);
			            
			          
			            if(alphabet >= 'a' && alphabet <= 'z') 
			            {
			           
			             alphabet = (char) (alphabet + 3);
			           
			             if(alphabet > 'z') {
			               
			                alphabet = (char) (alphabet+'a'-'z'-1);
			             }
			             ciphertext = ciphertext + alphabet;
			            }
			            
			          
			            else if(alphabet >= 'A' && alphabet <= 'Z') {
			            
			             alphabet = (char) (alphabet + 3);    
			                
			           
			             if(alphabet > 'Z') {
			                
			                 alphabet = (char) (alphabet+'A'-'Z'-1);
			             }
			             ciphertext = ciphertext + alphabet;
			            }
			            else {
			             ciphertext = ciphertext + alphabet;   
			            }
			        }
				    
				   
				    
				bovino1.nome = nome;
				arraynames.get("bovino").add(ciphertext);
				System.out.println("Animal registrado.");
				System.out.println("Criptografia: " + ciphertext);
				
			break;
			case 2:
	
				System.out.println("Raça do animal: ");
				suino1.raça = tec.next();
				System.out.println("Peso do animal: ");
				suino1.peso = tec.nextInt();
				System.out.println("Idade do animal: ");
				suino1.idade = tec.nextInt();
			
				
				 int leftLimit2 = 97; 
				    int rightLimit2 = 122;
				    int targetStringLength2 = 3;
				    Random random2 = new Random();
				    StringBuilder buffer2 = new StringBuilder(targetStringLength2);
				    for (int i2 = 0; i2 < targetStringLength2; i2++) {
				        int randomLimitedInt = leftLimit2 + (int) 
				          (random2.nextFloat() * (rightLimit2 - leftLimit2 + 1));
				        buffer2.append((char) randomLimitedInt);
				    }
				    String generatedString2 = buffer2.toString().toUpperCase();

				    String nome2 = "SU"+generatedString2;
				    System.out.println("SU"+generatedString2);
				    
				  
				    String ciphertext1 = "";
			        char alphabet1;
			        for(int i1=0; i1 < nome2.length();i1++) 
			        {
			            alphabet1 = nome2.charAt(i1);
			            
			          
			            if(alphabet1 >= 'a' && alphabet1 <= 'z') 
			            {
			           
			             alphabet1 = (char) (alphabet1 + 3);
			           
			             if(alphabet1 > 'z') {
			               
			                alphabet1 = (char) (alphabet1+'a'-'z'-1);
			             }
			             ciphertext1 = ciphertext1 + alphabet1;
			            }
			            
			          
			            else if(alphabet1 >= 'A' && alphabet1 <= 'Z') {
			            
			             alphabet1 = (char) (alphabet1 + 3);    
			                
			           
			             if(alphabet1 > 'Z') {
			                
			                 alphabet1 = (char) (alphabet1+'A'-'Z'-1);
			             }
			             ciphertext1 = ciphertext1 + alphabet1;
			            }
			            else {
			             ciphertext1 = ciphertext1 + alphabet1;   
			            }
			        }
				    
				    
				    
				suino1.nome = nome2;
				arraynames2.get("suíno").add(ciphertext1);
				System.out.println("Animal registrado.");
				System.out.println("Criptografia: " + ciphertext1);
				break;
				
			case 3:
				
				
				System.out.println("Raça do animal: ");
				caprino1.raça = tec.next();
				System.out.println("Peso do animal: ");
				caprino1.peso = tec.nextInt();
				System.out.println("Idade do animal: ");
				caprino1.idade = tec.nextInt();
				
				
				int leftLimit1 = 97; 
			    int rightLimit1 = 122;
			    int targetStringLength1 = 3;
			    Random random1 = new Random();
			    StringBuilder buffer1 = new StringBuilder(targetStringLength1);
			    	 
			    for (int i1 = 0; i1 < targetStringLength1; i1++) {
			        int randomLimitedInt = leftLimit1 + (int) 
			          (random1.nextFloat() * (rightLimit1 - leftLimit1 + 1));
			        buffer1.append((char) randomLimitedInt);
			    }
			    String generatedString1 = buffer1.toString().toUpperCase();
			   
			

				    String nome1 = "CA"+generatedString1;
				    System.out.println("CA"+generatedString1);
				    
				    String ciphertext11 = "";
			        char alphabet11;
			        for(int i1=0; i1 < nome1.length();i1++) 
			        {
			            alphabet11 = nome1.charAt(i1);
			            
			          
			            if(alphabet11 >= 'a' && alphabet11 <= 'z') 
			            {
			           
			             alphabet11 = (char) (alphabet11 + 3);
			           
			             if(alphabet11 > 'z') {
			               
			                alphabet11 = (char) (alphabet11+'a'-'z'-1);
			             }
			             ciphertext11 = ciphertext11 + alphabet11;
			            }
			            
			          
			            else if(alphabet11 >= 'A' && alphabet11 <= 'Z') {
			            
			             alphabet11 = (char) (alphabet11 + 3);    
			                
			           
			             if(alphabet11 > 'Z') {
			                
			                 alphabet11 = (char) (alphabet11+'A'-'Z'-1);
			             }
			             ciphertext11 = ciphertext11 + alphabet11;
			            }
			            else {
			             ciphertext11 = ciphertext11 + alphabet11;   
			            }
			        }
				    
				    
				    
				
				caprino1.nome = nome1;
				arraynames1.get("caprino").add(ciphertext11);
				System.out.println("Animal registrado.");
				System.out.println("Criptografia: " + ciphertext11 );
				 
				break;
				
			}
			break;
		case 2:
			System.out.println("nome criptografado: " +arraynames);
			System.out.println(bovino1.nome);
			System.out.println("raça: ");
			 System.out.println(bovino1.raça);
			 System.out.println("idade: ");
			 System.out.println(bovino1.idade);
			 System.out.println("peso: ");
			 System.out.println(bovino1.peso);
			System.out.println();
			System.out.println("nome criptografado: " +arraynames1);
			System.out.println(caprino1.nome);
			System.out.println("raça: ");
			 System.out.println(caprino1.raça);
			 System.out.println("idade: ");
			 System.out.println(caprino1.idade);
			 System.out.println("peso: ");
			 System.out.println(caprino1.peso);
			 System.out.println();
			 System.out.println("nome criptografado: " + arraynames2);
			 System.out.println(suino1.nome);
				System.out.println("raça: ");
				 System.out.println(suino1.raça);
				 System.out.println("idade: ");
				 System.out.println(suino1.idade);
				 System.out.println("peso: ");
				 System.out.println(suino1.peso);
			
			
			break;
		case 3:
			String cod = new String();
			System.out.println("Insira o código do animal em letras maiúsculas descriptografado: ");
			cod = tec.next();
			
			if (cod.equals(suino1.nome)) {
				System.out.println();
				 System.out.println(suino1.nome);
					System.out.println("raça: ");
					 System.out.println(suino1.raça);
					 System.out.println("idade: ");
					 System.out.println(suino1.idade);
					 System.out.println("peso: ");
					 System.out.println(suino1.peso);
			}
			else if (cod.equals(caprino1.nome)) {
				System.out.println();
				System.out.println(caprino1.nome);
				System.out.println("raça: ");
				 System.out.println(caprino1.raça);
				 System.out.println("idade: ");
				 System.out.println(caprino1.idade);
				 System.out.println("peso: ");
				 System.out.println(caprino1.peso);
			}
			else if (cod.equals(bovino1.nome)) {
				System.out.println(bovino1.nome);
				System.out.println("raça: ");
				 System.out.println(bovino1.raça);
				 System.out.println("idade: ");
				 System.out.println(bovino1.idade);
				 System.out.println("peso: ");
				 System.out.println(bovino1.peso);
			}
			
			break;
			case 4:
				loop = false;
				break;
			default: System.out.println("Opção inválida.");
			
		}
		    }
			while(loop == true);
		 tec.close();
		
	}
}
