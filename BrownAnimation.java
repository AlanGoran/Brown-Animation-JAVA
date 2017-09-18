import java.awt.FlowLayout;
import javax.swing.*;

class BrownAnimation extends JFrame{

	static int speed=50;
	static int amount=5500;
	static View viewObject = new View();
	static Model modelObject = new Model();
	static Manipulation manipulationObject = new Manipulation();
	static Button buttonObject = new Button();

	BrownAnimation(){

		setTitle("BrownAnimation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(750,435);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		add(viewObject);
		add(manipulationObject);
		add(buttonObject);
	}

	public static void main (String [] x) {

		BrownAnimation brownAnimationObject = new BrownAnimation();
		viewObject.paint();
		(new Thread(new Simulation(modelObject,viewObject))).start();

	}
}