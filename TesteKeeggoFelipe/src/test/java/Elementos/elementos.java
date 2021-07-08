package Elementos;

import org.openqa.selenium.By;

public class elementos {

	// ***********************************************************
	// ELEMENTOS WEB ENCAPSULADOS
	// ***********************************************************
	private By btnLogin = By.id("menuUser");

	private By campoDeEmail = By.name("username");

	private By campoDeSenha = By.name("password");

	private By btnSingIn = By.id("sign_in_btnundefined");

	// ***********************************************************
	// METODOS DE ACESSO
	// ***********************************************************

	public By getBtnLogin() {
		return btnLogin;
	}

	public By getCampoDeEmail() {
		return campoDeEmail;
	}

	public By getCampoDeSenha() {
		return campoDeSenha;
	}

	public By getBtnSingIn() {
		return btnSingIn;
	}

}

