package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.crypto.Mac;

public class _08_DragAndDrop extends GWD {
    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        //1.Yöntem
        Actions aksyiyonlar=new Actions(driver);
        Action aksiyon=aksyiyonlar.dragAndDrop(oslo,norvec).build();
        aksiyon.perform();

        //aksyiyonlar.dragAndDrop(oslo,norvec).build().perform;  // bu şekilde de yapılabilir

        Bekle(3);


        //2.Yöntem
        WebElement seul=driver.findElement(By.id("box5"));
        WebElement kore=driver.findElement(By.id("box105"));
        aksiyon=aksyiyonlar.clickAndHold(seul).moveToElement(kore).release().build();
        aksiyon.perform();


        BekleKapat();
    }
}
