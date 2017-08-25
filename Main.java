class Main {

	public static void main(String[] args) {
		Participant turtle = new Turtle();
		Participant rabbit = new Rabbit();

		String[] raceTrack = new String[50];

		int counter = 0;

		// 1 represents turtle victory whilst 2 represents a highly unlikely rabbit victory.
		int wonState = 0;

		System.out.println("And they're off!");

		while(turtle.returnPosX() < 50 && rabbit.returnPosX() < 50) {

			counter += 1;

			boolean isOverLapped = turtle.returnPosX() == rabbit.returnPosX();

			for(int i = 0; i < raceTrack.length; i++) {
				raceTrack[i] = "_";
			}

			if(isOverLapped) {
				raceTrack[turtle.returnPosX()] = "X";
			}
			else {
				raceTrack[turtle.returnPosX()] = "T";
				raceTrack[rabbit.returnPosX()] = "H";
			}

			System.out.println("Turn " + counter + ": ");

			if(isOverLapped) {
				for(int i = 0; i < turtle.returnPosX(); i++) {
					System.out.print(" ");
				}

				System.out.println("Owch!");
			}
			else {
				System.out.println();
			}

			for(int i = 0; i < raceTrack.length; i++) {
				System.out.print(raceTrack[i] + " ");
			}

			System.out.println();
			System.out.println();
			System.out.println();

			turtle.move();
			rabbit.move();

			if(turtle.returnPosX() >= 50) {
				wonState = 1;
			}

			if(rabbit.returnPosX() >= 50) {
				wonState = 2;
			}

		}

		if(wonState == 1) {
			System.out.println("The turtle won!");
		} 
		else if (wonState == 2){
			System.out.println("The rabbit prevailed throughout all odds!");
		}
		else {
			System.out.println("An internal error occured.");
		}
	}
	
}