package Odevler;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _220719_SeleniumXPath extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
    1) Bu siteye gidin. ->  http://demoqa.com/text-box
    2) Full Name kısmına "Automation" girin.
    3) Email kısmına "Testing@gmail.com" girin.
    4) Current Address kısmına "Testing Current Address" girin.
    5) Permanent Address kısmına "Testing Permanent Address" girin.
    6) Submit butonuna tıklayınız.
    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
 */

        driver.get("http://demoqa.com/text-box");

        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");

        WebElement eMail= driver.findElement(By.id("userEmail"));
        eMail.sendKeys("Testing@gmail.com");

        WebElement currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permAddress= driver.findElement(By.id("permanentAddress"));
        permAddress.sendKeys("Testing Permanent Address");

        WebElement submit=driver.findElement(By.className("btn-primary"));
        submit.click();



        BekleKapat();



    }
}
