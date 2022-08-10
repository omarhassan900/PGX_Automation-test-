package org.exple.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver webDriver=null;

    public LoginPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public WebElement userName(){
        return webDriver.findElement(By.id("username"));
    }
    public WebElement password() { return webDriver.findElement(By.id(("password")));}
    public WebElement select_type(){return webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/div[1]/form/fieldset[3]/div[1]/span[2]"));}
    public WebElement robotCheck() {return webDriver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[4]"));}
    public WebElement loginBtn() {return webDriver.findElement(By.id("btn-validate"));}


}
