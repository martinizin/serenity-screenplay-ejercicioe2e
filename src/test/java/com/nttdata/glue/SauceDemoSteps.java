package com.nttdata.glue;

import com.nttdata.tasks.AddProductPage;
import com.nttdata.tasks.Login;
import com.nttdata.tasks.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.nttdata.userinterfaces.SauceDemoUI.CONFIRMATION_TEXT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SauceDemoSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario accede a la tienda virtual SwagLabs")
    public void que_el_usuario_accede_a_la_tienda_virtual_swag_labs() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                net.serenitybdd.screenplay.actions.Open.url("https://www.saucedemo.com/")
        );
    }

    @When("ingresa credenciales validas usuario {string} y clave {string}")
    public void ingresa_credenciales_validas_usuario(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                Login.withCreds(usuario, clave)
        );
    }

    @And("agrega al carrito los productos {string} y {string}")
    public void agrega_productos(String prod1, String prod2) {
        theActorInTheSpotlight().attemptsTo(
                AddProductPage.add(prod1, prod2)
        );
    }

    @And("completo el formulario de compra con nombre {string}, apellido {string} y zip {string}")
    public void completa_checkout(String nombre, String apellido, String zip) {
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.fill(nombre, apellido, zip)
        );
    }

    @Then("valida que se muestre el mensaje de confirmación {string}")
    public void valida_mensaje(String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(the(CONFIRMATION_TEXT), containsText(mensaje))
        );
    }
}