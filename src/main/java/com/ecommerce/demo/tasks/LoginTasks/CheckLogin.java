package com.ecommerce.demo.tasks.LoginTasks;

import com.ecommerce.demo.interactions.LoginInteractions.DeployUserMenu;
import com.ecommerce.demo.interactions.LoginInteractions.GoToProfile;
import com.ecommerce.demo.questions.CorrectElementText;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ecommerce.demo.userinterfaces.ProfilePage.TXT_MAIL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.containsString;

public class CheckLogin implements Task {

    private String mail;

    public CheckLogin(String text) {
        this.mail = text;
    }

    public static CheckLogin compareText(String text) {
        return instrumented(CheckLogin.class, text);
    }


    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(
                DeployUserMenu.deployMyAccount(),
                GoToProfile.clickProfile(),
                WaitUntil.the(TXT_MAIL, isVisible()));


        Bryan.should(
                seeThat(CorrectElementText.displayed(TXT_MAIL), containsString(mail)));


    }
}


