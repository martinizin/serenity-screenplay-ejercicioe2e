package com.nttdata.glue;

import com.nttdata.tasks.AddProductPage;
import com.nttdata.tasks.Login;
import com.nttdata.tasks.PurchaseFormPage;
import com.nttdata.userinterfaces.SauceDemoUI;
import com.nttdata.utils.DataLoads;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

import java.io.IOException;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class SauceDemoSteps {

    // Variable para guardar los datos leídos del JSON
    private Map<String, String> data;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que cargue los datos de prueba del json")
    public void loadData() throws IOException {
        data = DataLoads.data().get(0);
    }

    @Given("que estoy en la pagina de login")
    public void openPage() {
        OnStage.theActorCalled("Martin").wasAbleTo(Open.url("https://www.saucedemo.com"));
    }

    @When("ingreso mis credenciales desde el archivo")
    public void login() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCreds(data.get("user"), data.get("pass")));
    }

    @And("agrego los items al carrito")
    public void addItems() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductPage.add(data.get("prod1"), data.get("prod2")));
    }

    @And("completo el formulario de compra")
    public void checkout() {
        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseFormPage.fill(data.get("name"), data.get("lastName"), data.get("zip")));
    }

    @Then("deberia ver el mensaje de exito {string}")
    public void validate(String msg) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Text.of(SauceDemoUI.CONFIRMATION_TEXT), equalToIgnoringCase(msg))
        );
    }
}