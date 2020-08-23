package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kayao/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        WebElement passKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        passKutusu.sendKeys("Test1234");

        passKutusu.submit();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        // WebElement loginButonu = driver.findElement(By.cssSelector("#u_0_d"));
        // WebElement loginButonu = driver.findElement(By.xpath("//button"));
        // loginButonu.click();

        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {

        }


        //https://www.facebook.com/login/
        String url = driver.getCurrentUrl();
        System.out.println(url);

        if (url.contains("facebook.com/login")){
            System.out.println("Giris Basarisiz !");
        }else{
            System.out.println("Giris Basarili !");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
