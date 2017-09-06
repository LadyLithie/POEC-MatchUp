package fr.yas.matchup.controllers;

import javax.swing.JFrame;

public interface IBaseController {
	public BaseController loadController(JFrame frame);
	public void initEvent();
	public void initView();
	public void setupDatas();
	public void onExit();
	public void onEnter();
}
