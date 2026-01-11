package com.nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceDemoUI {
    // Login
    public static final Target USER_FIELD = Target.the("campo usuario").located(By.id("user-name"));
    public static final Target PASS_FIELD = Target.the("campo password").located(By.id("password"));
    public static final Target LOGIN_BTN = Target.the("boton login").located(By.id("login-button"));

    public static Target PRODUCT_BTN(String name) {
        String productId = "add-to-cart-" + name.toLowerCase().replace(" ", "-");
        return Target.the("boton agregar " + name)
                .located(By.id(productId));
    }

    public static final Target CART_ICON = Target.the("icono carrito").located(By.className("shopping_cart_link"));

    // Carrito de compras
    public static final Target CHECKOUT_BTN = Target.the("boton checkout").located(By.id("checkout"));
    public static final Target FIRST_NAME = Target.the("nombre").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("apellido").located(By.id("last-name"));
    public static final Target ZIP_CODE = Target.the("codigo postal").located(By.id("postal-code"));
    public static final Target CONTINUE_BTN = Target.the("boton continuar").located(By.id("continue"));
    public static final Target FINISH_BTN = Target.the("boton finalizar").located(By.id("finish"));
    public static final Target CONFIRMATION_TEXT = Target.the("mensaje final").located(By.cssSelector(".complete-header"));
}