public class Rabbit extends Participant {

	boolean sleep = false;

	public Rabbit() {
		super();
	}

	public void move() {
		if(!sleep) {

			int rand = (int) (Math.random() * 10 + 1);

			if(rand >= 1 && rand <= 2) {
				posX += 9;
			}
			else if(rand >= 3 && rand <= 5) {
				posX += 1;
			}
			else if(rand == 6) {
				posX -= 12;
			}
			else if(rand >= 7 && rand <= 8) {
				posX -= 2;
			}
			else if(rand >= 9 && rand <= 10) {
				sleep = true;
			}
			else {
				throwError();
			}

			if(posX < 0) {
				posX = 0;
			}
		}
	}

}