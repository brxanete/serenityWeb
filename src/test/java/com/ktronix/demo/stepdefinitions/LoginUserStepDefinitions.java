package com.ktronix.demo.stepdefinitions;

import com.ktronix.demo.models.LoginUserModel;
import com.ktronix.demo.tasks.LoginTasks.*;
import cucumber.api.java.Before;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginUserStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor Bryan = Actor.named("Bryan");

    @Before
    public void preparedActorStage() {
        OnStage.setTheStage(new OnlineCast());
        Bryan.can(BrowseTheWeb.with(webDriver));
    }


    @Dado("^Que el usuario ingresa a Ktronix\\.com$")
    public void queElUsuarioIngresaAKtronixCom() {
        Bryan.attemptsTo(OpenBrowserTask.openBrowser());

    }

    @Cuando("^Verifica correo electronico$")
    public void verificaCorreoElectronico(List<LoginUserModel> loginList) {
        Bryan.wasAbleTo(MailReview.compareText(loginList.get(0).getCorreoElectronico()));

    }

    @Cuando("^Se autentica ingresando clave$")
    public void seAutenticaIngresandoClave(List<LoginUserModel> loginList) {
        Bryan.wasAbleTo(LoginWithPassword.loginWithPass(loginList.get(0).getContrasena()));

    }


    @Entonces("^Valida el inicio de sesion con su correo$")
    public void validaElInicioDeSesionConSuCorreo(List<LoginUserModel> loginList) {
        Bryan.wasAbleTo(CheckLogin.compareText(loginList.get(0).getCorreoElectronico()));
    }


    @Entonces("^Valida mensaje de error por contraseña incorrecta$")
    public void validaMensajeDeErrorPorContraseñaIncorrecta() {
        Bryan.attemptsTo(CheckBanError.visible());


    }

    @Entonces("^Valida mensaje de error por correo incorrecto$")
    public void validaMensajeDeErrorPorCorreoIncorrecto() {
        Bryan.attemptsTo(CheckBanError.visible());

    }


}
