package com.ktronix.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class CorrectPresenceElement implements Question<Boolean> {

    private Target element;

    public CorrectPresenceElement(Target elemento) {
        this.element = elemento;
    }

    public static CorrectPresenceElement displayed(Target elemento){
        return new CorrectPresenceElement(elemento);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return element.resolveFor(actor).waitUntilVisible().isVisible();
    }
}
