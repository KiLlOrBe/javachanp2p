package affichage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame implements ActionListener{
	private JPanel pan = new JPanel();
	private JButton boutonCreer = new JButton("Cr�er une salle");
	private JButton boutonRejoindre = new JButton("Rejoindre une salle");
 
	public Fenetre(){
		this.setTitle("Chat P2P");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		boutonCreer.addActionListener(this);
		boutonRejoindre.addActionListener(this);
		pan.add(boutonCreer);
		pan.add(boutonRejoindre);
		this.setContentPane(pan);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		if(obj.equals(boutonCreer)){
			//Cr�er une salle
			System.out.println("Cr�er une salle");
		}
		else{
			//Rejoindre une salle
			System.out.println("Rejoindre une salle");
		}
		
	}      
}