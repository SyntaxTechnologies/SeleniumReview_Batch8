package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRecap {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        // XPath --> absolute (Native)
        //       --> Relative

       String absolutePath= "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select";

       // Relative xpath
        // Syntax for basic xpath  -->    //tagNam[@attribute='attributeValue']
        //                         -->    //tagName[text()='textValue']

        String relXpath="//select[@id='searchDropdownBox']";

        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();

//        //a[text()='Entitlements']





    }
}
