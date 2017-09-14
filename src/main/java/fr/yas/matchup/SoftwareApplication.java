package fr.yas.matchup;

import fr.yas.matchup.managers.ViewsManager;

/**
 * @author Audrey
 *
 */
public class SoftwareApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty( "file.encoding", "UTF-8" );
		ViewsManager.getInstance().start();	

	}

}
