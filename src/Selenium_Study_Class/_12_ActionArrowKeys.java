package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _12_ActionArrowKeys extends GWD {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox=driver.findElement(By.cssSelector("div[id='autoCompleteMultipleContainer']>div>div"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(textBox).click().sendKeys("B").sendKeys(Keys.DOWN)
                .keyDown(Keys.ENTER).keyUp(Keys.ENTER).build();
        aksiyon.perform();
        Bekle(3);
        BekleKapat();
    }
}
