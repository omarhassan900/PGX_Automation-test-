package org.exple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Test {
    WebDriver webDriver =null;


    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.navigate().to("https://pgxegypt.mdconsults.org/cases/list");
        webDriver.manage().window().maximize();
    }


    
    public void login() {

        webDriver.findElement(By.id("username")).sendKeys("Dr.Ahmed");
        webDriver.findElement(By.id("password")).sendKeys("asdfasdf");
        webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/div[1]/form/fieldset[3]/div[1]/span[2]")).click();
        webDriver.findElement(By.cssSelector(".rc-anchor-checkbox")).click();
        webDriver.findElement(By.id("btn-validate")).click();

        String acctualResult = webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[1]/div/div[2]/h2")).getText();
        String expextedResult = "Welcome to MDConsults";

    }




}
