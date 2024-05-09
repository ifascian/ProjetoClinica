package animal.repository;

import animal.model.Animal;

public interface AnimalRepository {
	
	
	public void procurarPorNumero(int numero);
	public void registrar(Animal animal);
	public void listarAnimais();
	public void removerAnimal(int numero);
	

}
