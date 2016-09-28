import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PanelAjout extends JPanel implements ActionListener{
	private JLabel lbl2= new JLabel(" Choisissez l'espèce et le nom de l'animal à ajouter.");;
	private JButton btnAjouter = new JButton("Ajouter");
	private JTextField jtfNomAnimal= new JTextField(10);
	private String espece;
	private JLabel resultatAjout = new JLabel ();
	private JPanel panelall=new JPanel();
	private JComboBox listeEspece;


	public PanelAjout(){
		
	
		Object[] espece = new Object[]{"Chat", "Tigre", "Pigeon", "Perroquet", "Lézard", "Tortue"};
		listeEspece = new JComboBox(espece);
 
		
		resultatAjout.setText(" ");
		btnAjouter.addActionListener(new ActionAjouter());
		
		JLabel lblNom=new JLabel("Entrez le nom de l'animal : ");

		JPanel panelNom=new JPanel();
		panelNom.setLayout(new FlowLayout());
		panelNom.add(lblNom);
		panelNom.add(jtfNomAnimal);
		panelNom.add(btnAjouter);
		
		
		JPanel panelEspece=new JPanel();
		panelEspece.setLayout(new FlowLayout());
		panelEspece.add(listeEspece);
		panelEspece.add(jtfNomAnimal);
		panelEspece.add(btnAjouter);
	
		
		
		panelall.setLayout(new BorderLayout());
		panelall.add(lbl2, BorderLayout.NORTH);
		panelall.add(panelEspece, BorderLayout.CENTER);
		panelall.add(resultatAjout, BorderLayout.SOUTH);
		this.revalidate();
	}
	
	
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel(){
		return panelall;
	}

	public class ActionAjouter implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			espece = (String) listeEspece.getSelectedItem();
			if(jtfNomAnimal.getText().isEmpty()){
				resultatAjout.setText("Vous n'avez pas entrez de nom pour votre animal.");
			}
			else{
				if(espece=="Chat"){
					resultatAjout.removeAll();
					resultatAjout.setText((Fenetre.getMenagerie().arriver(new Chat(jtfNomAnimal.getText(), espece))));	
				}
				else{
					if(espece=="Tigre"){
						resultatAjout.removeAll();
						resultatAjout.setText(Fenetre.getMenagerie().arriver(new Tigre(jtfNomAnimal.getText(), espece)));
					}
					else{
						if(espece=="Perroquet"){
							resultatAjout.removeAll();
							resultatAjout.setText(Fenetre.getMenagerie().arriver(new Perroquet(jtfNomAnimal.getText(), espece)));
						}
						else{
							if(espece=="Pigeon"){
								resultatAjout.removeAll();
								resultatAjout.setText(Fenetre.getMenagerie().arriver(new Pigeon(jtfNomAnimal.getText(), espece)));
							}
							else{
								if(espece=="Lézard"){
									resultatAjout.removeAll();
									resultatAjout.setText(Fenetre.getMenagerie().arriver(new Lezard(jtfNomAnimal.getText(), espece)));
									}
								else{
									if(espece=="Tortue"){
										resultatAjout.removeAll();
										resultatAjout.setText(Fenetre.getMenagerie().arriver(new Tortue(jtfNomAnimal.getText(), espece)));
									}								
								}
							}
						}
					}
				}
			}
		}
	}
}
		


