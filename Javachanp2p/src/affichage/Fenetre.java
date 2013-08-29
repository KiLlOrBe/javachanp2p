package affichage;

import javax.swing.JFrame;



public class Fenetre {
	public Fenetre(){
		JFrame fenetre = new JFrame();
        
	    //D�finit un titre pour notre fen�tre
	    fenetre.setTitle("Chat p2p");
	    //D�finit sa taille : 400 pixels de large et 100 pixels de haut
	    fenetre.setSize(400, 100);
	    //Nous demandons maintenant � notre objet de se positionner au centre
	    fenetre.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Et enfin, la rendre visible        
	    fenetre.setVisible(true);
	    
	    
	}
}
