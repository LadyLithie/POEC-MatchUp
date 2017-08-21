/**
 * 
 */
package fr.yas.matchup.utils.views;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author Audrey
 *
 */
public class ViewsUtils {
	/**
	 * Allow to configure all screen of application with default values.
	 * @param contentPane 
	 * @param jFrame 
	 * 
	 */
	public static void configureJFrame(JFrame jFrame, JPanel contentPane) {
		// dimension des bordures
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jFrame.setContentPane(contentPane);
	}
	
	/**
	 * All to configure initial size and positionning.
	 * Set it on the center of the screen
	 * Determine close windows behavior
	 * @param jFrame
	 */
	public static void configureFirstJFrame(JFrame jFrame) {
		int frameWidth = 800;
		int frameHeight = 600;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screnHeight = (int) screenSize.getHeight();
		
		int screenMiddleWidth = (screenWidth/2) - (frameWidth/2);
		int screnMiddleHeight = (screnHeight/2) - (frameHeight/2);

		//envoie un code de retour en ligne de commande lors de la fermeture?
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// taille de la fenêtre à l'affichage
		jFrame.setBounds(screenMiddleWidth, screnMiddleHeight, frameWidth, frameHeight);

	}
}