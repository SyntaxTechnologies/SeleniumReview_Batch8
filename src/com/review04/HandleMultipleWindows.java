package com.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleMultipleWindows {
    public static void main(String[] args) throws InterruptedException {


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

        // Click on Follow on Instagram&Facebook btn and send username and password both of them and close child windows

        // 1. Click on Follow on Instagram&Facebook btn
        driver.findElement(By.linkText("Follow Instagram & Facebook")).click();

        // 2. Get window handles and save children window handles

        Set<String> handles=driver.getWindowHandles();  // We have 3 handles
        Iterator<String> handleIt=handles.iterator();

        parentHandle=handleIt.next();
        String childHandle1=handleIt.next();
        String childHandle2=handleIt.next();

        System.out.println(parentHandle);
        System.out.println(childHandle1);
        System.out.println(childHandle2);

        driver.switchTo().window(childHandle1);  // FaceBook child window

        driver.findElement(By.id("email")).sendKeys("admin@admin.com");

        driver.close();  // close child1 browser

//        driver.switchTo().window(parentHandle); // parent window

        driver.switchTo().window(childHandle2);  // follow on instagram

        System.out.println(driver.getWindowHandle());



        //

        //


        Thread.sleep(2000);
        driver.quit();

        //


    }
}
