package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Zèbre", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
	}

}
