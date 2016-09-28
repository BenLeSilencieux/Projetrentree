// Importation du package permettant de cr�er l'interface
import javax.swing.*;
// Importation du package awt permettant de g�rer certains objets
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener{
	private JPanel panel ;
	private JPanel panel1=new JPanel() ;
	private JLabel lbl= new JLabel("Bienvenue sur le Logiciel MyMenagerie.");
	private JLabel lbl1= new JLabel("Ici, vous pourrez g�rer votre m�nagerie comme bon vous semble (Ajout, Suppression, Recherche).");
	private JLabel lbl2= new JLabel("Il ne vous reste qu'� choisir ce que vous voulez faire.");
	private static Menagerie maMenagerie = new Menagerie();
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem ajouter = new JMenuItem("Ajouter");
	private JMenuItem supprimer = new JMenuItem("Supprimer");
	private JMenuItem rechercher = new JMenuItem("Rechercher");
	private JMenuItem contenu = new JMenuItem("Voir le contenu");
	private JMenuItem apropos = new JMenuItem("� propos");
	private JMenuItem quit = new JMenuItem("Quitter");
	
	
	
	
	public Fenetre(){
		this.setTitle("MyMenagerie"); // Donner un titre � la fen�tre
		
		/* La m�thode setLocationRelativeTo permet de d�terminer le positionnement de la fen�tre. Si
		le param�tre est null, la fen�tre sera centr�e.*/
		this.setLocationRelativeTo(null);
		
		// Fermeture de la fen�tre lorsque l'on clique sur la croix (sinon la fen�tre sera ferm�e mais le programme toujours en cours d'ex�cution)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* La m�thode setSize permet de d�terminer la taille. Les deux param�tres correspondent
		respectivement � la largeur puis � la hauteur, le tout exprim� en pixels.*/
		this.setSize(600, 200);
		this.setResizable(true); // On interdit le redimensionnement de la fen�tre
		
		ajouter.addActionListener(new ActionAjouter());
		supprimer.addActionListener(new ActionSupprimer());
		contenu.addActionListener(new ActionAfficher());
		rechercher.addActionListener(new ActionRechercher());
		apropos.addActionListener(new ActionPropos());
		quit.addActionListener(new Quitter()); 
		
		this.lbl.setHorizontalAlignment(JLabel.CENTER);
		this.lbl1.setHorizontalAlignment(JLabel.CENTER);
		this.lbl2.setHorizontalAlignment(JLabel.CENTER);

		ajouter.setPreferredSize(new Dimension(10,ajouter.getPreferredSize().height));
		supprimer.setPreferredSize(new Dimension(20,getPreferredSize().height));
		rechercher.setPreferredSize(new Dimension(20,getPreferredSize().height));
		contenu.setPreferredSize(new Dimension(30,getPreferredSize().height));
		apropos.setPreferredSize(new Dimension(20,getPreferredSize().height));
		quit.setPreferredSize(new Dimension(10,getPreferredSize().height));
		
	    this.menuBar.add(ajouter);
	    this.menuBar.add(supprimer);
	    this.menuBar.add(rechercher);
	    this.menuBar.add(contenu);
	    this.menuBar.add(apropos);
	    this.menuBar.add(quit);
	    this.setJMenuBar(menuBar);
		
		panel = new JPanel ( ) ;
		panel.setLayout(new BorderLayout());
		panel.add(lbl, BorderLayout.NORTH);
		panel.add(lbl1,BorderLayout.CENTER);
		panel.add(lbl2,BorderLayout.SOUTH);
		
		
		
		
		// On ajoute le JPanel au conteneur principal :
		this.getContentPane().add(panel);
				
		this.setVisible(true); // Par d�faut la fen�tre est invisible. Derni�re instruction du constructeur
	}
	

	
	
	
	public void ChangerPanelChoixAjout(){
		panel1.removeAll();
		PanelAjout lePanel = new PanelAjout();
		panel1.add(lePanel.getPanel());
		this.setContentPane(panel1);
		this.revalidate();

		
	}
					
	public void ChangerPanelSupprimer(){
		panel1.removeAll();
		PanelSupprimer lePanel = new PanelSupprimer();
		panel1.add(lePanel.getPanel());
		this.setContentPane(panel1);
		this.revalidate();
	}

	public void ChangerPanelAfficher(){
		panel1.removeAll();
		PanelAfficher lePanel = new PanelAfficher();;
		panel1.add(lePanel.getPanel());
		this.setContentPane(panel1);
		this.revalidate();
	}
	
	public void ChangerPanelRechercher(){
		panel1.removeAll();
		PanelRechercher lePanel = new PanelRechercher();
		panel1.add(lePanel.getPanel());
		this.setContentPane(panel1);
		this.revalidate();
	
	}
	
	public void ChangerPanelPropos(){
		panel1.removeAll();
		APropos lePanel = new APropos();
		panel1.add(lePanel.getPanel());
		this.setContentPane(panel1);
		this.revalidate();
	}

	public class ActionAjouter implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Fenetre.this.ChangerPanelChoixAjout();
		}
	}
	
	public class ActionSupprimer implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Fenetre.this.ChangerPanelSupprimer();
		}
	}
	
	public class ActionAfficher implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Fenetre.this.ChangerPanelAfficher();
		}
	}
	
	public class ActionRechercher implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Fenetre.this.ChangerPanelRechercher();
		}
	}
	
	public class ActionPropos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Fenetre.this.ChangerPanelPropos();
		}	
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}

	public class Quitter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}
	

	public static Menagerie getMenagerie(){
		return maMenagerie;
	}

}
	

	

