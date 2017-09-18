import java.util.Random;
class Particle {
	Double x,y;
	
	void randomMove() {
		Random random = new Random();
		x = random.nextDouble()*400;
		y = random.nextDouble()*400;
	}

	Particle(){
		randomMove();
	}

	Particle(Double xValue,Double yValue){
		x = xValue;
		y = yValue;
	}
}