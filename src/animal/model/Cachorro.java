package animal.model;

import coresMenu.util.Cores;

public class Cachorro extends Animal {
	
	private int porte;
	private int pelo;
	
	public Cachorro(String tutor, int especie, float idade, String nome, String raca, String cor, int numero, int porte, int pelo) {
		super(tutor, especie, idade, nome, raca, cor, numero);
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
	
	public void visualizar() {
		
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
				System.out.println();
		}
		
	}
}
