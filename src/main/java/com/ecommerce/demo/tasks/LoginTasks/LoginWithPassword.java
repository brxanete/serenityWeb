package com.ecommerce.demo.tasks.LoginTasks;

import com.ecommerce.demo.interactions.LoginInteractions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ecommerce.demo.userinterfaces.LoginPage.BTN_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LoginWithPassword implements Task {

    private String password;

    public LoginWithPassword(String password) {
        this.password = password;
    }

    public static LoginWithPassword loginWithPass(String password) {
        return instrumented(LoginWithPassword.class, password);
    }


    @Override
    public <X extends Actor> void performAs(X Bryan) {
        Bryan.wasAbleTo(
                GoToInputPass.clickInputPass(),
                EnterPass.inputPass(password)

        );


    }


}
