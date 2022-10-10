package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _10_DragAndDropBy extends GWD {
    public static void main(String[] args) {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu=driver.findElement(By.cssSelector("div[id='slider-range'] span"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDropBy(solSurgu,100,0).build();
        aksiyon.perform();
        Bekle(4);
        BekleKapat();
    }
}
