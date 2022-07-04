import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Exe1 {
	static Scanner input = new  Scanner(System.in);

	
	
	 static int limite = 4,op =0,ultimoFila1=-1,ultimoFila2=-1,ultimoFila3=-1;
	 static String [] filaOxigenio1 =  new String[limite];
	 static String [] filaOxigenio2 =  new String[limite];
	 static String [] filaOxigenio3 =  new String[limite];
	 static String paciente;



	private static Class<? extends Exe1> class1;
	 
	
	
	 
	 private static void removerElementoPosConsulta() {
			
			int idade; 
			System.out.println("\n------Qual idade do paciente ? ------\n"
					+ "1_ -18 anos.\n"
					+ "2_ 18 ente 60 anos\n"
					+ "3_ +60 anos \n"
					+ "4_Volte ao menu");
			idade = input.nextInt();
			
			if((ultimoFila1 == -1 && idade == 1) || ( ultimoFila2<0 && idade == 2) || (ultimoFila3<0 && idade == 1) ) {
				System.out.println("\nEssa fila est� vazia");
			}else if(idade == 1) {
				System.out.println("------Qual paciente voc� deseja remover do oxig�nio? Entre "
						+ "com um n�mero. ------");
				int remover = input.nextInt();
				
				for(int i =0; i <= ultimoFila1;i++) {
					if(i == remover-1) {
						for(int j =i; j <= ultimoFila1;j++) {
							if(j == ultimoFila1) {
								filaOxigenio2[ultimoFila1] = null;
								ultimoFila1--;
							}else {	
								filaOxigenio1[j] =filaOxigenio1[j+1];
							}	
						}	
					}
				}
				
				
			}else if(idade ==2) {
				System.out.println("------Qual paciente voc� deseja remover do oxig�nio? Entre "
						+ "com um n�mero. ------");
				int remover = input.nextInt();
				
				for(int i =0; i <= ultimoFila2;i++) {
					if(i == remover-1) {
						for(int j =i; j <= ultimoFila2;j++) {
							if(j == ultimoFila2) {
								filaOxigenio2[ultimoFila2] = null;
								ultimoFila2--;
							}else {	
								filaOxigenio2[j] =filaOxigenio2[j+1];
							}	
						}	
					}
				}
			
			
			}else if(idade == 3) {
				System.out.println("------Qual paciente voc� deseja remover do oxig�nio? Entre "
						+ "com um n�mero. ------");
				int remover = input.nextInt();
				
				for(int i =0; i <= ultimoFila3;i++) {
					if(i == remover-1) {
						for(int j =i; j <= ultimoFila3;j++) {
							if(j == ultimoFila3) {
								filaOxigenio3[ultimoFila3] = null;
								ultimoFila3--;
							}else {	
								filaOxigenio3[j] =filaOxigenio3[j+1];
							}	
						}	
					}
				}
			}
			
		}
			
		
	
	
 	private static void inserirElemento() {
		int idade;
			
		System.out.println("\n----- Qual o nome do paciente ? ------");
		paciente = input.next();
		
			
		System.out.println("\n------Qual idade do "+paciente+"? ------\n"
				+ "1_ -18 anos.\n"
				+ "2_ 18 ente 60 anos\n"
				+ "3_ +60 anos \n"
				+ "4_Voltar ao Menu");
		idade = input.nextInt();
		
		if(idade == 1) {
			if(ultimoFila1 == limite-1) {
				System.out.println("A fila de pessoas menores de 18 anos est� cheia. N�o foi poss�vel colocar "
						+ paciente+" em um oxig�nio.");
			}else {
				ultimoFila1++;
				filaOxigenio1[ultimoFila1] = paciente;
				System.out.println();
				}
			
			
		}else if(idade == 2) {
			if(ultimoFila2 == limite-1) {
				System.out.println("A fila de pessoas maiores de 18 anos est� cheia. N�o foi poss�vel colocar "
						+ paciente+" em um oxig�nio.");
			}else {
				ultimoFila2++;
				filaOxigenio2[ultimoFila2] = paciente;
				System.out.println();
				}
			
			
		}else if(idade == 3) {
			if(ultimoFila3 == limite-1) {
				System.out.println("A fila de pessoas menores de 60 anos est� cheia. N�o foi poss�vel colocar "
						+ paciente+" em um oxig�nio.");
			}else {
				ultimoFila3++;
				filaOxigenio3[ultimoFila3] = paciente;
				System.out.println();
				}
		}else if(idade == 4){
			op=0;
		}else{

			System.out.println("insira um comando v�lido.");
			inserirElemento();
		}
	}
	
	
	
	
	private static void removerElemento() {
		int consultar;
		
		System.out.println("------Deseja consultar uma fila para remover algum paciente ?------\n"
				+ "1_Sim\n"
				+ "2_N�o\n"
				+ "3_Voltar ao menu");
		consultar = input.nextInt();
		
		if(consultar == 1) {
			
			listarElemento();
			
			if(ultimoFila1 > -1) {
				removerElementoPosConsulta();
			}else if(ultimoFila2 > -1) {
				removerElementoPosConsulta();
			}else if(ultimoFila3 > -1) {
				removerElementoPosConsulta();				
			}
			
			
		}else if(consultar == 2){
			removerElementoPosConsulta();
		}else if( consultar == 3){
			op=0;
		}else{
			System.out.println("Comando inva�lido");
			removerElemento();
		}
	}
	
		
	
	private static void listarElemento() {
		System.out.println("\n------Qual a fila que deseja consultar ? ------\n"
				+ "1_ -18 anos.\n"
				+ "2_ 18 ente 60 anos\n"
				+ "3_ +60 anos \n"
				+ "4_Voltar ao menu\n");
		int fila = input.nextInt();
		
		if(fila == 1 && ultimoFila1 >= 0) {											
					System.out.println("\n------ Segue a lista abaixo dos pacientes no oxig�nio menores de "
							+ "18 anos: ------\n");
					for(int i =0; i <= ultimoFila1;i++) {
						System.out.println((i+1)+"�_"+filaOxigenio1[i]);
					
					}
				
		
		}else if(fila == 2 && ultimoFila2 >= 0) {
			
				System.out.println("\n------ Segue a lista abaixo dos pacientes no oxig�nio maiores de "
						+ "18 a 60 anos: ------\n");
				for(int i =0; i <= ultimoFila2;i++) {
					System.out.println((i+1)+"�_"+filaOxigenio2[i]);
				}
				
			
			
		}else if(fila == 3 && ultimoFila3 >= 0) {
				System.out.println("\n------ Segue a lista abaixo dos pacientes no oxig�nio menores de "
						+ "60 anos: ------\n");
				for(int i =0; i <= ultimoFila3;i++) {
					System.out.println((i+1)+"�_"+filaOxigenio3[i]);
			}
			
			
		}else if(fila==4){
			op=0;
		}else if(fila < 0 || fila > 4  ){
			System.out.println("------ N�mero inv�lido. Digite novamente. ------");
			listarElemento();
		}else {
			System.out.println("A lista Est� vazia.");
		}
		
	}



	public static void main(String[] args) {
		
		
		
		while(true){

			try{
							
				System.out.println("\n\n==========MENU==========");
				System.out.println("1 - Adicionar Paciente na fila do oxi�nio.");
				System.out.println("2 - Remover paci�nte da fila do oxig�nio.");
				System.out.println("3 - Listar lista de pacientes no oxig�nio.");
				System.out.println("4 - Sair");
				System.out.println("Informe a op��o num�rica desejada: ");
				op = input.nextInt();
				
				
					if(op == 1) {
						inserirElemento();				
					}else if(op == 2) {
						removerElemento();
					}else if(op ==3) {
						listarElemento();
					}else if(op == 4) {
						System.out.println("Obrigado por usar o programa!");
						break;
					}else {
						System.out.println("Op��o n�merica informada n�o consta na lista do menu! Entre com um"
								+ " n�mero v�lido. ");
					}
						
					
				}catch (Exception e) {
					System.out.println("\nDado incorreto. Lista finalizada.");
					break;
					
					
				}
			
		
				
		}
	}
}
