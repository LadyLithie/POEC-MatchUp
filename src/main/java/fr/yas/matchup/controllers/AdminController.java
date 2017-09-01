/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import fr.yas.matchup.entities.Administrator;
import fr.yas.matchup.views.PanelAdministrator;

/**
 * @author Audrey
 *
 */
public class AdminController extends BaseController {
	private Administrator user;

	private MouseListener mouseChangeAvatar;

	public AdminController(JFrame frame) {
		super.frame = frame;
		super.view = new PanelAdministrator(this.frame);
//		user = (Administrator) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		user = new Administrator();
		user.setFirstname("Hal");
		user.setLastname("One");
		user.setEmail("admin@soft.fr");
		user.setPhone("00 00 00 00 00");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		PanelAdministrator v = (PanelAdministrator) super.view;

		v.getTextField_AdminEmail().setText(user.getEmail());
		// v.getTextField_AdminName().setText(user.getName());
		v.getTextField_adminFirstName().setText(user.getFirstname());
		v.getTextField_AdminLastName().setText(user.getLastname());
		v.getTextField_AdminPhone().setText(user.getPhone());
		v.getLblPhoto().setIcon(new ImageIcon(user.getAvatar()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		PanelAdministrator v = (PanelAdministrator) super.view;
		this.mouseChangeAvatar = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				v.getLblPhoto().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				v.getLblPhoto().setToolTipText("popup de confirmation avec textfield pour new link");
				v.getLblPhoto().setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("popup de confirmation avec textfield pour new link");
			}
		};

		/*
		 * Panel presentation
		 */
		v.getBtnEditer().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (v.getBtnEditer().getText() == "Editer") {
					setMode(true);
					v.getLblPhoto().addMouseListener(mouseChangeAvatar);
				} else {
					setMode(false);
					user.setAvatar(((ImageIcon) v.getLblPhoto().getIcon()).getDescription());
					user.setFirstname(v.getTextField_adminFirstName().getText());
					user.setLastname(v.getTextField_AdminLastName().getText());
					user.setEmail(v.getTextField_AdminEmail().getText());
					user.setPhone(v.getTextField_AdminPhone().getText());
					v.getLblPhoto().removeMouseListener(mouseChangeAvatar);
				}
			}
		});
		v.getBtnAnnuler().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setMode(false);
				v.getTextField_AdminEmail().setText(user.getEmail());
				// v.getTextField_AdminName().setText(user.getName());
				v.getTextField_adminFirstName().setText(user.getFirstname());
				v.getTextField_AdminLastName().setText(user.getLastname());
				v.getTextField_AdminPhone().setText(user.getPhone());
				v.getLblPhoto().setIcon(new ImageIcon(user.getAvatar()));
			}
		});

		/*
		 * Panel Skills
		 */
		
	}

	private void setMode(boolean b) {
		PanelAdministrator v = (PanelAdministrator) super.view;

		v.getBtnAnnuler().setVisible(b);
		if (b) {
			v.getBtnEditer().setText("Valider");
		} else {
			v.getBtnEditer().setText("Editer");
		}

		// v.getTextField_AdminName().setEditable(b);
		// if (b)
		// v.getTextField_AdminName().setBorder(new TextFieldBorder());
		// else
		// v.getTextField_AdminName().setBorder(new EmptyBorder(0, 0, 0, 0));
		v.getTextField_adminFirstName().setEditable(b);
		if (b)
			v.getTextField_adminFirstName().setBorder(new TextFieldBorder());
		else
			v.getTextField_adminFirstName().setBorder(new EmptyBorder(0, 0, 0, 0));
		v.getTextField_AdminLastName().setEditable(b);
		if (b)
			v.getTextField_AdminLastName().setBorder(new TextFieldBorder());
		else
			v.getTextField_AdminLastName().setBorder(new EmptyBorder(0, 0, 0, 0));

		v.getTextField_AdminPhone().setEditable(b);
		if (b)
			v.getTextField_AdminPhone().setBorder(new TextFieldBorder());
		else
			v.getTextField_AdminPhone().setBorder(new EmptyBorder(0, 0, 0, 0));

		v.getTextField_AdminEmail().setEditable(b);
		if (b)
			v.getTextField_AdminEmail().setBorder(new TextFieldBorder());
		else
			v.getTextField_AdminEmail().setBorder(new EmptyBorder(0, 0, 0, 0));

	}

}
