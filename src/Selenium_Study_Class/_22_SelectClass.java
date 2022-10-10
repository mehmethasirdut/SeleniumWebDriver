package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _22_SelectClass extends GWD {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        WebElement frame2=driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);
        WebElement menu=driver.findElement(By.cssSelector("select[id='animals']"));
        Bekle(3);

        Select ddmenu=new Select(menu); // menudekilerden indeksine göre seçtik
        ddmenu.selectByIndex(2);

        BekleKapat();
    }
}
