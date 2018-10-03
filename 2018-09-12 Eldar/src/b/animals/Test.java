package b.animals;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[3];

		animals[0] = new Cow();
		animals[1] = new Dog();
		animals[2] = new Cat();

		for (int i = 0; i < animals.length; i++) {
			Animal currAnimal = animals[i];
			currAnimal.speak();

			if (currAnimal instanceof Dog) {
				Dog dog = (Dog) animals[i];
				dog.bite();
			}

			System.out.println("========");
		}

	}

}
