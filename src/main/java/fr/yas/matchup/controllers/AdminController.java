package fr.yas.matchup.controllers;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.yas.matchup.utils.views.ViewsUtils;
import fr.yas.matchup.views.AdminView;

public class AdminController {
	
	
	private AdminView view;
	private JFrame frame;
	
	public AdminController(JFrame frame){
		this.frame=frame;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view = new AdminView(AdminController.this.frame);
					frame.setVisible(true);
					eventAddSkil();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}
	
	private void eventAddSkil() {
		// TODO Auto-generated method stub
		view.getBtnAddSkill().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==view.getBtnAddSkill()){
					JFrame frame = new JFrame("Ajouter un skill");
					JPanel p = new JPanel();
					
					ViewsUtils.popUp(frame, p);
					
					GridBagLayout gbl_contentPane = new GridBagLayout();
					gbl_contentPane.columnWidths = new int[]{0, 0, 0};
					gbl_contentPane.rowHeights = new int[]{0, 0, 0};
					gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0};
					gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0};
					p.setLayout(gbl_contentPane);
					
					JTextField text = new JTextField();
					GridBagConstraints gbc_text = new GridBagConstraints();					
					gbc_text.fill = GridBagConstraints.HORIZONTAL;
					gbc_text.gridwidth = 10;
					gbc_text.anchor = GridBagConstraints.NORTH;
					gbc_text.insets = new Insets(0, 0, 5, 5);
					gbc_text.gridx = 0;
					gbc_text.gridy = 0;
					p.add(text,gbc_text);
					
					JButton valider = new JButton("OK");
					GridBagConstraints gbc_valider = new GridBagConstraints();	
					gbc_valider.fill = GridBagConstraints.HORIZONTAL;
					gbc_valider.insets = new Insets(0, 0, 5, 5);
					gbc_valider.gridx = 0;
					gbc_valider.gridy = 1;
					p.add(valider,gbc_valider);
					
					valider.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(e.getSource()==valider){
								System.out.println("Ajout du skill "+text.getText());
								
								DefaultListModel<String> listModel = view.getListModel();
								listModel.addElement(text.getText());
								view.setListModel(listModel);
								JList<String> list = new JList<String>(listModel);
								view.setList(list);
								
								frame.dispose();
							}
						}
					});
					
					frame.setVisible(true);
				}
			}
		});
	}
}
