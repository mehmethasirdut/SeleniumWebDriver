package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _20_WaitExample extends GWD {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement chooseBtn=driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        chooseBtn.click();

        WebElement addToCard=driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCard.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        Bekle(2);
        BekleKapat();
    }
}
