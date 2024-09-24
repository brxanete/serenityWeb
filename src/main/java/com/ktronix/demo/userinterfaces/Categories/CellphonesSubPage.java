package com.ktronix.demo.userinterfaces.Categories;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class CellphonesSubPage {
    // Publicos para todo el proyecto y final porque puede que no cambie a traves del tiempo

    //Cellphones Brands
    public static final Target BTN_BRAND_IPHONE = Target.the("BUTTON IPHONE").located(By.xpath("//a[@title='iPhone']"));
    public static final Target BTN_BRAND_SAMSUNG = Target.the("BUTTON SAMSUNG").located(By.xpath("(//a[@title='Samsung '])[1]"));
    public static final Target BTN_BRAND_XIAOMI = Target.the("BUTTON XIAOMI").located(By.xpath("(//a[@title='Xiaomi'])[1]"));
    public static final Target BTN_BRAND_MOTOROLA = Target.the("BUTTON MOTOROLA").located(By.xpath("//a[@title='Motorola']"));
    public static final Target BTN_BRAND_VIVO = Target.the("BUTTON VIVO").located(By.xpath("//a[@title='vivo']"));
    public static final Target BTN_BRAND_NOKIA = Target.the("BUTTON NOKIA").located(By.xpath("//a[@title='Nokia']"));
    public static final Target BTN_BRAND_OPPO = Target.the("BUTTON OPPO").located(By.xpath("//a[@title='Oppo']"));
    public static final Target BTN_BRAND_REALME = Target.the("BUTTON REALME").located(By.xpath("//a[@title='Realme']"));
    public static final Target BTN_BRAND_ZTE = Target.the("BUTTON ZTE").located(By.xpath("//a[@title='Zte']"));
    public static final Target BTN_BRAND_TCL = Target.the("BUTTON TCL").located(By.xpath("//a[@title='TCL']"));
    public static final Target BTN_BRAND_ALCATEL = Target.the("BUTTON ALCATEL").located(By.xpath("(//a[@title='Alcatel'])[1]"));
    public static final Target BTN_BRAND_KALLEY = Target.the("BUTTON KALLEY").located(By.xpath("(//a[@title='Kalley '])[1]"));
    public static final Target BTN_BRAND_HUAWEI = Target.the("BUTTON HUAWEI").located(By.xpath("(//a[@title='Huawei'])[1]"));
    public static final Target BTN_BRAND_HONOR = Target.the("BUTTON HONOR").located(By.xpath("//a[@title='Honor']"));
    public static final Target BTN_BRAND_TECNO = Target.the("BUTTON TECNO").located(By.xpath("//a[@title='Tecno']"));

    // Cellphones Storages
    public static final Target BTN_STORAGE_32 = Target.the("BUTTON 32 GB").located(By.xpath("//a[@title='32 GB']"));
    public static final Target BTN_STORAGE_64 = Target.the("BUTTON 64 GB").located(By.xpath("//a[@title='64 GB']"));
    public static final Target BTN_STORAGE_128 = Target.the("BUTTON 128 GB").located(By.xpath("//a[@title='128 GB']"));
    public static final Target BTN_STORAGE_256 = Target.the("BUTTON 256 GB").located(By.xpath("//a[@title='256 GB']"));
    public static final Target BTN_STORAGE_512 = Target.the("BUTTON 512 GB").located(By.xpath("//a[@title='512 GB']"));
    public static final Target BTN_STORAGE_1024 = Target.the("BUTTON 1 TB").located(By.xpath("//a[@title='1 TB']"));

    //Cellphones Screens
    public static final Target BTN_SCREEN_31_A_4 = Target.the("BUTTON 3.1' - 4'").located(By.xpath("//a[@href='/celulares/telefonos-celulares/c/BI_101_KTRON?q=%3Arelevance%3Atamano-pantalla%3ADe+2%27+a+3%27%3Atamano-pantalla%3ADe+3.1%27+a+4%27#']"));
    public static final Target BTN_SCREEN_41_A_5 = Target.the("BUTTON 4.1' - 5'").located(By.xpath("//a[@href='/celulares/telefonos-celulares/c/BI_101_KTRON?q=%3Arelevance%3Atamano-pantalla%3ADe+4.1%27+a+5%27#']"));
    public static final Target BTN_SCREEN_51_A_6 = Target.the("BUTTON 5.1' - 6'").located(By.xpath("//a[@href='/celulares/telefonos-celulares/c/BI_101_KTRON?q=%3Arelevance%3Atamano-pantalla%3ADe+5.1%27+a+6%27#']"));
    public static final Target BTN_SCREEN_61_A_8 = Target.the("BUTTON 6.1' - 8'").located(By.xpath("//a[@href='/celulares/telefonos-celulares/c/BI_101_KTRON?q=%3Arelevance%3Atamano-pantalla%3ADe+6.1%27+a+8%27#']"));

    //Cellphones Cameras
    public static final Target BTN_BACK_CAMERA_SIMPLE = Target.the("BUTTON BACK CAMERA SENCILLA'").located(By.xpath("(//a[@title='Sencilla'])[1]"));
    public static final Target BTN_BACK_CAMERA_DUAL = Target.the("BUTTON BACK CAMERA DUAL'").located(By.xpath("(//a[@title=Dual'])[1]"));
    public static final Target BTN_BACK_CAMERA_TRIPLE = Target.the("BUTTON BACK CAMERA TRIPLE'").located(By.xpath("//a[@title='Triple']"));

    public static final Target BTN_BACK_CAMERA_CUADRUPLE = Target.the("BUTTON BACK CAMERA CUADRUPLE'").located(By.xpath("//a[@title='Cuádruple']"));








}
