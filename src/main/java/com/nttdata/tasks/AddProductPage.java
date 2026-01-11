package com.nttdata.tasks;

import com.nttdata.userinterfaces.SauceDemoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductPage implements Task {
    private final String product1, product2;

    public AddProductPage(String product1, String product2) {
        this.product1 = product1;
        this.product2 = product2;
    }

    public static AddProductPage add(String p1, String p2) {
        return instrumented(AddProductPage.class, p1, p2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SauceDemoUI.PRODUCT_BTN(product1), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SauceDemoUI.PRODUCT_BTN(product1)),
                Click.on(SauceDemoUI.PRODUCT_BTN(product2)),
                Click.on(SauceDemoUI.CART_ICON)
        );
    }
}