package b.animals;

public class Dog extends Animal {
	
	@Override
	public void speak() {
		System.out.println("woof");
	}
	
	public void bite() {
		System.out.println("bite like a dog");
	}
}
