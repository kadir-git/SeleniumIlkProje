package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/kayao/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.amazon.com");
        String amazonTitle = driver.getTitle();    //Car var mi? yok mu?

        //contains() methodu bir kelimenin bir yazida olup olmadigini kontrol eder
        if (amazonTitle.toLowerCase().contains("car")){
            System.out.println("Car kelimesi VAR! ");
        }else {
            System.out.println("Car kelimesi YOK! ");
        }


        driver.quit();

        // if - else
        // for döngüsü
        // foreach
        // nesne oluşturma
        // methodlar

    }

}
