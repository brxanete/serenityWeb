package com.ktronix.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class CorrectCheckedElement implements Question<Boolean> {

    private Target element;

    public CorrectCheckedElement(Target elemento) {
        this.element = elemento;
    }

    public static CorrectCheckedElement displayed(Target elemento){
        return new CorrectCheckedElement(elemento);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return element.resolveFor(actor).waitUntilVisible().isSelected();
    }
}
