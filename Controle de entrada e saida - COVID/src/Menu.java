import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		RegraDeNegocio inserirElemento = new RegraDeNegocio();
		
		
		
		int op = RegraDeNegocio.op = 0;
			
			
		while(true){
	
			try{
								
				System.out.println("\n\n==========MENU==========");
				System.out.println("1 - Adicionar Paciente na fila do oxiênio.");
				System.out.println("2 - Remover paciênte da fila do oxigênio.");
				System.out.println("3 - Listar lista de pacientes no oxigênio.");
				System.out.println("4 - Sair");
				System.out.println("Informe a opção numérica desejada: ");
				op = input.nextInt();
					
				switch(op) {
					case 1:
						RegraDeNegocio.inserirElemento();
						break;
					case   2 :
						RegraDeNegocio.removerElemento(); 
						break;
					case 3 :
						RegraDeNegocio.listarElemento();
						break;
					case  4 :
						System.out.println("Obrigado por usar o programa!");
						break;
					default:
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
