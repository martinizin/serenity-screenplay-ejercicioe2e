package com.nttdata.tasks;

import com.nttdata.userinterfaces.SauceDemoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PurchaseFormPage implements Task {
    private final String name, last, zip;

    public PurchaseFormPage(String name, String last, String zip) {
        this.name = name;
        this.last = last;
        this.zip = zip;
    }

    public static PurchaseFormPage fill(String name, String last, String zip) {
        return instrumented(PurchaseFormPage.class, name, last, zip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SauceDemoUI.CHECKOUT_BTN),
                Enter.theValue(name).into(SauceDemoUI.FIRST_NAME),
                Enter.theValue(last).into(SauceDemoUI.LAST_NAME),
                Enter.theValue(zip).into(SauceDemoUI.ZIP_CODE),
                Click.on(SauceDemoUI.CONTINUE_BTN),
                Click.on(SauceDemoUI.FINISH_BTN)
        );
    }
}
