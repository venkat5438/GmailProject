package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class GmailStepDefinition extends GmailElements {

    public static WebDriver driver;
    @Given("^user navigate to gmail homepage$")
    public void user_navigate_to_gmail_homepage() throws Throwable {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(AutoConstants.ProjDir.Projdir);
    //driver= new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\chromedriver.exe");
        driver= new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(PropHandlerz.fetchProp(AutoConstants.URL.URL));
    driver.manage().window().maximize();

    }

    @When("^user click signin button$")
    public void user_click_signin_button() throws Throwable {

        driver.findElement(GmailElements.UserName).sendKeys(PropHandlerz.fetchProp(AutoConstants.URL.Uname));
    }

    @When("^user enters mailid click next$")
    public void user_enters_mailid_click_next() throws Throwable {

     driver.findElement(GmailElements.NextButton).click();
    }

    @When("^user enters password click next$")
    public void user_enters_password_click_next() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(GmailElements.PassWord).sendKeys(PropHandlerz.fetchProp(AutoConstants.URL.PWD));
        driver.findElement(GmailElements.PassWord).submit();
    }

    @Then("^user should see logged in page$")
    public void user_should_see_logged_in_page() throws Throwable {
        System.out.println("user successfully logged in");
        driver.quit();
    }

}
