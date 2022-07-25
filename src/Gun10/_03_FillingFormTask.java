package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {
/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement nameBox= driver.findElement(By.id("title"));
        nameBox.sendKeys("sinan");

        WebElement commentBox= driver.findElement(By.id("description"));
        commentBox.sendKeys("merhaba merhaba");

        WebElement submitBtn= driver.findElement(By.id("btn-submit"));
        submitBtn.click();

        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement message=driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!", message.getText());

        BekleKapat();




    }
}
