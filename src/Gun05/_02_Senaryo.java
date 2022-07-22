package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Senaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        Bekle(2);

        WebElement business=driver.findElement(By.cssSelector("[placeholder=Full Name]"));

        business.click();

        Bekle(2);



        BekleKapat();
    }
}
