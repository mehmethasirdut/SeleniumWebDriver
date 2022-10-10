package Selenium_Study_Class;

import Utilities.GWD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _19_ExplicitWaitExample extends GWD {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("Hello");

        WebElement comment=driver.findElement(By.id("description"));
        comment.sendKeys("Selenium");

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement control=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit-control")));

        Bekle(2);
        System.out.println(control.getText());
        BekleKapat();
    }
}
