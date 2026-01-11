# Ejercicio E2E SauceDemo - Serenity BDD & Screenplay

El siguiente ejercicio corresponde a una prueba de automatización End-to-End para validar el flujo de compra en el sitio SwagLabs (SauceDemo), implementando el patrón de diseño Screenplay.

## Tecnologías y Versiones
Para la realización de este ejercicio, utilicé la siguiente configuración:
* **Lenguaje:** Java 17 (JDK 17).
* **Gestor de Construcción:** Gradle 7.6.1.
* **Framework:** Serenity BDD (Configuración híbrida para soporte de drivers modernos).
* **Motor de Pruebas:** Cucumber con JUnit 4.
* **IDE:** IntelliJ IDEA.

## Prerrequisitos
1.  Tener instalado el **JDK 17** y la variable de entorno `JAVA_HOME` configurada.
2.  Tener instalado **Google Chrome** (el proyecto soporta versiones recientes, probada en v143).

## Instrucciones de Ejecución Paso a Paso

1.  **Clonar el proyecto** o descargar el código fuente.
2.  **Abrir una terminal** en la carpeta raíz del proyecto.
3.  **Ejecutar el comando** de Gradle. Es vital usar 'clean' para limpiar el driver cacheado y 'aggregate' para generar el reporte visual:

    En Windows (PowerShell/CMD):
    gradlew clean test aggregate

    En Mac/Linux:
    ./gradlew clean test aggregate

4.  El navegador se abrirá automáticamente, realizará el login, la compra y validará el mensaje final.

## Reportes Generados
Tras la ejecución exitosa ("BUILD SUCCESSFUL"), los reportes se encuentran en:

* **Reporte Serenity (Recomendado):** `<raíz_proyecto>/target/site/serenity/index.html`
    * Incluye capturas de pantalla paso a paso de cada interacción
* **Reporte Cucumber:** `<raíz_proyecto>/target/cucumber/report.html`

## Datos de Prueba
Siguiendo las instrucciones, externalicé los datos (credenciales, productos y dirección) en un archivo JSON ubicado en:
`src/test/resources/data/data.json`.
