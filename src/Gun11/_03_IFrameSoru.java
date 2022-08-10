package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);   //0 index li frame e geçtik
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);     //0 index li frame in içindeki 0 index li frame e geçtik
        WebElement checkBox= driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();   //ana frame e geri geldik

        driver.switchTo().frame(1);   //1 index li frame e geçtik

        WebElement ddMenu= driver.findElement(By.id("animals"));
        Select menu=new Select(ddMenu);
        menu.selectByIndex(3);  //son elemanı bulur

        BekleKapat();


    }
}
