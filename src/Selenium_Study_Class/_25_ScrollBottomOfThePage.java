package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;

public class _25_ScrollBottomOfThePage extends GWD {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Bekle(2);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        Bekle(2);
        BekleKapat();
    }
}
