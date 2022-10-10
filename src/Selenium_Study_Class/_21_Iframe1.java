package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _21_Iframe1 extends GWD {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        Bekle(2);
        WebElement frame1=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        WebElement topic=driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Selenium");

        Bekle(2);
        WebElement frame3=driver.findElement(By.id("frame3"));
        driver.switchTo().frame(frame3);
        WebElement radioButton=driver.findElement(By.cssSelector("input[id='a']"));
        radioButton.click();

        driver.switchTo().defaultContent(); // anasayfaya döner

        Bekle(2);
        WebElement frame2=driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);
        WebElement animals=driver.findElement(By.cssSelector("select[id='animals']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(animals).click().keyDown(Keys.DOWN).keyUp(Keys.DOWN)
                .click().build();
        aksiyon.perform();
        Bekle(2);
        BekleKapat();

    }
}
