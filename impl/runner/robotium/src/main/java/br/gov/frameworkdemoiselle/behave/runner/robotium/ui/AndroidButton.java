package br.gov.frameworkdemoiselle.behave.runner.robotium.ui;

import br.gov.frameworkdemoiselle.behave.exception.BehaveException;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;

public class AndroidButton extends AndroidBase implements Button {

	@Override
	public void click() {
		runner.solo.clickOnButton(0);
	}

	@Override
	public void mouseOver() {
		throw new BehaveException("Não há mouseover na plataforma mobile.");

	}

}
