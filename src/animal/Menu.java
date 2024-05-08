package animal;

import java.util.Scanner;
import coresMenu.util.*;
import animal.model.Animal;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Isabelly Fasciana", 1, 1, "Yuki", "Lhasa apso", "preto", 1);
		animal1.visualizar();
		animal1.meses(1);
		animal1.visualizar();
		
		Scanner input = new Scanner(System.in);
		
		
		int opcao;
		
		while(true) {
		
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
		System.out.println("*  3 - Buscar por número                            *");
		System.out.println("*  4 - Remover animal da fila                       *");
		System.out.println("*  5 - Sair                                         *");
		System.out.println("*                                                   *");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		
		opcao = input.nextInt();
		
		if(opcao == 5) {
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND + "*****************Sistema encerrado******************");
			sobre();
			input.close();
			System.exit(0);
			
		}
		
		switch(opcao) {

		case 1:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Registrar animal\n\n");
			break;
			
		case 2:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Animais na fila:\n\n");
			break;
			
		case 3:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Digite o número de busca do animal:\n\n");
			break;
			
		case 4:
			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + "Remova animal atendido da fila");
			break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_BLACK_BACKGROUND + "\nOpção não válida!\n");
				break;
			}
		}
	
		
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
}

