package fr.yas.matchup.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import fr.yas.matchup.utils.views.ViewsUtils;



public class AdminView {
	
	private JPanel contentPane;
	private JFrame frame;
	private JLabel lblListeDeSkills;
	private DefaultListModel<String> listModel;
	private JButton btnAddSkill;
	private JList<String> list ;
	
	
	public AdminView(JFrame frame){
		this.frame=frame;
		contentPane = new JPanel();
		
		ViewsUtils.configureJFrame(frame,contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
		lblListeDeSkills = new JLabel("Liste de Skills");
		GridBagConstraints gbc_lblListeDeSkills = new GridBagConstraints();
		gbc_lblListeDeSkills.anchor = GridBagConstraints.NORTH;
		gbc_lblListeDeSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeDeSkills.gridx = 1;
		gbc_lblListeDeSkills.gridy = 1;
		contentPane.add(lblListeDeSkills, gbc_lblListeDeSkills);
		
		JCheckBox box = new JCheckBox("Java");
		
		listModel = new DefaultListModel<String>();		
		listModel.addElement("Bonjour");
		
		list = new JList<String>(listModel);
		
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 14;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;				
		contentPane.add(list, gbc_list);
		
		btnAddSkill = new JButton("Add Skill");
		GridBagConstraints gbc_btnSelectSkill = new GridBagConstraints();
		gbc_btnSelectSkill.insets = new Insets(0, 0, 0, 5);
		gbc_btnSelectSkill.gridx = 1;
		gbc_btnSelectSkill.gridy = 16;
		contentPane.add(btnAddSkill, gbc_btnSelectSkill);
		
	}
	
	public JList<String> getList() {
		return list;
	}

	public void setList(JList<String> list) {
		this.list = list;
	}

	public JLabel getLblListeDeSkills() {
		return lblListeDeSkills;
	}

	public void setLblListeDeSkills(JLabel lblListeDeSkills) {
		this.lblListeDeSkills = lblListeDeSkills;
	}

	public DefaultListModel<String> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<String> listModel) {
		this.listModel = listModel;
	}

	public JButton getBtnAddSkill() {
		return btnAddSkill;
	}

	public void setBtnAddSkill(JButton btnAddSkill) {
		this.btnAddSkill = btnAddSkill;
	}

}
