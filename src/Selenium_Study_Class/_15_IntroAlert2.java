package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _15_IntroAlert2 extends GWD {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
        clickMe2.click();

        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        BekleKapat();
    }
}
