package fr.yas.matchup.utils.views;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import fr.yas.matchup.entities.City;
import fr.yas.matchup.entities.ContractType;

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
		}else if (value instanceof City) {
			City item = (City) value;
			setText(item.getPays() + ":" + item.getDepartement() + " " + item.getName());
		}
		return this;
	}
}