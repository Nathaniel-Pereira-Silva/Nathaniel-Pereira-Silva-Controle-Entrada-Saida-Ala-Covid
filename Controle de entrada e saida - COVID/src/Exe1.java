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
				System.out.println("\nEssa fila está vazia");
			}else if(idade == 1) {
				System.out.println("------Qual paciente você deseja remover do oxigênio? Entre "
						+ "com um número. ------");
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
				System.out.println("------Qual paciente você deseja remover do oxigênio? Entre "
						+ "com um número. ------");
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
				System.out.println("------Qual paciente você deseja remover do oxigênio? Entre "
						+ "com um número. ------");
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
				System.out.println("A fila de pessoas menores de 18 anos está cheia. Não foi possível colocar "
						+ paciente+" em um oxigênio.");
			}else {
				ultimoFila1++;
				filaOxigenio1[ultimoFila1] = paciente;
				System.out.println();
				}
			
			
		}else if(idade == 2) {
			if(ultimoFila2 == limite-1) {
				System.out.println("A fila de pessoas maiores de 18 anos está cheia. Não foi possível colocar "
						+ paciente+" em um oxigênio.");
			}else {
				ultimoFila2++;
				filaOxigenio2[ultimoFila2] = paciente;
				System.out.println();
				}
			
			
		}else if(idade == 3) {
			if(ultimoFila3 == limite-1) {
				System.out.println("A fila de pessoas menores de 60 anos está cheia. Não foi possível colocar "
						+ paciente+" em um oxigênio.");
			}else {
				ultimoFila3++;
				filaOxigenio3[ultimoFila3] = paciente;
				System.out.println();
				}
		}else if(idade == 4){
			op=0;
		}else{

			System.out.println("insira um comando válido.");
			inserirElemento();
		}
	}
	
	
	
	
	private static void removerElemento() {
		int consultar;
		
		System.out.println("------Deseja consultar uma fila para remover algum paciente ?------\n"
				+ "1_Sim\n"
				+ "2_Não\n"
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
			System.out.println("Comando invaálido");
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
					System.out.println("\n------ Segue a lista abaixo dos pacientes no oxigênio menores de "
							+ "18 anos: ------\n");
					for(int i =0; i <= ultimoFila1;i++) {
						System.out.println((i+1)+"°_"+filaOxigenio1[i]);
					
					}
				
		
		}else if(fila == 2 && ultimoFila2 >= 0) {
			
				System.out.println("\n------ Segue a lista abaixo dos pacientes no oxigênio maiores de "
						+ "18 a 60 anos: ------\n");
				for(int i =0; i <= ultimoFila2;i++) {
					System.out.println((i+1)+"°_"+filaOxigenio2[i]);
				}
				
			
			
		}else if(fila == 3 && ultimoFila3 >= 0) {
				System.out.println("\n------ Segue a lista abaixo dos pacientes no oxigênio menores de "
						+ "60 anos: ------\n");
				for(int i =0; i <= ultimoFila3;i++) {
					System.out.println((i+1)+"°_"+filaOxigenio3[i]);
			}
			
			
		}else if(fila==4){
			op=0;
		}else if(fila < 0 || fila > 4  ){
			System.out.println("------ Número inválido. Digite novamente. ------");
			listarElemento();
		}else {
			System.out.println("A lista Está vazia.");
		}
		
	}



	public static void main(String[] args) {
		
		
		
		while(true){

			try{
							
				System.out.println("\n\n==========MENU==========");
				System.out.println("1 - Adicionar Paciente na fila do oxiênio.");
				System.out.println("2 - Remover paciênte da fila do oxigênio.");
				System.out.println("3 - Listar lista de pacientes no oxigênio.");
				System.out.println("4 - Sair");
				System.out.println("Informe a opção numérica desejada: ");
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
						System.out.println("Opção númerica informada não consta na lista do menu! Entre com um"
								+ " número válido. ");
					}
						
					
				}catch (Exception e) {
					System.out.println("\nDado incorreto. Lista finalizada.");
					break;
					
					
				}
			
		
				
		}
	}
}
