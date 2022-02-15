package hw8Q2Inheritance;

import java.net.CacheRequest;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n........................\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n........................\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		// here birds is child class and animal is parent class.
		// here birds extends animal so it is single inheritance.
		// mammal extends Animal, reptile extends Animal, Bird extends Animal so
		// Hierarchical inheritance happened in this page.
		System.out.println("\n........................\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n........................\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.animalInfo();
		dog.animalInfo();

		System.out.println("\n........................\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n........................\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		// bulldog is child class and dog is parent class.
		// here bulldog extends dog, dog extend mammal, mammal extends animal,
		// multilevel inheritance happened here.
		System.out.println("\n........................\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n........................\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}
}
