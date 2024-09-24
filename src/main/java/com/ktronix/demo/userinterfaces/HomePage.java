package com.ktronix.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class HomePage {
    // Publicos para todo el proyecto y final porque puede que no cambie a traves del tiempo


    public static final Target BTN_MYACCOUNT = Target.the("BUTTON MY ACCOUNT").located(By.xpath("//a[@href='/my-account']"));
    public static final Target BTN_LOGIN = Target.the("BUTTON LOGIN").located(By.xpath("(//span[text()='Iniciar sesión'])[1]"));
    public static final Target BTN_PROFILE = Target.the("BUTTON PROFILE").located(By.xpath("(//span[text()='Mi Perfil'])[1]"));
    public static final String BTN_CATEGORY = "//a[@title='Replace']";
  //  public static final Target BAN_SHOPPING_CAR = Target.the("")


}
