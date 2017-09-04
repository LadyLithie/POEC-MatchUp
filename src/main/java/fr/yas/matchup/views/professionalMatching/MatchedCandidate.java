package fr.yas.matchup.views.professionalMatching;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JList;

public class MatchedCandidate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchedCandidate frame = new MatchedCandidate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MatchedCandidate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {75, 80, 100, 100, 30, 120, 75};
		gbl_contentPane.rowHeights = new int[] {50, 50, 50, 50, 50};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPhoto = new JLabel("");
		lblPhoto.setIcon(new ImageIcon(MatchedCandidate.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
		GridBagConstraints gbc_lblPhoto = new GridBagConstraints();
		gbc_lblPhoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoto.gridx = 0;
		gbc_lblPhoto.gridy = 0;
		contentPane.add(lblPhoto, gbc_lblPhoto);
		
		JLabel lblPrenom = new JLabel("Prenom");
		GridBagConstraints gbc_lblPrenom = new GridBagConstraints();
		gbc_lblPrenom.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenom.gridx = 1;
		gbc_lblPrenom.gridy = 0;
		contentPane.add(lblPrenom, gbc_lblPrenom);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblPourcentage = new JLabel("<html>Pourcentage<br>matching</html>");
		GridBagConstraints gbc_lblPourcentage = new GridBagConstraints();
		gbc_lblPourcentage.insets = new Insets(0, 0, 5, 5);
		gbc_lblPourcentage.gridx = 5;
		gbc_lblPourcentage.gridy = 0;
		contentPane.add(lblPourcentage, gbc_lblPourcentage);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 6;
		gbc_textField_3.gridy = 0;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.gridx = 1;
		gbc_lblNom.gridy = 1;
		contentPane.add(lblNom, gbc_lblNom);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCompetencePossdes = new JLabel("<html>Competences<br>possédées</html> ");
		GridBagConstraints gbc_lblCompetencePossdes = new GridBagConstraints();
		gbc_lblCompetencePossdes.gridwidth = 2;
		gbc_lblCompetencePossdes.insets = new Insets(0, 0, 5, 5);
		gbc_lblCompetencePossdes.gridx = 5;
		gbc_lblCompetencePossdes.gridy = 1;
		contentPane.add(lblCompetencePossdes, gbc_lblCompetencePossdes);
		
		JLabel lblAge = new JLabel("Age");
		GridBagConstraints gbc_lblAge = new GridBagConstraints();
		gbc_lblAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblAge.gridx = 1;
		gbc_lblAge.gridy = 2;
		contentPane.add(lblAge, gbc_lblAge);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 2;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.gridheight = 2;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 5;
		gbc_list.gridy = 2;
		contentPane.add(list, gbc_list);
		
		JLabel lblAdresseEmail = new JLabel("<html>Adresse<br>e-mail</html>");
		GridBagConstraints gbc_lblAdresseEmail = new GridBagConstraints();
		gbc_lblAdresseEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseEmail.gridx = 1;
		gbc_lblAdresseEmail.gridy = 3;
		contentPane.add(lblAdresseEmail, gbc_lblAdresseEmail);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JButton btnRetour = new JButton("Retour");
		GridBagConstraints gbc_btnRetour = new GridBagConstraints();
		gbc_btnRetour.insets = new Insets(0, 0, 0, 5);
		gbc_btnRetour.gridwidth = 7;
		gbc_btnRetour.gridx = 0;
		gbc_btnRetour.gridy = 4;
		contentPane.add(btnRetour, gbc_btnRetour);
	}

}
