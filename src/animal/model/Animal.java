package animal.model;

import coresMenu.util.Cores;

public abstract class Animal {
	
	private String tutor;
	private float idade;
	private String nome;
	private String raca;
	private String cor;
	private int numero;
	
	public Animal(String tutor, float idade, String nome, String raca, String cor, int numero) {
		this.tutor = tutor;
		this.idade = idade;
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.numero = numero;
		
	}
	
	

	public String getTutor() {
		return tutor;
	}



	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public float getIdade() {
		return idade;
	}



	public void setIdade(float idade) {
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void visualizar() {
		
	
		
		System.out.println("\n\n**********************************");
		System.out.println("Dados da conta:                   ");
		System.out.println("**********************************");
		System.out.println("Número: " + this.getNumero());
		System.out.println("Nome do tutor: " + this.getTutor());
		System.out.println("Raça do cachorro: " + this.getRaca());
		System.out.println("Nome do animal: " + this.getNome());
		System.out.println("Idade: " + this.getIdade() + " meses/anos");
		System.out.println("Cor da pelagem: " + this.getCor()); 
	}
	
}
