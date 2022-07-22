package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon= aksiyonlar
                .moveToElement(element)     //kutucuga gittim
                .click()                    //içine tıklattım
                .keyDown(Keys.SHIFT)        //SHIFT tusuna bastım
                .sendKeys("s")              //kucuk a harfini gonderdim. fakat SHIFT basılı oldugu icin A gorulmeli
                .keyUp(Keys.SHIFT)          //SHIFT tusundan elimizi kaldırdık
                .sendKeys("inan")
                .build();

        //Bekle(2);
        aksiyon.perform();

        Bekle(3);

        BekleKapat();




    }
}
