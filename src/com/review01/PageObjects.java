package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjects {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        // What is a WebElement or PageObject
        // links, text boxes, radio button, check boxes, drop down menus, images, buttons

        // for selenium to do actions on page elements we have to provide Location of each web element

        // How do we tell the location of page objects to Selenium? --> Locators in Selenium

        // id, tagName, xpath, css, class, name, linkText, partialLinkText

        // 1. First option is always id

//        driver.findElement(By.id("searchDropdownBox")).click();

//        WebElement deptBtn=driver.findElement(By.id("searchDropdownBox"));

//        deptBtn.click();
//        deptBtn.isDisplayed();
//        deptBtn.isEnabled();

        // 2. Second Option --> name attribute

//        WebElement depBtn2= driver.findElement(By.name("url"));
//
//        depBtn2.click();

        // 3. linkText() --> tag name must be <a> --> we have a text which is not assigned to any atrribute
    }
}
