package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _09_ClickAndHold extends GWD {
    public static void main(String[] args) {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement> capitals=driver.findElements(By.cssSelector("div[class='dragableBox'][id^='box']"));
        List<WebElement> countries=driver.findElements(By.cssSelector("div[class='dragableBoxRight'][id^='box']"));
        Actions aksiyonlar=new Actions(driver);

        for (WebElement capital: capitals){

            for (WebElement country:countries){
                Action aksiyon=aksiyonlar.clickAndHold(capital).moveToElement(country).release().build();
                aksiyon.perform();

                if (capital.getAttribute("style").contains("rgb(0, 255, 0)"))
                    break;

            }

        }

        BekleKapat();

    }
}
