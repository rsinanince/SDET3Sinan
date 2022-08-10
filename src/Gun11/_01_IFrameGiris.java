package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); //frame1 e geçtik
                                          // daha hızlı olduğu için index tipindeki frame i kullanıyoruz.

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame();  //geldiği son yere geri döndürür. 2 basamak geri için 2 kez yazılır.
        driver.switchTo().defaultContent(); //ilk anasayfaya direk geri döndürür

        //anasayfa içindeki frame lerin indexi 0, 1, 2,.. diye numaralanır.
        //buradan girilen her frame in içindeki frame lerin indexi de kendi içlerinde 0, 1, 2,... diye numaralanır.

//        frame 0
//                >subframe 0
//                >subframe 1
//        frame 1
//                >subframe 0
//                >subframe 1




        BekleKapat();
    }
}
