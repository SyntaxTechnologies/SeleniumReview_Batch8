package com.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxRecap {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to syntax selenium practice application
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

        // 2. Navigate to Checkbox practice page

        driver.findElement(By.linkText("Input Forms")).click();
        driver.findElement(By.linkText("Checkbox Demo")).click();

        // 3. Click on the requested button
                // 1. Write the WebElement of the requested option + click on it

                // 2. Save WebElements of all options inside a List<WebElement> and iterated through it and click on the option
        List<WebElement> options=driver.findElements(By.cssSelector("input.cb1-element"));

//        options.get(2).click();

//        for(int i=0; i<options.size(); i++){
//            options.get(i).click();
//            Thread.sleep(1000);
//        }

        // click on option-4

        for(int i=0; i<options.size(); i++){
            if(options.get(i).getAttribute("value").equals("Option-4")){
                options.get(i).click();
                break;
            }
        }




        Thread.sleep(3000);
        driver.quit();

    }
}
