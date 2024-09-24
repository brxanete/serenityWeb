package com.ktronix.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MailPage {

    public static final Target INP_MAIL = Target.the("INPUT MAIL").located(By.xpath("//input[@id='js-login-email']"));
    public static final Target BTN_PROCEED = Target.the("BUTTON CONTINUE").located(By.xpath("(//button[@type='submit'])[3]"));


}
