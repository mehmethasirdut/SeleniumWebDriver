package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _14_IntroAlert1 extends GWD {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1=driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
        clickMe1.click();
        Bekle(2);
        driver.switchTo().alert().accept();

        BekleKapat();
    }
}
