package com.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsRecap {
    public static void main(String[] args) throws InterruptedException {

        // 1. Set properties for our webdriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Create an object of WebDriver interface
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // .navigate().to(String URL)

        // lets navigate to ebay

        String ebayUrl="https://www.ebay.com/";
        driver.navigate().to(ebayUrl);

        Thread.sleep(2000);

        // navigate to amazon.com

        driver.navigate().to("https://www.amazon.com/");

        Thread.sleep(2000);

        // navigate back to ebay

        driver.navigate().back();

        // get title and url of the current web page and

        String currentUrl=driver.getCurrentUrl();
        System.out.println("Current URL : "+currentUrl);

        String currentTittle=driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        driver.close();
    }
}
