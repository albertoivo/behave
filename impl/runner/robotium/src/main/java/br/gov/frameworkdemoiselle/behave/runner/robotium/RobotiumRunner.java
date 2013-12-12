package br.gov.frameworkdemoiselle.behave.runner.robotium;

import java.io.File;

import org.apache.log4j.Logger;

import br.gov.frameworkdemoiselle.behave.message.BehaveMessage;
import br.gov.frameworkdemoiselle.behave.runner.Runner;
import br.gov.frameworkdemoiselle.behave.runner.ui.Element;
import br.gov.frameworkdemoiselle.behave.runner.ui.Screen;

public class RobotiumRunner implements Runner {
	
	public static String MESSAGEBUNDLE = "demoiselle-runner-robotium-bundle";
	private Logger logger = Logger.getLogger(RobotiumRunner.class);

	private BehaveMessage message = new BehaveMessage(MESSAGEBUNDLE);

	@Override
	public void start() {

		logger.info(message.getString("message-robotium-started"));

		// TODO Auto-generated method stub
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void navigateTo(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element getElement(String currentPageName, String elementName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen getScreen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File saveScreenshotTo(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScreen(String screenName) {
		// TODO Auto-generated method stub

	}

}
