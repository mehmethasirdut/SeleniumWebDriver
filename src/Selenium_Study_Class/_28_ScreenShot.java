package Selenium_Study_Class;

import Utilities.GWD;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class _28_ScreenShot extends GWD {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Bekle(2);
        WebElement username=driver.findElement(By.cssSelector("input[placeholder='Username']"));
        username.sendKeys("Mehmet");
        Bekle(2);
        WebElement password=driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("Hasir");
        Bekle(2);
        WebElement btnLogin=driver.findElement(By.cssSelector("button[type='submit']"));
        btnLogin.click();
        Bekle(2);

        WebElement invalidCredential=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        if (invalidCredential.getText().contains("Invalid")){

            System.out.println("Login olamadı. Hata mesajı gözüktü");

            // Hata ekranının ScreenShot ını alalım
            TakesScreenshot ts=(TakesScreenshot) driver; // 1.Aşama ekran görünütüsü alma değişkenini tanımladım
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);  // 2.Aşama Saklama tipi seçildi (Dosya), data(Veritabanı) (Byte)

            Date d=new Date();
            System.out.println(d);
            String timee=d.toString().replace(":","_").replace(" ","_")+".png";
            TakesScreenshot tss=(TakesScreenshot) driver;
            File hafızadakihalii=tss.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(hafızadakihalii, new File("ekranGoruntuleri/"+timee));

        }

        BekleKapat();

    }
}
