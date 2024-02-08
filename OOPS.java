interface Animal {
	
	default void walk() {
	
}
class Horse implements Animal {
	
	public void walk() {
		System.out.println("Horse walk 4 legs");
	}
}

 class Chicken implements Animal {
	
	public void walk() {
		System.out.println(" Chicken walk 2 legs");
	}
}


 public class OOPS {
	public static void main(String [] args) {
		Horse horse = new Horse();
		horse.walk();
		


		Chicken chicken = new Chicken();
		chicken.walk();
	}
}
}