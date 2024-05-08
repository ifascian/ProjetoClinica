package animal.model;

public class Animal {
	
	private String tutor;
	private int especie;
	private float idade;
	private String nome;
	private String raca;
	private String cor;
	private int numero;
	
	public Animal(String tutor, int especie, float idade, String nome, String raca, String cor, int numero) {
		this.tutor = tutor;
		this.especie = especie;
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



	public int getEspecie() {
		return especie;
	}



	public void setEspecie(int especie) {
		this.especie = especie;
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



	public boolean meses(int idade) {
		if (this.getIdade() < 0.3) {
			System.out.println("Cachoro muito novo para castração!");
			return false;
		}
		
		System.out.println("Cachoro liberado para castração");
		return true;
	}

	public void visualizar() {
		
		String especie = "";
		
		switch(this.especie){
		
		case 1:
			especie = "Cachorro";
			break;
			
		case 2:
			especie = "Gato";
			break;
		}
		
		System.out.println("\n\n*********************************");
		System.out.println("Dados da conta:                   ");
		System.out.println("**********************************");
		System.out.println("Número: " + this.numero);
		System.out.println("Nome do tutor: " + this.tutor);
		System.out.println("Espéciel do animal: " + especie);
		System.out.println("Nome do animal: " + this.nome);
		System.out.println("Idade: " + this.idade + " meses/anos");
		System.out.println("Raça: " + this.raca);
		System.out.println("Cor da pelagem: " + this.cor);
		
	}

}
