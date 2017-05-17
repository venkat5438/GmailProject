package features;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class AutoUtils {

        public static void setTimeOut(int seconds) throws InterruptedException {
            Thread.sleep(seconds);
        }

        public static boolean checkResponse(String url)
        {
            try {
                int response_code = org.apache.http.client.fluent.Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
                System.out.println(response_code);
                if (response_code == 200)
                    return true;
                else {
                    return false;
                }

            }

            catch (Exception e)
            {
                return false;
            }

        }

        public static byte[] pwdencrypt(String password) {

            byte[] pwd = password.getBytes();
            byte[] encodedBytes = Base64.encodeBase64(pwd);
            System.out.println("encodedBytes " + new String(encodedBytes));
            return encodedBytes;

        }

        public static byte[] pwdDecrypt(String password) {
            byte[] pwd = password.getBytes();
            byte[] decodedBytes = Base64.decodeBase64(pwd);
            System.out.println("decodedBytes " + new String(decodedBytes));
            return decodedBytes;
        }
public static void captureScreenShot(WebDriver driver , String ScreenShotName){


            try {
    TakesScreenshot ts = (TakesScreenshot) driver;  // here we are using take screenshot interface and typecasting it
    // because for an interface we cannot create object
    File source = ts.getScreenshotAs(OutputType.FILE);                     // we can take screen shot in base64, bytes, file ....
    // here we are using File type


    FileUtils.copyFile(source, new File("./ScreenShots/"+ScreenShotName+".png"));

    System.out.println("screen shot captured");

                 }

catch(Exception e){

    System.out.println("exception while taking screen shots" + e.getMessage());
}



}

public static void  randomValue()
{
  Random r= new Random();

}


}


