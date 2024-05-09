package animal.controller;

import animal.model.Animal;
import animal.repository.AnimalRepository;
import java.util.ArrayList;

public class AnimalController implements AnimalRepository {
	
	private ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrar(Animal animal) {
		// TODO Auto-generated method stub
		listaAnimais.add(animal);
		System.out.println("\nO registro número: " + animal.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void listarAnimais() {
		// TODO Auto-generated method stub
		for (var animal : listaAnimais) {
			animal.visualizar();
		}
		
	}

	@Override
	public void removerAnimal(int numero) {
		// TODO Auto-generated method stub
		
	} public int gerarNumero() {
		return ++ numero;
	}

}
