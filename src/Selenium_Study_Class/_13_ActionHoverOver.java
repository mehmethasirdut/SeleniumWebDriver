package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _13_ActionHoverOver extends GWD {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");

        Actions aksiyonlar=new Actions(driver);
        WebElement jewelery=driver.findElement(By.xpath("//span[contains(text(),'Jewelry & Accessories')]"));
        WebElement necklaces=driver.findElement(By.xpath("(//span[contains(@id,'side-nav-category-link')])[3]"));
        WebElement bibNecklaces=driver.findElement(By.xpath("//a[@href='/c/jewelry/necklaces/bib-necklaces?ref=catnav-10855']"));

        aksiyonlar.moveToElement(jewelery).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(necklaces).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(bibNecklaces).click().build().perform();


        Bekle(3);
        BekleKapat();
    }
}
