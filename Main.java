class Main {

	public static void main(String[] args) {
		Participant turtle = new Turtle();
		Participant rabbit = new Rabbit();

		System.out.println("And they're off!");

		while(turtle.returnPosX() < 50 && rabbit.returnPosX() < 50) {
			turtle.move();
			rabbit.move();
			System.out.println("Turtle's position: " + turtle.returnPosX());
			System.out.println("Rabbit's position: " + rabbit.returnPosX());
		}
	}
	
}