import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener
{
	private JButton compose,breakmsg;

	Home()
	{
		super("Steganography");
		Container con=getContentPane();
		con.setLayout(null);
		compose=new JButton("Compose");
		compose.addActionListener(this);
		compose.setBounds(300,350,150,50);
		breakmsg=new JButton("Break");
		breakmsg.addActionListener(this);
		breakmsg.setBounds(550,350,150,50);
		con.add(compose);
		con.add(breakmsg);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==compose)
		{
			this.dispose();
			ComposePage cp=new ComposePage();
			cp.setSize(1035,790);
			cp.setVisible(true);
		}

		if(ae.getSource()==breakmsg)
		{
			this.dispose();
			BreakPage bp=new BreakPage();
			bp.setSize(1035,790);
			bp.setVisible(true);
		}
	}
	
	public static void main(String args[])
	{
		Home h=new Home();
		h.setSize(1035,790);
		h.setVisible(true);
	}
}