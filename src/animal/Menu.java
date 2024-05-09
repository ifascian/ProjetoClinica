package animal;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

import coresMenu.util.Cores;
import animal.controller.AnimalController;
import animal.model.Cachorro;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalController animais = new AnimalController();
		
		Scanner input = new Scanner(System.in);
		
		Cachorro cachorro1 = new Cachorro("Isabelly Fasciana", 1, "Yuki", "Lhasa Apso", "Preta", animais.gerarNumero(), 1, 3);
		cachorro1.visualizar();
		cachorro1.visualizarPorte();
		cachorro1.visualizarPelagem();
		
		
		
		int opcao;
		
		do{
		
		System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
		
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("              Fila para Castração                    ");
		System.out.println("*****************************************************");
		System.out.println("*                                                   *");
		System.out.println("*  Escolha a opção desejada:                        *");
		System.out.println("*                                                   *");
		System.out.println("*  1 - Registrar animal                             *");
		System.out.println("*  2 - Listar animais na fila                       *");
		System.out.println("*  3 - Buscar por animal por número                 *");
		System.out.println("*  4 - Remover animal                               *");
		System.out.println("*  5 - Sair                                         *");
		System.out.println("*                                                   *");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		
		try {
			opcao = input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "\nDigite valores inteiros!");
			input.nextLine();
			opcao = 0;
			
		}
		
		if(opcao == 5) {
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND + "*****************Sistema encerrado******************");
			sobre();
			input.close();
			System.exit(0);
			
		}
		
		switch(opcao) {

		case 1:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Registrar animal\n\n");
			
			keyPress();
			break;
			
		case 2:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Animais na fila:\n\n");
			animais.listarAnimais();
			keyPress();
			break;
			
		case 3:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Digite o número de busca do animal:\n\n");
			
			keyPress();
			break;
			
		case 4:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Remova animal atendido da fila");
			
			keyPress();
			break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_BLACK_BACKGROUND + "\nOpção não válida!\n");
				keyPress();
				break;
			}
		
		
		}while(true);
	
		
	}
	public static void sobre() {
		System.out.println("*                                                  *");
		System.out.println("****************************************************");
		System.out.println("*                                                  *");
		System.out.println("* Projeto desenvoldido por:                        *");
		System.out.println("* Isabelly Fasciana - isabellyfasciana12@gmail.com *");
		System.out.println("* github.com/ifascian                              *");
		System.out.println("*                                                  *");
		System.out.println("****************************************************");
	}
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressioner Enter para Continuar...");
			System.in.read();
			
		}catch(IOException e){
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}
}

