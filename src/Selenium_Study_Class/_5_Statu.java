package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _5_Statu extends GWD{
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement monday =driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        System.out.println("seçili mi? "+monday.isSelected());
        Bekle(2);
        monday.click();
        System.out.println("clickten sonra seçili mi? "+monday.isSelected());
        System.out.println("**************");
        WebElement saturday=driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("saturday görünüyor mu? "+saturday.isDisplayed()); // görünüyor mu?
        System.out.println("saturday etkinleştirilmiş mi? "+saturday.isEnabled()); // etkinleştirilmiş mi?
        BekleKapat();

    }
}
