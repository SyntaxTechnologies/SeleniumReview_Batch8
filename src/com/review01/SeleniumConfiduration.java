package com.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfiduration {
    public static void main(String[] args) throws InterruptedException {

        // 1. Set properties for our webdriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Create an object of WebDriver interface
        WebDriver driver=new ChromeDriver();

        // ChromeDriver (BrowserDriver) extend RemoteWebDriver
        // RemoteWebDriver implements WebDriver

        // Navigate to specified web application

        String amazonUrl="https://www.amazon.com/";
//        driver.get("https://www.amazon.com/");

        driver.get(amazonUrl);

        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);

        String expTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        String actTitle= driver.getTitle();
        System.out.println(actTitle);

        if(expTitle.equals(actTitle)){
            System.out.println("Title validation testPASS");
        }else{
            System.out.println("Title validation test FAIL");
        }


        String handle= driver.getWindowHandle();
        System.out.println(handle);

        // navigate() methods --> keeps our browsing history and enables us to specific page or navigate back and forward
        // or refresh our browser




        Thread.sleep(3000);

        driver.close();

        driver.quit();


    }
}
