package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        clickMe2.click();

        Bekle(2);
        driver.switchTo().alert().dismiss();   //Alert kutucuğuna geçildi ve CANCEL butonuna basıldı
        Bekle(2);

        BekleKapat();



    }
}
