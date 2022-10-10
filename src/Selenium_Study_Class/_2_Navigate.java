package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _2_Navigate extends GWD {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement element=driver.findElement(By.id("alerttest"));
        element.click();
        Bekle(2);
        driver.navigate().back();
        Bekle(2);
        driver.navigate().forward();
        BekleKapat();

    }
}
