package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _18_ExplicitWait extends GWD {
    public static void main(String[] args) {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement btn=driver.findElement(By.cssSelector("[onclick='timedText()']"));
        btn.click();

        WebElement webDriverText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        System.out.println(webDriverText.getText());
        BekleKapat();

    }
}
