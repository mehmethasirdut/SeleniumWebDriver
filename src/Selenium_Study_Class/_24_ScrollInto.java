package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;

public class _24_ScrollInto extends GWD {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");
        Bekle(2);
        js.executeScript("window.scrollBy(0,-1500)");
        Bekle(2);
        BekleKapat();
    }
}
