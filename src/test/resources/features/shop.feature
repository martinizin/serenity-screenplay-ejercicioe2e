Feature: Funcionalidad de Compra en SwagLabs
  Como usuario registrado
  Quiero seleccionar productos y completar el pago
  Para validar el correcto funcionamiento del flujo de ventas
  @SauceDemo
  Scenario: Completar un flujo de compra End-to-End exitosamente
    Given que el usuario accede a la tienda virtual SwagLabs
    When ingresa credenciales válidas para iniciar sesión
    And agrega items al carrito de compras del inventario
    Then valida que se muestre el mensaje de confirmación "THANK YOU FOR YOUR ORDER!"
