package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Homework {
    /*
1. Yeni bir class oluşturun :Homework
2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın,
    Değilse, doğru başlığı(Actual title) yazdırın.
3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
4. Ardından Navigate to https://www.walmart.com/
5. Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
6. Navigate back to facebook
7. Sayfayı yenileyin(refresh)
8. Maximize the window
9. Close the browse
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kayao\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String faceTitle = driver.getTitle();
//      System.out.println(faceTitle);      Facebook – Anmelden oder Registrieren
        if (faceTitle.toLowerCase().contains("facebook")){
            System.out.println("Page Title: Dogru!");
        }else{
            System.out.println("Page Title: Dogru degil!");
            System.out.println("Actual Title: ");
        }

        String faceUrl = driver.getCurrentUrl();
        if (faceUrl.toLowerCase().contains("facebook")){
            System.out.println("URL: Dogru");
        }else{
            System.out.println("URL: Dogru degil!");
            System.out.println("Actual URL: https://www.facebook.com/");
        }

        driver.navigate().to("https://www.walmart.com/");
        String walmartTitle = driver.getTitle();
//        System.out.println(walmartTitle);     Walmart.com | Save Money. Live Better.
        if (walmartTitle.toLowerCase().contains("Walmart.com")){
            System.out.println("Page Title icerigi: Dogru!");
        }else{
            System.out.println("Page Title icerigi: Yanlis!");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();

    }
}
