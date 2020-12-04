package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameRecap {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        // Find out how many links available on amazon.com and find how many of them is not empty
        // and print all non-empty links

        // findElement()                          --                findElements()
        // returns one element                                     returns List<WebElement>
        // NoSuchElementException                                  empty list
        // returns the first occurance  returns                    List<WebElement>

        List<WebElement> links=driver.findElements(By.tagName("a"));

        System.out.println("Number of Links : "+links.size());

        Thread.sleep(3000);

        int count=0;
        int emptyCount=0;

        for(WebElement link:links){
            if(!link.getText().isEmpty()){
                count++;
                System.out.println(link.getText());
            }else{
                emptyCount++;
            }
        }

        System.out.println("Number of non-empty links : "+count);
        System.out.println("Number of empty links : "+emptyCount);

        driver.quit();
    }
}
