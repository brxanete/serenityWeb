# Documentación completa del proyecto Serenity Web

## 1. Información general

Este proyecto es una automatización de pruebas de interfaz web basada en Java, Maven, Selenium, Serenity BDD y Cucumber.

Su propósito es validar flujos de negocio sobre la plataforma de Ktronix utilizando el patrón Screenplay de Serenity, lo que permite separar la lógica de negocio, las interacciones con la interfaz y los elementos de la UI en módulos bien definidos.

### Tecnologías principales
- Java 11 (recomendado para este proyecto)
- Maven 3.x
- Selenium 3.141.59
- Serenity BDD 2.1.4
- Cucumber 4.x
- JUnit 4
- Screenplay Pattern
- ChromeDriver compatible con Chrome 150 (en este entorno)

### Objetivo del proyecto
Automatizar escenarios de prueba como:
- Inicio de sesión
- Validación de navegación
- Filtrado y revisión de productos
- Agregar productos al carrito

---

## 2. Arquitectura del proyecto

El proyecto sigue una arquitectura basada en capas, orientada a la mantenibilidad y escalabilidad de los tests automatizados.

### 2.1 Principios generales
- Separación de responsabilidades
- Reutilización de componentes
- Lectura de datos desde archivos externos
- Uso de Page Objects / Targets para la UI
- Uso de Screenplay para modelar tareas, interacciones y preguntas
- Uso de Cucumber para definir escenarios en lenguaje Gherkin

### 2.2 Capas del proyecto

#### Capa de features / escenarios
Ubicada en:
- src/test/java/resources/features/

Aquí se definen los escenarios en lenguaje Gherkin. Ejemplo:
- login.feature
- cellphonesReview.feature
- addToCart.feature

#### Capa de step definitions
Ubicada en:
- src/test/java/com/ktronix/demo/stepdefinitions/

Aquí se enlazan las frases de los feature files con la lógica de automatización.

Ejemplo:
- LoginUserStepDefinitions
- CellphonesReviewStepDefinitions
- AddToCartStepDefinitions

#### Capa de tareas y acciones
Ubicada en:
- src/main/java/com/ktronix/demo/tasks/

Contiene la lógica de negocio representada como tareas del patrón Screenplay.

Ejemplos:
- LoginTasks/
- AddToCartTasks/
- CellphonesReviewTasks/

#### Capa de interacciones
Ubicada en:
- src/main/java/com/ktronix/demo/interactions/

Representa acciones específicas sobre la interfaz, como hacer clic, desplegar menús, abrir secciones o seleccionar filtros.

#### Capa de user interfaces
Ubicada en:
- src/main/java/com/ktronix/demo/userinterfaces/

Aquí se definen los localizadores (Targets) de cada elemento de la página.

Ejemplos:
- HomePage
- LoginPage
- MailPage
- ProfilePage
- ProductsSearchedPage
- Categories/CellphonesSubPage

#### Capa de preguntas
Ubicada en:
- src/main/java/com/ktronix/demo/questions/

Se utilizan para validar si un elemento o texto se encuentra como se espera.

#### Capa de modelos
Ubicada en:
- src/main/java/com/ktronix/demo/models/

Representa los datos de entrada utilizados por los escenarios.

#### Capa de utilidades
Ubicada en:
- src/main/java/com/ktronix/demo/utils/

Contiene utilidades para lectura de archivos CSV, manejo de locators y procesamiento de datos.

---

## 3. Estructura del proyecto

La estructura principal es la siguiente:

```text
serenityWeb/
├── pom.xml
├── serenity.properties
├── README.md
├── DOCUMENTACION_PROYECTO.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── ktronix/
│   │               └── demo/
│   │                   ├── exceptions/
│   │                   ├── interactions/
│   │                   ├── models/
│   │                   ├── questions/
│   │                   ├── tasks/
│   │                   ├── userinterfaces/
│   │                   └── utils/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── ktronix/
│       │           └── demo/
│       │               ├── runners/
│       │               └── stepdefinitions/
│       └── resources/
│           ├── data/
│           └── features/
```

### 3.1 Archivos clave

#### pom.xml
Define las dependencias Maven, plugins de compilación y configuración de Serenity.

#### serenity.properties
Contiene la configuración del driver de Selenium, tiempos de espera, switches de Chrome y opciones de reportes.

#### features
Archivos Gherkin:
- login.feature
- addToCart.feature
- cellphonesReview.feature

#### runners
Clases JUnit que invocan Cucumber con Serenity.
Ejemplo:
- LoginUserRunner
- CellphonesReviewRunner

---

## 4. Flujo de ejecución

El flujo general del proyecto es el siguiente:

1. Se ejecuta un Runner de JUnit.
2. El Runner carga el feature correspondiente.
3. Cucumber interpreta los pasos del feature.
4. Los step definitions invocan tareas del patrón Screenplay.
5. Las tareas usan interacciones sobre los elementos definidos en userinterfaces.
6. Las preguntas validan el resultado esperado.
7. Serenity genera reportes y evidencia.

---

## 5. Configuración del entorno

## 5.1 Requisitos previos

### Para macOS
Se recomienda tener instalado:
- Homebrew
- Java 11
- Maven 3.x
- Google Chrome
- ChromeDriver compatible con tu versión de Chrome

### Para Windows
Se recomienda tener instalado:
- Java 11
- Maven 3.x
- Google Chrome
- ChromeDriver compatible con tu versión de Chrome

---

## 6. Configuración en macOS

### 6.1 Instalar Homebrew
Si no tienes Homebrew instalado:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### 6.2 Instalar Java 11
```bash
brew install --cask temurin@11
```

Verifica:
```bash
java -version
```

### 6.3 Instalar Maven
```bash
brew install maven
```

Verifica:
```bash
mvn -version
```

### 6.4 Instalar Google Chrome
```bash
brew install --cask google-chrome
```

### 6.5 Instalar ChromeDriver compatible
La forma más segura es usar una versión de ChromeDriver que coincida con la versión de Chrome instalada.

#### Opción recomendada
Descargar el driver compatible manualmente desde Chrome for Testing.

Ejemplo para Chrome 150 en Mac ARM64:

```bash
mkdir -p /tmp/chromedriver-150
cd /tmp/chromedriver-150
curl -L -o chromedriver.zip https://storage.googleapis.com/chrome-for-testing-public/150.0.7871.187/mac-arm64/chromedriver-mac-arm64.zip
unzip chromedriver.zip
chmod +x chromedriver-mac-arm64/chromedriver
```

Verifica:
```bash
/tmp/chromedriver-150/chromedriver-mac-arm64/chromedriver --version
```

### 6.6 Configurar JAVA_HOME
Agregar en el perfil del shell:

```bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home
export PATH="$JAVA_HOME/bin:$PATH"
```

En macOS con zsh, puedes agregarlo a:
```bash
~/.zshrc
```

Luego recarga:
```bash
source ~/.zshrc
```

### 6.7 Configurar el proyecto
En [serenity.properties](serenity.properties), asegúrate de apuntar el driver a la ruta correcta:

```properties
webdriver.driver = chrome
webdriver.chrome.driver = /tmp/chromedriver-150/chromedriver-mac-arm64/chromedriver
```

---

## 7. Configuración en Windows

### 7.1 Instalar Java 11
Descarga e instala JDK 11 desde Adoptium o Temurin.

Asegúrate de agregar Java al PATH.

### 7.2 Instalar Maven
Descarga Maven desde su sitio oficial y configura las variables de entorno:
- MAVEN_HOME = C:\apache-maven-x.x.x
- PATH = %MAVEN_HOME%\bin

Verifica:
```cmd
mvn -version
```

### 7.3 Instalar Google Chrome
Descarga e instala Google Chrome.

### 7.4 Instalar ChromeDriver
Descarga la versión compatible con tu Chrome desde Chrome for Testing.

Ejemplo:
- Descarga chromedriver.exe compatible con tu versión de Chrome
- Colócalo en una carpeta sencilla, por ejemplo:

```text
C:\drivers\chromedriver.exe
```

### 7.5 Configurar serenity.properties
En Windows debe quedar algo así:

```properties
webdriver.driver = chrome
webdriver.chrome.driver = C:\drivers\chromedriver.exe
```

### 7.6 Verificar Java y Maven
```cmd
java -version
mvn -version
```

---

## 8. Ejecutar el proyecto

### 8.1 Desde la raíz del proyecto
```bash
mvn test
```

### 8.2 Ejecutar un runner específico
```bash
mvn -Dtest=LoginUserRunner test
```

### 8.3 Ejecutar otro runner
```bash
mvn -Dtest=CellphonesReviewRunner test
```

### 8.4 Ejecutar desde VS Code
Puedes usar:
- la extensión Maven for Java
- o ejecutar desde terminal con los comandos anteriores

---

## 9. Reportes generados

El proyecto está configurado para generar reportes de Serenity en la carpeta:

```text
target/site/serenity/
```

Además, los reportes de Cucumber se generan en:

```text
target/cucumber/
```

---

## 10. Datos de prueba

Los datos de prueba se leen desde archivos CSV ubicados en:
- src/test/java/resources/data/credenciales.csv

Esto permite separar la información de prueba del código y facilitar su mantenimiento.

---

## 11. Buenas prácticas para mantenimiento

- Mantener los localizadores en la capa de userinterfaces
- Evitar hardcode de textos en los step definitions
- Mantener los features claros y legibles
- Separar tareas complejas en componentes reutilizables
- Actualizar ChromeDriver según la versión del navegador
- Usar Java 11 para compatibilidad con este proyecto

---

## 12. Problemas comunes y solución

### Error: ChromeDriver no inicia
Posibles causas:
- Driver incompatible con la versión de Chrome
- Ruta de chromedriver incorrecta
- Chrome no está instalado o no está siendo encontrado

### Error: elemento no encontrado
Posibles causas:
- El selector XPath está desactualizado
- La UI del sitio cambió
- El sitio requiere espera adicional

### Error: Java/Maven no encontrados
Posibles causas:
- Java no está instalado
- JAVA_HOME no está configurado
- Maven no está agregado al PATH

---

## 13. Resumen rápido

Para que este proyecto funcione correctamente debes tener:
- Java 11
- Maven
- Google Chrome
- ChromeDriver compatible
- Configuración correcta en serenity.properties

Y luego ejecutar:

```bash
mvn -Dtest=LoginUserRunner test
```

---

## 14. Recomendación final

Para un entorno estable, se recomienda:
- usar Java 11
- usar una versión de ChromeDriver compatible con la versión instalada de Chrome
- mantener el proyecto en una ruta sin espacios si se presentan problemas de Cucumber
- ejecutar desde terminal para controlar mejor los logs y los reportes
