package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);   //frame 1 e gitti

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().defaultContent();  //anasayfaya e geri geldi

        driver.switchTo().frame(1);    //2. frame e gitti

        WebElement ddMenu= driver.findElement(By.id("animals"));
        Select menu=new Select(ddMenu);
        menu.selectByIndex(menu.getOptions().size() -1);  //son elemanı bulur

        BekleKapat();
    }
}
