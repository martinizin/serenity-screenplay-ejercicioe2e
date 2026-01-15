Feature: Funcionalidad de compra en SauceDemo

  @SauceDemo
  Scenario Outline: Completar el flujo de compra end-to-end
    Given que el usuario accede a la tienda virtual SwagLabs
    When ingresa credenciales validas usuario "<usuario>" y clave "<clave>"
    And agrega al carrito los productos "<producto1>" y "<producto2>"
    And completo el formulario de compra con nombre "<nombre>", apellido "<apellido>" y zip "<zip>"
    Then valida que se muestre el mensaje de confirmación "<mensaje>"
    Examples:
      | usuario       | clave        | producto1           | producto2             | nombre | apellido | zip   | mensaje                   |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sauce Labs Bike Light | Martin | Jimenez  | 17011 | Thank you for your order! |
