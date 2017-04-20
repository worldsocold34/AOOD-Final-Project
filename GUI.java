import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener{
	
	private JButton fire = new JButton("Fire");
	private JButton water = new JButton("Water");
	private JButton earth = new JButton("Earth");
	private JButton air = new JButton("Air");
	Container con = getContentPane();
	
	public GUI(){
		JFrame frame = new JFrame();
		setTitle("Event Selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		con.setBackground(Color.BLUE);
		
		fire.setToolTipText("Fire: does *get fire weapon dmg here*78");
		water.setToolTipText("Water");
		earth.setToolTipText("Earth");
		air.setToolTipText("Air");
		
		add(fire);
		add(water);
		add(earth); 
		add(air);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == fire){
			//change weapon
		} else if(source == water){
			
		} else if(source == earth){
			
		} else if (source == air){
			
		}
	}

	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setSize(500, 500);
		gui.setVisible(true);

	}

}
