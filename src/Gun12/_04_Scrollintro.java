package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

public class _04_Scrollintro extends BaseStaticDriver { //sayfayı istediğimiz kadar kaydırmak.
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        //JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");
        // sayfayı sağa x kadar ve aşağı y kadar kaydırır (x,y).
        // bu örnekte 1500 px kadar aşağı kaydıracak.

        Bekle(2);
        js.executeScript("window.scrollBy(0,-1500)");

        BekleKapat();
    }
}
