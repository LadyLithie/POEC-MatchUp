/**
 * 
 */
package fr.yas.matchup.utils.views;

import java.awt.BorderLayout;
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
		
		// set minimum size to 640x480 in case of resize
		jFrame.setMinimumSize(new Dimension(640, 480));
	}
	
	/**
	 * All to configure initial size and positioning.
	 * Set it on the center of the screen
	 * Determine close windows behavior
	 * @param jFrame
	 */
	public static void configureFirstJFrame(JFrame jFrame) {
		int frameWidth = 640;
		int frameHeight = 480;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screnHeight = (int) screenSize.getHeight();
		
		int screenMiddleWidth = (screenWidth/2) - (frameWidth/2);
		int screnMiddleHeight = (screnHeight/2) - (frameHeight/2);

		//envoie un code de retour en ligne de commande lors de la fermeture?
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// taille de la fen�tre � l'affichage
		jFrame.setBounds(screenMiddleWidth, screnMiddleHeight, frameWidth, frameHeight);

	}
	
	public static void popUp(JFrame jFrame, JPanel contentPane) {
		int frameWidth = 300;
		int frameHeigth = 225;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth  = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		
		int screenMiddleWidth = (screenWidth/2) - (frameWidth/2);
		int screenMiddleHeigth = (screenHeight/2) - (frameHeigth/2) ;
		
		jFrame.setBounds(screenMiddleWidth, screenMiddleHeigth, frameWidth, frameHeigth);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		jFrame.setContentPane(contentPane);
	}
}