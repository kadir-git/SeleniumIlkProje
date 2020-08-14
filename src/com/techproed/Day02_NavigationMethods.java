package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {

        //Java projesine, chromedriver'i tanittik
        System.setProperty("webdriver.chrome.driver", "C:/Users/kayao/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        //driverin tüm ekrani kaplamasini saglar
        webDriver.manage().window().maximize();

        //driver'a google.com'a gitmesini söyledik
        webDriver.get("https://www.google.com");

        //get komutu ile ayni islemi yapiyor
        webDriver.navigate().to("https://www.amazon.com");

        //navigate().back() methodu bir önceki sayfaya dönmeye yarar
        webDriver.navigate().back();

        //navigate().forward(); methodu geri geldigimiz sayfaya gitmemizi saglar
        //Ör: google -> amazona gittik -> amazondan google'a geri geldik
        //eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();

        //navigate().refresh() methodu sayfayi yenilemeye yarar
        webDriver.navigate().refresh();


    }

}
