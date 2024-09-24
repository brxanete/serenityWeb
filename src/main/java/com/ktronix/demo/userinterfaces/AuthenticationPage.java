package com.ktronix.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AuthenticationPage {

    public static final Target BTN_MAIL_PASSWORD = Target.the("BUTTON MAIL AND PASSWORD").located(By.xpath("//small[text()='Mail y contraseña']"));



}
