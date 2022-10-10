package Selenium_Study_Class;

import Utilities.GWD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_Action extends GWD {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(doubleClick).doubleClick().build();
        aksiyon.perform();

        WebElement doubleClickMessage=driver.findElement(By.id("doubleClickMessage"));
        Assert.assertTrue(doubleClickMessage.getText().contains("double click"));
        System.out.println(doubleClickMessage.getText());
        Bekle(2);


        WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
        aksiyon=aksiyonlar.moveToElement(rightClick).contextClick().build();
        aksiyon.perform();

        WebElement rightClickMessage=driver.findElement(By.id("rightClickMessage"));
        Assert.assertTrue(rightClickMessage.getText().contains("right click"));
        System.out.println(rightClickMessage.getText());
        Bekle(2);

        WebElement clickMe=driver.findElement(By.xpath("//button[text()='Click Me']"));
        aksiyon=aksiyonlar.moveToElement(clickMe).click().build();
        aksiyon.perform();
        WebElement clickMeMessage=driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue(clickMeMessage.getText().contains("dynamic click"));
        System.out.println(clickMeMessage.getText());
        Bekle(2);

        BekleKapat();

    }
}
