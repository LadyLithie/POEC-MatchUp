package fr.yas.matchup.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends BaseView {
	private JPasswordField textFieldPwd;
	private JTextField textFieldLogin;
	private JButton btnRegister;
	private JButton btnLogin;

	/**
	 * @return the btnRegister
	 */
	public JButton getBtnRegister() {
		return btnRegister;
	}

	/**
	 * @return the btnLogin
	 */
	public JButton getBtnLogin() {
		return btnLogin;
	}

	/**
	 * @return the textFieldPwd
	 */
	public JTextField getTextFieldPwd() {
		return textFieldPwd;
	}

	/**
	 * @param textFieldPwd the textFieldPwd to set
	 */
	public void setTextFieldPwd(JPasswordField textFieldPwd) {
		this.textFieldPwd = textFieldPwd;
	}

	/**
	 * @return the textFieldLogin
	 */
	public JTextField getTextFieldLogin() {
		return textFieldLogin;
	}

	/**
	 * @param textFieldLogin the textFieldLogin to set
	 */
	public void setTextFieldLogin(JTextField textFieldLogin) {
		this.textFieldLogin = textFieldLogin;
	}

	/**
	 * Create the frame.
	 */
	public LoginView(JFrame frame) {
		super();
		super.pageName = "Login";
		JPanel panel = new JPanel();
		super.panel = panel;

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {50, 150, 150, 20};
		gbl_panel_1.rowHeights = new int[] {60, 60, 60, 60, 60, 60, 60};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0};
		gbl_panel_1.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 1.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblIdentification = new JLabel("Identification");
		GridBagConstraints gbc_lblIdentification = new GridBagConstraints();
		gbc_lblIdentification.fill = GridBagConstraints.VERTICAL;
		gbc_lblIdentification.gridwidth = 2;
		gbc_lblIdentification.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentification.gridx = 1;
		gbc_lblIdentification.gridy = 0;
		panel_1.add(lblIdentification, gbc_lblIdentification);
		
		JLabel lblLogin = new JLabel("Login");
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.fill = GridBagConstraints.VERTICAL;
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 0;
		gbc_lblLogin.gridy = 2;
		panel_1.add(lblLogin, gbc_lblLogin);
		
		textFieldLogin = new JTextField();
		GridBagConstraints gbc_textFieldLogin = new GridBagConstraints();
		gbc_textFieldLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLogin.gridwidth = 2;
		gbc_textFieldLogin.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLogin.gridx = 1;
		gbc_textFieldLogin.gridy = 2;
		panel_1.add(textFieldLogin, gbc_textFieldLogin);
		textFieldLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 3;
		panel_1.add(lblPassword, gbc_lblPassword);
		
		textFieldPwd = new JPasswordField();
		GridBagConstraints gbc_textFieldPwd = new GridBagConstraints();
		gbc_textFieldPwd.gridwidth = 2;
		gbc_textFieldPwd.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPwd.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPwd.gridx = 1;
		gbc_textFieldPwd.gridy = 3;
		panel_1.add(textFieldPwd, gbc_textFieldPwd);
		textFieldPwd.setColumns(10);
		
		JButton btnForgottenPassword = new JButton("Forgotten Password");
		GridBagConstraints gbc_btnForgottenPassword = new GridBagConstraints();
		gbc_btnForgottenPassword.insets = new Insets(0, 0, 5, 0);
		gbc_btnForgottenPassword.gridx = 3;
		gbc_btnForgottenPassword.gridy = 3;
		panel_1.add(btnForgottenPassword, gbc_btnForgottenPassword);
		
		btnLogin = new JButton("Login");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 2;
		gbc_btnLogin.gridy = 5;
		panel_1.add(btnLogin, gbc_btnLogin);
		
		btnRegister = new JButton("Register");
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegister.gridx = 1;
		gbc_btnRegister.gridy = 5;
		panel_1.add(btnRegister, gbc_btnRegister);
	}

}
