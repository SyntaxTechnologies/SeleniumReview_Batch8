package com.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {


    public static void main(String[] args) throws InterruptedException {

        // We handle drop down menus in two ways
        // 1. If tagName is Select --> Select Class
        // 2. If tagName is NOT Select --> List<WebElements>  --> Radio Buttons and Check boxes


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to facebook.com
        driver.get("https://www.facebook.com/");

        // 2. Click on Create a New Account
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);

        // 3. Select Jul-15-2016

                // 1. Step  --> Write the WebElement of DropDown Menu which starts with Select tag
        WebElement months =driver.findElement(By.id("month"));

                // 2. Create an object of Select Class

        Select mSelect=new Select(months);

                // 3. Select the Option you want
                        // 1. selectByVisibleText

        mSelect.selectByVisibleText("Jul");

        Thread.sleep(1000);

        // Create WebElement of day select drop-down menu
        WebElement days= driver.findElement(By.id("day"));

        // Create and object of Select class

        Select dSelect=new Select(days);

        // select the option you want

        dSelect.selectByIndex(15);

        Thread.sleep(1000);

        //  1. Create web element of year drop down menu

        WebElement years=driver.findElement(By.id("year"));

        // 2. Create an object of select class

        Select ySelect=new Select(years);

        // 3. Select the year you want

        ySelect.selectByValue("2016");

        List<WebElement> yOptions=ySelect.getOptions();

        for(WebElement year:yOptions){
            year.click();
            Thread.sleep(250);
        }



        Thread.sleep(3000);
        driver.quit();


    }
}
