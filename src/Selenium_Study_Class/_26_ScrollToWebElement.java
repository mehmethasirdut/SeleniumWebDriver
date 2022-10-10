package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _26_ScrollToWebElement extends GWD {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        WebElement webElement=driver.findElement(By.xpath("//a[text()='About']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView()",webElement);
        Bekle(2);
        js.executeScript("arguments[0].click()",webElement);

        Bekle(2);
        BekleKapat();
    }
}
