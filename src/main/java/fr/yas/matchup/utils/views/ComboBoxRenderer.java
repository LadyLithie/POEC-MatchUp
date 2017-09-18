package fr.yas.matchup.utils.views;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import fr.yas.matchup.entities.Location;
import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.RegisteredUser;

/**
 * @author Audrey
 *
 */
public class ComboBoxRenderer extends DefaultListCellRenderer {
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		if (value instanceof ContractType) {
			ContractType item = (ContractType) value;
			setText(item.getName());
			// setIcon(ingredient.getIcon());
		}else if (value instanceof Location) {
			Location item = (Location) value;
			setText(item.getPays() + ":" + item.getPostal_code() + " " + item.getCity());
		}else if (value instanceof RegisteredUser) {
			RegisteredUser item = (RegisteredUser) value;
			setText(item.getName());
		}
		return this;
	}
}