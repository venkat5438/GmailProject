package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by breddy on 10-05-2017.
 */
public class GapStepDefiniton2 extends GapElements {
    WebDriver driver;

    @Given("^user navigate to main page$")
    public void user_navigate_to_main_page() throws Throwable {
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\chromedriver.exe");
       // driver= new ChromeDriver();
        driver=new FirefoxDriver();
        driver.get(PropHandlerz.fetchProp(AutoConstants.URL.GAURL));
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandles());
        driver.findElement(Button).click();
        //driver.findElement(By.xpath("//*[contains(@href,'#')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(Modal_Close_Button).click();
        String Title= driver.getTitle();
        System.out.println(Title);
    }

    @When("^user click Men tab and Verify Categories text present$")
    public void user_click_Men_tab_and_Verify_Categories_text_present() throws Throwable {

        driver.findElement(Men).click();
        String Mentitle=driver.getTitle();
        System.out.println(Mentitle);
      String Text=  driver.findElement(Categories).getText();
       String PageSource= driver.getPageSource();
       if(PageSource.contains(Text)){

           System.out.println("categories present on the page");

       }

    }

    @When("^capture all the categories names$")public void capture_all_the_categories_names() throws Throwable {
        driver.findElement(Jeans).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         // below we commented code for random jeans
        /*List<WebElement> listings = driver.findElements(By.xpath("//div[@class='g-1-2 g-lg-1-3 g-xl-1-3 g-1280-1-4']/div/div[1]/div[3]/div/a/div"));
        Random r = new Random();
        int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
        listings.get(randomValue).click();*/ //Clicking on the random item in the list.

        driver.findElement(Bootfitjeans).click(); // here we are directly clicking on bootfit model

        List<WebElement> pillboxtext = driver.findElements(By.xpath("//div[@id='product']/div[2]/div[1]/div[2]/div[2]/div/div/div/label/span"));
        int count = pillboxtext.size();
        System.out.println(count);
        Random r2 = new Random();
        int randomValue1 = r2.nextInt(pillboxtext.size()); //Getting a random value that is between 0 and (list's size)-1
        pillboxtext.get(randomValue1).click(); //Clicking on the random item in the list.
        System.out.println(pillboxtext.get(randomValue1).getText());  // here we are printing the type

        List<WebElement> waist = driver.findElements(By.xpath("//div[@id='waist']/div[3]/div/div/div/div/div/label"));
        int count1=waist.size();
        System.out.println(count1);
        Random r3 = new Random();
        int randomValue2 = r3.nextInt(waist.size()); //Getting a random value that is between 0 and (list's size)-1

        waist.get(randomValue2).click();//Clicking on the random item in the list.
        System.out.println(waist.get(randomValue2).getText());  // here we are printing the type


        List<WebElement> length = driver.findElements(By.xpath("//div[@id='length']/div[3]/div/div/div/div/div/label"));
        int count2=length.size();
        System.out.println(count2);
        Random r4 = new Random();
        int randomValue3 = r4.nextInt(length.size()); //Getting a random value that is between 0 and (list's size)-1
        length.get(randomValue3).click();//Clicking on the random item in the list.
        System.out.println(length.get(randomValue3).getText());  // here we are printing the type


        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        List<WebElement> quantity = driver.findElements(By.xpath("//div[@class='quantity quantity_size']/input"));
        int count3=quantity.size();
        System.out.println(count3);
        Random r5 = new Random();
        int randomValue4 = r5.nextInt(quantity.size()); //Getting a random value that is between 0 and (list's size)-1
        System.out.println(randomValue4);


        WebElement radio1= driver.findElement(By.xpath("//div[@id='product']/div[2]/div[1]/div[2]/div[5]/div/div[2]/label[1]/span/span"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(radio1.isEnabled());
        radio1.click();
        AutoUtils.captureScreenShot(driver,"quantity1 click");
        System.out.println(radio1.isSelected());


        WebElement radio2= driver.findElement(By.xpath("//div[@id='product']/div[2]/div[1]/div[2]/div[5]/div/div[2]/label[2]/span/span"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(radio2.isEnabled());
        System.out.println(radio2.getText());
        String radio2text=radio2.getText();
        int radio2value=Integer.parseInt(radio2text);

        WebElement radio3= driver.findElement(By.xpath("//div[@id='product']/div[2]/div[1]/div[2]/div[5]/div/div[2]/label[3]/span/span"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(radio3.isEnabled());
        System.out.println(radio3.getText());
        String radio3text=radio3.getText();
        int radio3value=Integer.parseInt(radio3text);

        WebElement radio4= driver.findElement(By.xpath("//div[@id='product']/div[2]/div[1]/div[2]/div[5]/div/div[2]/label[4]/span/span"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(radio4.isEnabled());
        System.out.println(radio4.getText());
        String radio4text=radio4.getText();
        int radio4value=Integer.parseInt(radio4text);

        WebElement radio5= driver.findElement(By.xpath("//div[@id='product']/div[2]/div[1]/div[2]/div[5]/div/div[2]/label[5]/span/span"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(radio5.isEnabled());
        System.out.println(radio5.getText());
        String radio5text=radio5.getText();
        int radio5value=Integer.parseInt(radio5text);

        if(randomValue4==radio2value){

            radio2.click();
            //AutoUtils.captureScreenShot(driver,"quantity2click");
            System.out.println(radio2.isSelected());

        }

        else if(randomValue4==radio3value){
            radio3.click();
            //AutoUtils.captureScreenShot(driver,"quantity3click");
            System.out.println(radio3.isSelected());
        }

        else if(randomValue4==radio4value){

            radio4.click();
            //AutoUtils.captureScreenShot(driver,"quantity4click");
            System.out.println(radio4.isSelected());

        }


       else if (randomValue4==radio5value)

           {

               radio5.click();
               // AutoUtils.captureScreenShot(driver,"quantity5click");
               System.out.println(radio5.isSelected());
        }

         else{

            System.out.println("randomvalue4 printed as 0");
        }
    }

        @Then("^close the driver$")
        public void close_the_driver () throws Throwable {
            String title = driver.getTitle();
            System.out.println(title);
        }

}
