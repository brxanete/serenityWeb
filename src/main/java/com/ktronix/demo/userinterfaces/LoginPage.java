package com.ktronix.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target INP_PASSWORD = Target.the("INPUT PASSWORD").located(By.id("j_password"));

    public static final Target BTN_LOGIN = Target.the("BUTTON CONTINUE").located(net.serenitybdd.core.annotations.findby.By.xpath("(//button[@type='submit'])[3]"));

    public static final Target BAN_LOGIN_ERROR = Target.the("BAN LOGIN ERROR").located(net.serenitybdd.core.annotations.findby.By.xpath("//div[@class='alert negative']"));



}
