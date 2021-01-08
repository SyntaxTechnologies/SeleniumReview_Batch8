package com.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableHandlingRecap {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to syntax selenium practice application
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

        // navigate to Table Sort & Search page
        Thread.sleep(2000);

        driver.findElement(By.linkText("Table")).click();
        driver.findElement(By.linkText("Table Sort & Search")).click();

        // Print all headers

        String[] expHeaders={"Name", "Position", "Office", "Age", "Start date", "Salary"};

        List<WebElement> headers= driver.findElements(By.xpath("//table[@id='example']/thead/tr/th"));

//        int i=0;
//        for(WebElement header:headers){
//            String actHeader=header.getText();
//
//            if(actHeader.equals(expHeaders[i])){
//                System.out.println(actHeader+" is VALID");
//            }
//            i++;
//        }

//        for(int i=0; i<headers.size(); i++){
//            String actHeader=headers.get(i).getText();
//            if(actHeader.equals(expHeaders[i])){
//                System.out.println(actHeader+" is VALID");
//            }
//        }

        String header=driver.findElement(By.xpath("//table[@id='example']/thead/tr")).getText();
        System.out.println(header);

        // How can we do assertion with single String value

//        for(int i=0; i<expHeaders.length; i++){
//            if(header.contains(expHeaders[i])){
//                System.out.println(expHeaders[i]+" is VALID");
//            }
//        }

        // Lets validate web table body

        // Print all rows one by one

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));

        // print out how many rows we have

//        int rowCount=rows.size();
//        System.out.println("Number of rows : "+rowCount);
//
//        for(WebElement row:rows){
//            System.out.println(row.getText());
//        };

        List<WebElement> cells= driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        System.out.println("Number of cells : "+cells.size());

//        for(int i=0; i<cells.size(); i++){
//            System.out.println(cells.get(i).getText()+" - ");
//        };

        // While writing xpath if we use td we will get the cell
        // without td we will get the rows

        // Can we get all values from a column???

        for(int i=1; i<cells.size(); i+=6){
            System.out.println(cells.get(i).getText());
        };
        Thread.sleep(2000);
        driver.quit();
    }
}
