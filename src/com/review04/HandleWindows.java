package com.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleWindows {

    public static void main(String[] args) throws InterruptedException {

        /*
        agenda
        1. How to handle windows in Selenium
        2. Handle web tables
        3. Handle calenders
         */

        // What is an alert --> popup windows which attracts our attention to something important
        // How to handle alerts --> switchTo() command
        // accept, cancel/deny, sendText(), getText()


        // iFrame --> inline Frame --> Frame or window inside another window
        // how to handle iFrame --> switchTo()


        // Window handling
        // How to handle windows --> switchTo() + window handle
        // What is a window handle --> id of a window

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to syntax selenium practice application
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

        // navigate to Window Popup Modal page

        driver.findElement(By.linkText("Alerts & Modals")).click();
        driver.findElement(By.linkText("Window Popup Modal")).click();

        // save Parent window handle and display it

        String parentHandle=driver.getWindowHandle();

        System.out.println("Parent window handle : "+parentHandle);

        Thread.sleep(2000);

        // Click on Follow on Instagram btn and get all window handles

        driver.findElement(By.linkText("Follow On Instagram")).click();

        Set<String> handles=driver.getWindowHandles();

        // How to retrieve or access handles --> iterator
        // create the iterator for handles

        Iterator<String> handleIt=handles.iterator();

        // 1. without a loop

        parentHandle=handleIt.next();
        String childHandle=handleIt.next();

        System.out.println(parentHandle);
        System.out.println(childHandle);

        // Enter username and password on child window and close it them
        // Switch to child window

        Thread.sleep(2000);

        driver.switchTo().window(childHandle);

        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Qaz123");














        Thread.sleep(3000);
//        driver.quit();
        driver.close();

    }
}
