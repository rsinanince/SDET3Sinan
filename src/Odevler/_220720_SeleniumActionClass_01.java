package Odevler;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

public class _220720_SeleniumActionClass_01 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        WebElement hanoi= driver.findElement(By.id("a15"));
        WebElement vietnamFrame = driver.findElement(By.cssSelector("q15~destinationBox"));


        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.dragAndDrop(hanoi, vietnamFrame).build();
        aksiyon.perform();

        Bekle(2);
        BekleKapat();


    }
}
