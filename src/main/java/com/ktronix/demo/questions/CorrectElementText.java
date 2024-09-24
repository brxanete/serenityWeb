package com.ktronix.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class CorrectElementText implements Question<String> {

    private Target element;

    public CorrectElementText(Target elemento) {
        this.element = elemento;
    }

    public static CorrectElementText displayed(Target elemento){
        return new CorrectElementText(elemento);
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getTextValue();


    }
}