package com.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class RadioButtonRecap {
    public static void main(String[] args) throws InterruptedException {

        // what is a radio button

        // How can we handle radio buttons

        // 1. Write the WebElement of the specific option and click on it
        // 2. Write WebElements of all aptions inside a List<webElement> and click on a specific option

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to facebook.com
        driver.get("https://www.facebook.com/");

        // 2. Click on Create a New Account
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);

        // 3. Click on Female button

        WebElement femaleBtn=driver.findElement(By.xpath("//label[text()='Female']"));
        //        femaleBtn.click();

        String classValue=femaleBtn.getAttribute("class");
        System.out.println("Class Attribute Value : "+classValue);


        String forValue=femaleBtn.getAttribute("for");
        System.out.println("for attribute vale : "+forValue);

        String visibleText=femaleBtn.getText();
        System.out.println("visible text : "+visibleText);


        // save all options in a List<WebElement> and click on the available option and iterate through the list

        List<WebElement> genderOptions=driver.findElements(By.xpath("//input[@name='sex']"));

        genderOptions.get(1).click();  // --> clicks on Male btn
        genderOptions.get(0).click();  // --> clicks on the Female Btn

        // 1. Regular for loop
        // 2. Enhanced of For-each loop
        // 3. Iterator

//        for(WebElement option:genderOptions){
//            option.click();
//            Thread.sleep(1000);
//        }




//        Iterator<WebElement> gIt=genderOptions.iterator();
//
//        while(gIt.hasNext()){
//            WebElement genderBtn=gIt.next();
//            if(genderBtn.getAttribute("value").equals("2")){
//                genderBtn.click();
//            }
//        }




        Thread.sleep(3000);
        driver.quit();

    }
}
