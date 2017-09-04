package fr.yas.matchup.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.yas.matchup.utils.views.ViewsUtils;



public abstract class BaseView implements IBaseView {

	protected JPanel panel;
	protected String pageName;

	/**
	 * @return the pageName
	 */
	public String getPageName() {
		return pageName;
	}

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return panel;
	}

	//Interface override
	/**
	 * load a view on a current frame by overriding its contents
	 */
	@Override
	public void loadView(JFrame frame) {
		frame.setTitle(getPageName());
		ViewsUtils.configureJFrame(frame, getContentPane());
	}
}
