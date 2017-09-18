class Model {

	static Particle[] particleArray = new Particle[50000];
	static PixelMatrix pixel = new PixelMatrix(); 
	Model(){

		for(int i = 0; i<50000; i++)
			particleArray[i] = new Particle();
	}

	static void moveAll(){
		
		for(int i = 0; i<BrownAnimation.amount; i++){
			
			if(particleArray[i].x > 399 || particleArray[i].x < 1 || particleArray[i].y > 399 || particleArray[i].y < 1 || pixel.pixelAvailability(particleArray[i].x.intValue(), particleArray[i].y.intValue())){
				particleArray[i] = particleArray[i];
				pixel.pixelMatrix[particleArray[i].x.intValue()][particleArray[i].y.intValue()] = true;
				}
			else
				particleArray[i].randomMove();
		}
	}
}