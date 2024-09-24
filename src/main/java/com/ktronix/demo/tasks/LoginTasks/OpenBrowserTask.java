package com.ktronix.demo.tasks.LoginTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

//Clase implementa la interfaz Task
public class OpenBrowserTask implements Task {

    //Metodo sobreescrito para implementar la interfaz Task
    //CApacidades, acciones, e intento del actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO Auto-generated method stub
        actor.attemptsTo(Open.url("https://www.ktronix.com"));

        // Resolver elemento a traves del actor
       /* try {
            if (SPN_TITLE_PAGE_WRONG.resolveFor(actor).isVisible()) {
                throw new ElementNotFoundException(ElementNotFoundException.ELEMENT_NOT_FOUND);
            }
            actor.attemptsTo(Click.on(SPN_TITLE_PAGE_WRONG));
        } catch (Exception e) {
            // TODO: handle exception
            throw new ElementNotFoundException(ElementNotFoundException.ELEMENT_NOT_FOUND);
        }
*/
    }

    public static OpenBrowserTask openBrowser() {
        return Tasks.instrumented(OpenBrowserTask.class);
    }


}
