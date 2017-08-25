import java.util.Random;

public class Participant {

	protected int posX;

	public Participant() {
		posX = 0;
	}

	public int returnPosX() {
		return posX;
	}

	public void move() {
		
	}

	protected void throwError() {
		System.out.println("Invalid input detected, terminating output.");
	}
	
}