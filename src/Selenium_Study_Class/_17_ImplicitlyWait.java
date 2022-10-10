package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _17_ImplicitlyWait extends GWD {
    public static void main(String[] args) {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement clickButton=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        clickButton.click();

        Duration dr=Duration.ofSeconds(30);

        driver.manage().timeouts().implicitlyWait(dr);  // dolaylı olarak istenilen element görünene kadar bekleme işlemini yapar

        WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        BekleKapat();

    }
}
