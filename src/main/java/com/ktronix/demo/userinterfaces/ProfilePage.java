package com.ktronix.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProfilePage {

    public static final Target TXT_MAIL = Target.the("TEXT EMAIL").located(By.xpath("//div[@class='update-profile__text']"));
}
