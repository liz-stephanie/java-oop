
public class Gorilla extends Mammal{
	public void throwSomething(){
		System.out.println("El gorila ha lanzado algo!");
		this.energyLevel -= 5;
	}
	public void eatBananas(){
		System.out.println("Queeeee");
		this.energyLevel += 10;
	}
	public void climb(){
		System.out.println("El gorila ha subido a la cima de un arbol");
		this.energyLevel -= 10;
	}
}

