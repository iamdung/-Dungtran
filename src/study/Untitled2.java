package study;
class Animal{
	public void animalSound() {
		System.out.println("Thí animal can make a sound");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("The dog say:gau gau");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("The pig say:ec ec");
	}
}
class OuterClass{
	int x = 10;
	public class InnerClass{
		int y = 5;
	}
}
public class Untitled2 {

	public static void main(String[] args) {
		OuterClass s = new OuterClass();
		OuterClass.InnerClass f = s.new InnerClass();
		Animal a = new Animal();
		Animal myDog = new Dog();
		Animal myPig = new Pig();
		a.animalSound();
		myDog.animalSound();
		myPig.animalSound();
		System.out.println(s.x);
		System.out.println(f.y);

	}

}
