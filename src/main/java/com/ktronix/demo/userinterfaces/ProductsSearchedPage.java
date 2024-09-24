package com.ktronix.demo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsSearchedPage {

    public static final Target TXT_HEADER = Target.the("HEADER TEXT").located(By.xpath("//div/h1[@class='h1_content']"));

    public static final Target TXT_RESULTS_COUNT = Target.the("FILTER TEXT").located(By.xpath("//div[@id='js-stats']"));

    public static final Target TXT_FILTER_ONE= Target.the("FILTER ONE TEXT").located(By.xpath("//div[@class='internal-items__filter-value']"));

    public static final Target BTN_ADD_TO_CART= Target.the("BOTTON ADD TO CART").located(By.xpath("(//button[@type='submit'])[3]"));










}
