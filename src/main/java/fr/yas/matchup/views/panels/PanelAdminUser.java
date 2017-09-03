package fr.yas.matchup.views.panels;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;

/**
 * @author Audrey
 *
 */
public class PanelAdminUser extends JPanel {

	private JTextField textFieldNameUser;
	private JTextField textFieldMailUser;
	private JTextField textFieldTypeUser;
	private JTextField textFieldCreationUser;
	private JButton btnValidateUser;
	private JButton btnDeleteUser;
	private JButton btnResetPasswordUser;
	private JLabel lblName;
	private JLabel lblEmail;
	private JLabel lblDateCreation;
	private JLabel lblType;

	/**
	 * @return the btnValidateUser
	 */
	public JButton getBtnValidateUser() {
		return btnValidateUser;
	}

	/**
	 * @return the btnDeleteUser
	 */
	public JButton getBtnDeleteUser() {
		return btnDeleteUser;
	}

	/**
	 * @return the btnResetPasswordUser
	 */
	public JButton getBtnResetPasswordUser() {
		return btnResetPasswordUser;
	}

	/**
	 * @return the lblName
	 */
	public JLabel getLblName() {
		return lblName;
	}

	/**
	 * @return the lblEmail
	 */
	public JLabel getLblEmail() {
		return lblEmail;
	}

	/**
	 * @return the lblDateCreation
	 */
	public JLabel getLblDateCreation() {
		return lblDateCreation;
	}

	/**
	 * @return the lblType
	 */
	public JLabel getLblType() {
		return lblType;
	}

	/**
	 * Create the panel.
	 */
	public PanelAdminUser() {
		super();
		setLayout(new GridLayout(1, 0, 0, 0));
//		textFieldNameUser = new JTextField();
//		textFieldNameUser.setEditable(false);
//		GridBagConstraints gbc_textFieldNameUser = new GridBagConstraints();
//		gbc_textFieldNameUser.insets = new Insets(0, 0, 5, 5);
//		gbc_textFieldNameUser.fill = GridBagConstraints.HORIZONTAL;
//		add(textFieldNameUser);
//		textFieldNameUser.setColumns(10);
//		
//		textFieldMailUser = new JTextField();
//		textFieldMailUser.setEditable(false);
//		GridBagConstraints gbc_textFieldMailUser = new GridBagConstraints();
//		gbc_textFieldMailUser.insets = new Insets(0, 0, 5, 5);
//		gbc_textFieldMailUser.fill = GridBagConstraints.HORIZONTAL;
//		add(textFieldMailUser);
//		textFieldMailUser.setColumns(10);
//		
//		textFieldTypeUser = new JTextField();
//		textFieldTypeUser.setEditable(false);
//		GridBagConstraints gbc_textFieldTypeUser = new GridBagConstraints();
//		gbc_textFieldTypeUser.insets = new Insets(0, 0, 5, 5);
//		gbc_textFieldTypeUser.fill = GridBagConstraints.HORIZONTAL;
//		add(textFieldTypeUser);
//		textFieldTypeUser.setColumns(10);
//		
//		textFieldCreationUser = new JTextField();
//		textFieldCreationUser.setEditable(false);
//		GridBagConstraints gbc_textFieldCreationUser = new GridBagConstraints();
//		gbc_textFieldCreationUser.insets = new Insets(0, 0, 5, 5);
//		gbc_textFieldCreationUser.fill = GridBagConstraints.HORIZONTAL;
//		add(textFieldCreationUser);
//		textFieldCreationUser.setColumns(10);

		
		lblName = new JLabel("Name");
		add(lblName);
		
		lblEmail = new JLabel("Email");
		add(lblEmail);
		
		lblType = new JLabel("Type");
		add(lblType);
		
		lblDateCreation = new JLabel("Date de cr\u00E9ation");
		add(lblDateCreation);
		
		btnValidateUser = new JButton("Validate");
		GridBagConstraints gbc_btnValidateUser = new GridBagConstraints();
		gbc_btnValidateUser.insets = new Insets(0, 0, 5, 5);
		add(btnValidateUser,gbc_btnValidateUser);
		
		btnDeleteUser = new JButton("Delete");
		GridBagConstraints gbc_btnDeleteUser = new GridBagConstraints();
		gbc_btnDeleteUser.insets = new Insets(0, 0, 5, 5);
		add(btnDeleteUser,gbc_btnDeleteUser);
		
		btnResetPasswordUser = new JButton("Reset password");
		GridBagConstraints gbc_btnResetPasswordUser = new GridBagConstraints();
		gbc_btnResetPasswordUser.insets = new Insets(0, 0, 5, 5);
		add(btnResetPasswordUser,gbc_btnResetPasswordUser);
	}

}
