import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

class View extends JPanel {

	View(){

		setPreferredSize(new Dimension(400,400));
		setBackground(Color.lightGray);
	}

	void paint(){

		super.paint(getGraphics());
		for(int i = 0; i<BrownAnimation.amount; i++)
			getGraphics().fillOval(Model.particleArray[i].x.intValue(),Model.particleArray[i].y.intValue(), 2, 2);

	}

}