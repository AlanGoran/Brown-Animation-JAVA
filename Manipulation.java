import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Manipulation extends JPanel implements AdjustmentListener{

	JScrollBar speedBar,particleAmountBar;

	Manipulation(){
		setPreferredSize(new Dimension(150,400));
		
		speedBar = new JScrollBar(JScrollBar.VERTICAL);
		particleAmountBar = new JScrollBar(JScrollBar.VERTICAL);

		speedBar.setMinimum(1);
		speedBar.setMaximum(100);
		speedBar.setValue(45);
		speedBar.setPreferredSize(new Dimension(50,250));
		
		particleAmountBar.setMinimum(1000);
		particleAmountBar.setMaximum(50000);
		particleAmountBar.setValue(25500);
		particleAmountBar.setPreferredSize(new Dimension(50,250));
		
		speedBar.addAdjustmentListener((AdjustmentListener) this);
		particleAmountBar.addAdjustmentListener((AdjustmentListener) this);
		
		JLabel speed = new JLabel(" Speed");
		JLabel particles = new JLabel("  Particles");
			
		add(speed);
		add(particles);
		add(speedBar);
		add(particleAmountBar);
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		if(e.getSource()==speedBar)
			BrownAnimation.speed = speedBar.getValue();
		else if(e.getSource()==particleAmountBar)
			BrownAnimation.amount = particleAmountBar.getValue();
		else{
			BrownAnimation.speed = speedBar.getValue();
			BrownAnimation.amount = particleAmountBar.getValue();
		}

	}
}