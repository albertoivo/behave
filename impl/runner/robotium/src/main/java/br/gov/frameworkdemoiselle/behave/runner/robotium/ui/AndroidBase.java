package br.gov.frameworkdemoiselle.behave.runner.robotium.ui;

import org.apache.log4j.Logger;

import br.gov.frameworkdemoiselle.behave.message.BehaveMessage;
import br.gov.frameworkdemoiselle.behave.runner.robotium.RobotiumRunner;
import br.gov.frameworkdemoiselle.behave.runner.robotium.util.AndroidMappedElement;

public class AndroidBase extends AndroidMappedElement {

	private BehaveMessage message = new BehaveMessage(RobotiumRunner.MESSAGEBUNDLE);
	private Logger logger = Logger.getLogger(AndroidBase.class);
	protected RobotiumRunner runner = (RobotiumRunner) getRunner();

}
