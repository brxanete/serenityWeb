package com.ktronix.demo.tasks.LoginTasks;

import com.ktronix.demo.interactions.LoginInteractions.DeployUserMenu;
import com.ktronix.demo.interactions.LoginInteractions.EnterMail;
import com.ktronix.demo.interactions.LoginInteractions.GoToLogin;
import net.serenitybdd.screenplay.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;


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
        Bryan.wasAbleTo(
                DeployUserMenu.deployMyAccount(),
                GoToLogin.clickLogin(),
                EnterMail.inputMail(mail));


    }




}
