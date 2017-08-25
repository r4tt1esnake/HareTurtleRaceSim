public class Turtle extends Participant {

	public Turtle() {
		super();
	}

	public void move() {
		int rand = (int) (Math.random() * 10 + 1);

		if(rand >= 1 && rand <= 5) {
			posX += 3;
		}
		else if(rand >= 6 && rand <= 8) {
			posX += 1;
		}
		else if (rand >= 9 && rand <= 10) {
			posX -= 6;
		}
		else {
			throwError();
		}

		if(posX < 0) {
			posX = 0;
		}
	}

}