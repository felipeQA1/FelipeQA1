package Tests;

import Elementos.elementos;
import Pages.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	elementos El = new elementos();
	metodos Met = new metodos();

	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");
		Met.pausa(7000);
		Met.clicar(El.getBtnLogin());

	}

	@When("^preencha os campos com usuario e senha$")
	public void preencha_os_campos_com_usuario_e_senha() throws Throwable {
		Met.prencher(El.getCampoDeEmail(), "felipe4545");
		Met.pausa(7000);
		Met.prencher(El.getCampoDeSenha(), "Fc230978");
		Met.screnShoot("CT01- Validar Campo de Login e Senha");
	}

	@Then("^sera validado login e senha$")
	public void sera_validado_login_e_senha() throws Throwable {
		Met.clicar(El.getBtnSingIn());
		Met.pausa(4000);
		Met.fechar();
	}

}
