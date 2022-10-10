package Selenium_Study_Class;

import Utilities.GWD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _27_RobotClass extends GWD {
    public static void main(String[] args) throws AWTException {

        // Kütüphaneden Robot Classı ekledim

        driver.get("http://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();

        for (int i=1;i<=21;i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        Bekle(2);
        rbt.keyPress(KeyEvent.VK_R);
        rbt.keyRelease(KeyEvent.VK_R);
        rbt.keyPress(KeyEvent.VK_O);
        rbt.keyRelease(KeyEvent.VK_O);
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        driver.switchTo().defaultContent();

        WebElement accept=driver.findElement(By.id("terms"));
        accept.click();

        WebElement submitbutton = driver.findElement(By.id("submitbutton"));  // submıt butonuna bastık
        submitbutton.click();

        WebElement asser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(asser.getText().contains("has been successfully uploaded."));

        BekleKapat();

    }
}
