package org.exple.StepDefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.exple.pages.LoginPage;


public class Loginsteps {

    @When("user enter right username and password")
    public void loggin(){
        LoginPage loginPage=new LoginPage(Hooks.webDriver);
        loginPage.userName().sendKeys("username");
        loginPage.password().sendKeys("password");

    }
    @When("select type")
    public void select_type(){
        LoginPage loginPage=new LoginPage(Hooks.webDriver);
        loginPage.select_type().click();
    }
    @When("click robot check box")
    public void click_robot_check(){
        LoginPage loginPage=new LoginPage(Hooks.webDriver);
        loginPage.robotCheck().click();
    }

    @When("click login button")
    public void loginBtn(){
        LoginPage loginPage=new LoginPage(Hooks.webDriver);
        loginPage.loginBtn().click();

    }






}
