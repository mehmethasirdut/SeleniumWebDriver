package Selenium_Study_Class;

import Utilities.GWD;
import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Set;

public class _23_Window extends GWD {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId=driver.getWindowHandle();

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler){
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowIdler=driver.getWindowHandles();
        for (String id:windowIdler)
            System.out.println(id);

        for (String id:windowIdler){
            Bekle(2);
            driver.switchTo().window(id);
            if (!id.equals(anaSayfaWindowId))
                driver.switchTo().window(id).close();
        }


        Bekle(4);
        BekleKapat();
    }
}
