import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		RegrasDeNegocios RegrasDeNegocios = new RegrasDeNegocios();
		
		
		
		String op = RegrasDeNegocios.getOp();
			
			
		while(true){
	
			try{
								
				System.out.println("\n\n==========MENU==========");
				System.out.println("1 - Adicionar Paciente na fila do oxi�nio.");
				System.out.println("2 - Remover paci�nte da fila do oxig�nio.");
				System.out.println("3 - Listar lista de pacientes no oxig�nio.");
				System.out.println("4 - Sair");
				System.out.println("Informe a op��o num�rica desejada: ");
				op = input.nextLine();
					
				switch(op) {
					case "1":
						RegrasDeNegocios.inserirElemento();
						break;
					case  "2" :
						RegrasDeNegocios.removerElemento(); 
						break;
					case "3" :
						RegrasDeNegocios.listarElemento();
						break;
					case  "4" :
						System.out.println("Obrigado por usar o programa!");
						break;
					default:
						System.out.println("Op��o n�merica informada n�o consta na lista do menu! Entre com um"
								+ " n�mero v�lido. ");
							
					
					
				}
					
		
			}catch (Exception e) {
				System.out.println("\nDado incorreto. Lista finalizada.");
				break;
			}
			 		
		}
		
		input.close();
	}
}
