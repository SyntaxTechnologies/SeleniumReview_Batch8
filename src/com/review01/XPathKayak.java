package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class XPathKayak {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.kayak.com/");

        Thread.sleep(4000);

        // enter Dallas to

        Actions action=new Actions(driver);



        WebElement box=driver.findElement(By.cssSelector("div[id$='-pickup-display']"));
        action.moveToElement(box).click().perform();

        driver.findElement(By.cssSelector("input[id$='-pickup']")).sendKeys("Dallas");

    }
}
