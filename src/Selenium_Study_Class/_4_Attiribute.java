package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _4_Attiribute extends GWD {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement element=driver.findElement(By.id("inputValEnter"));

        System.out.println("class= " + element.getAttribute("class"));
        System.out.println("name= "+ element.getAttribute("name"));
        System.out.println("type= "+ element.getAttribute("type"));
        System.out.println("id= "+ element.getAttribute("id"));


        System.out.println("background= "+ element.getCssValue("background"));
        System.out.println("color= "+ element.getCssValue("color"));
        System.out.println("font-family= "+ element.getCssValue("font-family"));

        BekleKapat();

    }
}
