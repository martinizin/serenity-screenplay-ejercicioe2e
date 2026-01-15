package com.nttdata.tasks;

import com.nttdata.userinterfaces.SauceDemoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    private final String user, pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Login withCreds(String user, String pass) {
        return instrumented(Login.class, user, pass);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(SauceDemoUI.USER_FIELD),
                Enter.theValue(pass).into(SauceDemoUI.PASS_FIELD),
                Click.on(SauceDemoUI.LOGIN_BTN)
        );
    }
}
