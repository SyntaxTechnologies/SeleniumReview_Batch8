package com.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalenderHandlingRecap {
    public static void main(String[] args) throws InterruptedException {

        /*
        How many ways to pick up a date from a calender
        1. sendText()
        2. dd menu --> Select Class or List<WebElement>
        3. Web Tables
         */


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to syntax selenium practice application
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        // Login OrangeHRM

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(3000);

        // Navigate to Project Report page

        Actions action=new Actions(driver);
        WebElement timeBtn= driver.findElement(By.linkText("Time"));

        action.moveToElement(timeBtn).perform();
        Thread.sleep(1000);

        WebElement reportsBtn=driver.findElement(By.linkText("Reports"));
        action.moveToElement(reportsBtn).perform();

        Thread.sleep(1000);

        WebElement projectReportsBtn=driver.findElement(By.linkText("Project Reports"));
        action.click(projectReportsBtn).perform();

        // Send the date to the calender text box

        driver.findElement(By.id("project_date_range_from_date")).click();
        driver.findElement(By.id("project_date_range_from_date")).sendKeys("2021-01-15");


        Thread.sleep(1000);
        // select month by using Select class

        WebElement months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select mSelect=new Select(months);
        // selectByIndex, SelectByValue, selectByVisibleText

        mSelect.selectByVisibleText("Jul");

        // Select year by using List<WebElement>

        Thread.sleep(1000);

        List<WebElement> years=driver.findElements(By.xpath("//select[@class='ui-datepicker-year']/option"));

        for(WebElement year:years){
            if(year.getText().equals("2016")){
                year.click();
                break;
            };
        };

        Thread.sleep(1000);

        List<WebElement> days= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for(WebElement day:days){
            if(day.getText().equals("15")){
                day.click();
                break;
            };
        };



        Thread.sleep(3000);
        driver.quit();








    }
}
