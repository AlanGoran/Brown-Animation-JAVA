public class Simulation implements Runnable {

	static boolean b=true;
	static Model modelObject;
	static View viewObject;
	
	Simulation(Model m, View v){
	
		modelObject = m;
		viewObject = v;
		}
	public void run(){
	
		try{
			while(true){
				if(b==true){
					modelObject.moveAll();
					viewObject.paint();
					Thread.sleep(BrownAnimation.speed);}
				else if(b==false)
					Thread.sleep(BrownAnimation.speed);
				}
		
			}
		catch(InterruptedException e){
		
			e.printStackTrace();
		}
	}
}