Feature: Compra E2E en SauceDemo

  @SauceDemo
  Scenario: Compra exitosa con datos desde JSON
    Given que cargue los datos de prueba del json
    And que estoy en la pagina de login
    When ingreso mis credenciales desde el archivo
    And agrego los items al carrito
    And completo el formulario de compra
    Then deberia ver el mensaje de exito "THANK YOU FOR YOUR ORDER!"
