# Grundgerüst für eine modularisierte Spring Boot Applikation mit Open API Spezifikation und Code-Generation

## Module

### api-module
Dieses Modul ist zuständig für die Generierung der API-Interfaces und Model-Klassen anhand der `api.yml` Spezifikation.
Für die Code Generierung wird das Projekt [Open API Generator](https://openapi-generator.tech/docs/generators/spring) verwendet.
Das Maven Plugin ist so eingestellt, dass nur Interfaces generiert werden. Wenn ein Build angestoßen wird, und
sich das `api.yml` geändert hat, brechen die Controller-Implementierungen.

### data-module
Diese Modul ist der Teil der Anwendung, der die Business Logik implementiert, Daten über `@Repository` und `@Service`
bereitstellt.

### web-module
Diese Modul ist beinhaltet die Notwendigen Abhängigkeiten zum Spring-Web-Starter. Hier werden die `@RestController` implementiert.
Jeder Controller sollte ein generiertes Interface implementieren.
Außerdem befindet sich hier die Konfiguration für das Swagger-UI, welches unter [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) zugänglich ist.

## Build
Wenn ein Maven Build durchgeführt wird, werden über das `api-module` die generierten Klassen bereitgestellt. Wenn sich der Contract nicht geändert hat, dürften hier keine 
Compiler-Errors in den implementierenden `@Controller` auftreten!
