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



}
