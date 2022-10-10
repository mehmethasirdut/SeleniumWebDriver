package Selenium_Study_Class;

import Utilities.GWD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _6_Assert extends GWD {
    public static void main(String[] args) {

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        Bekle(2);
        WebElement friday=driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
        friday.click();
        Bekle(2);
        Assert.assertTrue(friday.isSelected()); // seçili ise rahatsız etme

        WebElement saturday=driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-label"));
        Assert.assertTrue(friday.isEnabled()); // etkinleştirilmiş ise rahatsız etme
        WebElement sunday=driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-label"));
        Assert.assertTrue(friday.isDisplayed()); // görünüyor ise rahatsız etme

        BekleKapat();



    }
}
