package animal.model;

import coresMenu.util.Cores;

public class Cachorro extends Animal {
	
	private int porte;
	private int pelo;
	
	public Cachorro(String tutor, float idade, String nome, String raca, String cor, int numero, int porte, int pelo) {
		super(tutor, idade, nome, raca, cor, numero);
		// TODO Auto-generated constructor stub
		this.porte = porte;
		this.pelo = pelo;
		
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public int getPelo() {
		return pelo;
	}

	public void setPelo(int pelo) {
		this.pelo = pelo;
	}
	
public void visualizarPelagem() {
		
		String pelo = "";
		
		switch(this.pelo){
		
		case 1:
			pelo = "Cachorro";
			break;
			
		case 2:
			pelo = "Gato";
			break;
		
		case 3:
			pelo = "Comprida";
			break;
			default:
				System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "\n\nOpção inválida");
				break;
		}
		System.out.println("\n\n**********************************");
		System.out.println("Dados da conta:                   ");
		System.out.println("**********************************");
		System.out.println("Número: " + this.getNumero());
		System.out.println("Nome do tutor: " + this.getTutor());
		System.out.println("Nome do animal: " + this.getNome());
		System.out.println("Idade: " + this.getIdade() + " anos");
		System.out.println("Raça: " + this.getRaca());
		System.out.println("Cor da pelagem: " + this.getCor()); 
		System.out.println("Tamanho da pelagem: " + pelo);
	}
	
	public void visualizarPorte() {
		
		String porte = "";
		
		switch(this.porte) {
		
		case 1:
			porte = "Pequeno";
			 break;
			 
		case 2:
			porte = "Médio";
			 break;
			
		case 3:
			porte = "Grande";
			break;
		
			default:
				System.out.println("\n\nOpção inválida!");
				break;
		}
		System.out.println("Porte do cachorro: " + porte);
		
	}
	
	
}
