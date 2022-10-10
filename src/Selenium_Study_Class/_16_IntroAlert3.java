package Selenium_Study_Class;

import Utilities.GWD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _16_IntroAlert3 extends GWD {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement promptBox=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        promptBox.click();
        Bekle(2);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Mehmet");
        Bekle(2);
        driver.switchTo().alert().accept();

        WebElement sendKey=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        Assert.assertTrue(sendKey.getText().toLowerCase().contains("mehmet"));

    }
}
