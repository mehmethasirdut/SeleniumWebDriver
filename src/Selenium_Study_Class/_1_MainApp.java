package Selenium_Study_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_MainApp {


    //https://www.selenium.dev/downloads/
    // https://chromedriver.chromium.org/
    // Selenium Web Driver file ını library e aktar
    // junit 4.0.3 versiyonunu library de from maven diyerek içeri aktar
    // chromedriver i file yaparak intellije yükle
    // selenium kurulmuştur.
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
