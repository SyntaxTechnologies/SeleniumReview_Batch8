package com.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathRecapContinued {
    /* 1. Xpath
    2. cssSelector
    3. WebElement commands
    4. RadioButtons and Check Boxes
    5. Drop Down and Multiple Selection menus
    6. switchTo() commands
    7. Handling Alert
    8. Handling iFrames
    9. Handling windoows
     */

    // basic syntax for xpath = //tagName[@attribute='attributeValue']
    //                          //tagName[text()='textValue']

    //                          //tagName[@attribute1='att1Value' and @attribute2='att2Value']
    //                          //tagName[@attribute1='att1Value' or @attribute2='att2Value']


    //img[@id='hide' and @width='11%']

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

        // Let's check whether Syntax logo is displayed on the top of the web page

        // use two attributes

        WebElement logo=driver.findElement(By.xpath("//img[@id='hide' and @width='11%']"));

        // use one atrribute and index  --> (//img[@id='hide'])[2]

        // findElements() --> List<WebElements>

        List<WebElement> logos=driver.findElements(By.xpath("//img[@id='hide']"));

        logos.get(0); // --> First logo
        logos.get(1); // --> Second logo on the bottom

        //tagName[contains(@attribute,'attributeValue')]

        WebElement logo1=driver.findElement(By.xpath("(//img[contains(@src, 'syntaxlogowhite')])[1]"));
        System.out.println("Is logo1 displayed = "+logo1.isDisplayed());

        //tagName[starts-with(@attribute,'attributeValue')]

        WebElement logo2=driver.findElement(By.xpath("(//img[starts-with(@src, 'img/syntax')])[2]"));
        System.out.println("Is logo2 enabled = "+ logo2.isEnabled());


        Thread.sleep(2000);

        //tagName[contains(text(),'textValue')]

        driver.findElement(By.xpath("//a[contains(text(), 'gress Bars & Slid')]")).click();

        //tagName[starts-with(text(),'textValue')]

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(text(), 'Progress Bars')]")).click();


        Thread.sleep(2000);
        driver.quit();
    }
}
