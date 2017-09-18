import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class Button extends JPanel implements ActionListener{
	
	JButton button1,button2,button3;
	
	Button(){
		setPreferredSize(new Dimension(175,400));
		
		button1 = new JButton("Start");
		button2 = new JButton("Stop");
		button3 = new JButton("Exit");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		add(button1);
		add(button2);
		add(button3);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1)
			Simulation.b=true;
		else if(e.getSource()==button2)
			Simulation.b=false;
		else if(e.getSource()==button3)
			System.exit(0);
	}
}