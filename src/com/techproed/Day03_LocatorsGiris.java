package com.techproed;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        //Java projesine, chromedriver'i tanittik
        System.setProperty("webdriver.chrome.driver", "C:/Users/kayao/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //ilk webelementini buluyoruz
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        //email kutusunu bulalim
        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        //email kutusunun icerisine yazi gönderiyoruz
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifre kutusunu buluyor
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));

        //sifre kutusunun icerisine yazi gönderiyoruz
        sifreKutusu.sendKeys("Test1234!");

        //Sign in butonunu buluyoruz //name=""commit"
        WebElement singInButonu = driver.findElement(By.name("commit"));
        singInButonu.click();

        String baslik = driver.getTitle();
        if (baslik.equals("Address Book")){
            System.out.println("Giris Basarili.");
        }else{
            System.out.println("Giris Basarisiz!");
        }


    }


}
