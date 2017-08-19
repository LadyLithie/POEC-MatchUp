package fr.yas.matchup.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

import fr.yas.matchup.views.BaseView;

public abstract class BaseController implements IBaseController {
	protected JFrame frame;
	protected BaseView view;
	protected Map<String,Object> viewDatas = new HashMap<String, Object>();

	/**
	 * @return the view
	 */
	public BaseView getView() {
		return view;
	}

	/**
	 * @param viewDatas the viewDatas to set
	 */
	public void setViewDatas(Map<String, Object> viewDatas) {
		this.viewDatas = viewDatas;
	}

	/**
	 * @return the viewDatas
	 */
	public Map<String, Object> getViewDatas() {
		return viewDatas;
	}

	@Override
	public BaseController loadController(JFrame frame) {
		getView().loadView(frame);
		initView();
		initEvent();
		setupDatas();
		return this;
	}

	@Override
	public void initView() {
	}

	@Override
	public void setupDatas() {
	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.controllers.IBaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.controllers.IBaseController#onExit()
	 */
	@Override
	public void onExit() {

	}

	/* (non-Javadoc)
	 * @see imiepoecjava2017.controllers.IBaseController#onEnter()
	 */
	@Override
	public void onEnter() {
		// TODO Auto-generated method stub

	}
}
