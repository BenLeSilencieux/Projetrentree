import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;





public class PanelRechercher extends JPanel implements ActionListener{
	private JLabel lbl2= new JLabel(" Choisissez l'espèce et le nom de l'animal à rechercher.");
	private JTextField jtfNomRecherche= new JTextField(10);
	private JLabel resultatRecherche = new JLabel ();
	private String espece;
	private JButton btnRechercher = new JButton("Rechercher");
	private JPanel panelall=new JPanel();
	private JComboBox listeEspece;

	public PanelRechercher(){
		
		Object[] espece = new Object[]{"Chat", "Tigre", "Pigeon", "Perroquet", "Lézard", "Tortue"};
		listeEspece = new JComboBox(espece);
		resultatRecherche.setText(" ");
		btnRechercher.addActionListener(new ActionRechercher());
		
		JPanel panelEspeceRecherche = new JPanel();
		panelEspeceRecherche.setLayout(new FlowLayout());
		panelEspeceRecherche.add(listeEspece);
		panelEspeceRecherche.add(jtfNomRecherche);
		panelEspeceRecherche.add(btnRechercher);
		
		panelall.setLayout(new BorderLayout());
		panelall.add(lbl2, BorderLayout.NORTH);
		panelall.add(panelEspeceRecherche, BorderLayout.CENTER);
		panelall.add(resultatRecherche, BorderLayout.SOUTH);
		
		this.revalidate();
	
	}
	
	
	public class ActionRechercher implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			espece = (String) listeEspece.getSelectedItem();
			if(jtfNomRecherche.getText().isEmpty()){
				resultatRecherche.setText("Vous n'avez pas entrez le nom de l'animal à rechercher.");
			}
			else{
				if(espece=="Chat"){
					resultatRecherche.removeAll();
					resultatRecherche.setText((Fenetre.getMenagerie().rechercheAnimal(new Chat(jtfNomRecherche.getText(), espece))));	
				}
				else{
					if(espece=="Tigre"){
						resultatRecherche.removeAll();
						resultatRecherche.setText(Fenetre.getMenagerie().rechercheAnimal(new Tigre(jtfNomRecherche.getText(), espece)));
					}
					else{
						if(espece=="Perroquet"){
							resultatRecherche.removeAll();
							resultatRecherche.setText(Fenetre.getMenagerie().rechercheAnimal(new Perroquet(jtfNomRecherche.getText(), espece)));
						}
						else{
							if(espece=="Pigeon"){
								resultatRecherche.removeAll();
								resultatRecherche.setText(Fenetre.getMenagerie().rechercheAnimal(new Pigeon(jtfNomRecherche.getText(), espece)));
							}
							else{
								if(espece=="Lézard"){
									resultatRecherche.removeAll();
									resultatRecherche.setText(Fenetre.getMenagerie().rechercheAnimal(new Lezard(jtfNomRecherche.getText(), espece)));
									}
								else{
									if(espece=="Tortue"){
										resultatRecherche.removeAll();
										resultatRecherche.setText(Fenetre.getMenagerie().rechercheAnimal(new Tortue(jtfNomRecherche.getText(), espece)));
									}								
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel(){
		return panelall;
		
	}
	

	
}