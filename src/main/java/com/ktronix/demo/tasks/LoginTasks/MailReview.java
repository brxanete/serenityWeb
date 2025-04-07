package com.ktronix.demo.tasks.LoginTasks;

import com.ktronix.demo.interactions.LoginInteractions.DeployUserMenu;
import com.ktronix.demo.interactions.LoginInteractions.EnterMail;
import com.ktronix.demo.interactions.LoginInteractions.GoToLogin;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ktronix.demo.userinterfaces.MailPage.INP_MAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class MailReview implements Task {

    private String mail;

    public MailReview(String mail) {
        this.mail = mail;
    }

    public static MailReview compareText(String mail) {
        return instrumented(MailReview.class, mail);
    }


    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(DeployUserMenu.deployMyAccount(), GoToLogin.clickLogin());

        int count = 0;  // inicia en count 0
        while (count < 10) { //  Se detiene en este caso en count 5
            count++;
            Bryan.attemptsTo(WaitUntil.the(INP_MAIL, isVisible()), Clear.field(INP_MAIL), theValue(mail).into(INP_MAIL));

            count++;


        }
    }
}

//        Bryan.wasAbleTo(
//                DeployUserMenu.deployMyAccount(),
//                GoToLogin.clickLogin(),
//                EnterMail.inputMail(mail));
//
//    }
//}








