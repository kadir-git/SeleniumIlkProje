package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {

    //Java projesine chromedriver'i tanittik
        System.setProperty("webdriver.chrome.driver", "C:/Users/kayao/Documents/selenium dependencies/drivers/chromedriver.exe");

        //Selenium ile ilgili ilk kod
        //webDriver nesnesi olustururak, chrome driver'i kullanabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();

        //driver'a google.com'a gitmesini söyledik
        webDriver.get("https://www.google.com/");

        //driver'da acik olan pencereyi kapatir.
        //webDriver.close();

        //driverimi komple kapatir
        //webDriver.quit();

            //https://www.youtube.com/watch?v=YR2llQh9ppk&list=PLeZr8VTNC1oaMV9aHkHZc5azjjUowysbL



    }
}
