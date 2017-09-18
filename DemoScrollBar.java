import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoScrollBar extends JApplet {

    // 1. Create references to two scrollbars.

    JScrollBar horizSBar = null;
    JScrollBar vertiSBar = null;

    // 2. Create the other necessary text fields and a panel.

    JPanel panel1 = null; JPanel panel2 = null;
    JTextField tf = null;
    JTextField tf1 = null; JTextField tf2 = null;
    JTextField tf3 = null; JTextField tf4 = null;
    JTextField tf5 = null; JTextField tf6 = null;

    public void init() {

        // 3. Get a handle to the applet's container.

        Container c = this.getContentPane();
        c.setBackground(Color.lightGray);

        // 4. Create horizontal and vertical scrollbar objects.

        horizSBar = new JScrollBar(JScrollBar.HORIZONTAL,
                                   20, 60, 0, 100);
        horizSBar.setBlockIncrement(50);
        ScrollBarListener hsbListener = new ScrollBarListener();
        horizSBar.addAdjustmentListener(hsbListener);

        vertiSBar = new JScrollBar();
        vertiSBar.setOrientation(JScrollBar.VERTICAL);
        vertiSBar.setValue(10);
        vertiSBar.setVisibleAmount(30);
        vertiSBar.setMinimum(0);
        vertiSBar.setMaximum(50);
        ScrollBarListener vsbListener = new ScrollBarListener();
        vertiSBar.addAdjustmentListener(vsbListener);

        // 5. Create a panel object panel1.

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 2));

        // 6. Create a label and text field objects.
        //    and fix them to panel1

        JLabel label = new JLabel("ScrollBar selected:",
                                   JLabel.CENTER);
        tf =  new JTextField();
        panel1.add(label); panel1.add(tf);

        // 7. Create a panel object panel2.

        JPanel panel2 = new JPanel();
        GridLayout gridLayout = new GridLayout(6, 2);
        gridLayout.setHgap(20);
        panel2.setLayout(gridLayout);

        // 8. Create the following labels and text fields, and
        //    fix them to the panel2.

        JLabel label1 = new JLabel("Current Value:", JLabel.RIGHT);
        JLabel label2 = new JLabel("Visible Extent:", JLabel.RIGHT);
        JLabel label3 = new JLabel("Minimum Value:", JLabel.RIGHT);
        JLabel label4 = new JLabel("Maximum Value:", JLabel.RIGHT);
        JLabel label5 = new JLabel("Unit Increment:", JLabel.RIGHT);
        JLabel label6 = new JLabel("Block Increment:", JLabel.RIGHT);
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        panel2.add(label1); panel2.add(tf1);
        panel2.add(label2); panel2.add(tf2);
        panel2.add(label3); panel2.add(tf3);
        panel2.add(label4); panel2.add(tf4);
        panel2.add(label5); panel2.add(tf5);
        panel2.add(label6); panel2.add(tf6);

        // 9. Set the border layout for the applet's content pane
        //    and add the panels and scrollbars as give next.

        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(20);
        c.setLayout(borderLayout);
        c.add("North", panel1);
        c.add("Center", panel2);
        c.add("South", horizSBar);
        c.add("East", vertiSBar);
}

// 10. A listener class that handle the scrollbar adjustment events

class ScrollBarListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent evt) {
            JScrollBar sBar = (JScrollBar) evt.getSource();

            if (sBar.getOrientation() == 0) {
                tf.setText("HORIZONTAL");
              tf1.setText(Integer.toString(sBar.getValue()));
                tf2.setText(Integer.toString(sBar.getVisibleAmount()));
                tf3.setText(Integer.toString(sBar.getMinimum()));
                tf4.setText(Integer.toString(sBar.getMaximum()));
                tf5.setText(Integer.toString(sBar.getUnitIncrement()));
                tf6.setText(Integer.toString(sBar.getBlockIncrement()));
            }
            else if (sBar.getOrientation() == 1) {
                tf.setText("VERTICAL");
                tf1.setText(Integer.toString(sBar.getValue()));
                tf2.setText(Integer.toString(sBar.getVisibleAmount()));
                tf3.setText(Integer.toString(sBar.getMinimum()));
                tf4.setText(Integer.toString(sBar.getMaximum()));
                tf5.setText(Integer.toString(sBar.getUnitIncrement()));
                tf6.setText(Integer.toString(sBar.getBlockIncrement()));
            }
        }
    }
}