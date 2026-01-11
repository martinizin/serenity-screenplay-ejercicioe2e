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
3.  **Ejecutar el comando** de Gradle. Es vital usar `clean` para limpiar el driver cacheado y `aggregate` para generar el reporte visual.

    **En Windows (PowerShell / CMD):**
    ```powershell
    ./gradlew clean test aggregate
    ```

    **En Mac / Linux:**
    ```bash
    ./gradlew clean test aggregate
    ```

4.  El navegador se abrirá automáticamente, realizará el login, la compra y validará el mensaje final.

## Reportes Generados
Tras la ejecución exitosa ("BUILD SUCCESSFUL"), los reportes se encuentran en:

* **Reporte Serenity (Recomendado):** `<raíz_proyecto>/target/site/serenity/index.html`
    * Incluye capturas de pantalla paso a paso de cada interacción.
* **Reporte Cucumber:** `<raíz_proyecto>/target/cucumber/report.html`

## Datos de Prueba
Siguiendo las instrucciones, externalicé los datos (credenciales, productos y dirección) en un archivo JSON ubicado en:
`src/test/resources/data/data.json`
## Reporte de Prueba
<img width="1899" height="1079" alt="image" src="https://github.com/user-attachments/assets/010b893c-3fb0-49f2-8c7c-c8f145b0bb89" />

<img width="1898" height="1079" alt="image" src="https://github.com/user-attachments/assets/5cddded6-87c9-4f22-8e99-07dd811a1f0f" />

<img width="1895" height="1052" alt="image" src="https://github.com/user-attachments/assets/c0062edc-0192-463e-9165-d0ee54a77d5f" />

<img width="1898" height="1079" alt="image" src="https://github.com/user-attachments/assets/a887fdb6-e65d-4855-b87a-58aa8566f468" />

