package Selenium_Study_Class;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _3_FindLocaters extends GWD {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/");

        WebElement formlarim=driver.findElement(By.xpath("(//a[text()='Formlarım'])[1]"));
        formlarim.click();

        WebElement yeniKlasorOlustur=driver.findElement(By.xpath("//span[text()='Yeni klasör oluştur']"));
        yeniKlasorOlustur.click();

        WebElement klasorAdi=driver.findElement(By.id("input-modal-content-input"));
        klasorAdi.sendKeys("MHD");

        WebElement devamEt=driver.findElement(By.xpath("//button[text()='Devam Et']"));
        devamEt.click();

        WebElement formOlustur=driver.findElement(By.xpath("//span[text()='Form Oluştur']"));
        formOlustur.click();

        WebElement sablonKullan=driver.findElement(By.xpath("(//div[@class='jfWizard-list-item-icon-wrapper'])[2]"));
        sablonKullan.click();

        WebElement rezervasyonFormlari=driver.findElement(By.xpath("(//div[@class='tabContent']//li)[7]"));
        rezervasyonFormlari.click();

        WebElement sablonsec=driver.findElement(By.cssSelector("div[class='item form-item image-loaded'] button"));
        sablonsec.click();

    }
}
