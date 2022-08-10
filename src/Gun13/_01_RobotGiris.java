package Gun13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/*
     İnterview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");

//        driver.switchTo().frame(8);    accept all sorusu çıkarsa kullanmak gerekebilir
//        driver.switchTo().defaultContent();

        Robot rbt=new Robot();

        for(int i=0;i<13;i++) {     //  tab a 13 kez basmak için
            rbt.keyPress(KeyEvent.VK_TAB); //tuşa basıldı - down. basılı duruyor.
            rbt.keyRelease((KeyEvent.VK_TAB));  //tuş bırakıldı - up
            //Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\rsina\\Desktop\\ornek1.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.


        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);   //bu iki tuş şuanda basılmış vaziyette, hafızadaki yapıştırıldı

        //Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);   //tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        for (int i=0; i<2; i++) {           //2 kere tab ile OPEN butonuna ulaştık
            rbt.keyPress((KeyEvent.VK_TAB));    //tuşa basıldı down
            rbt.keyRelease(KeyEvent.VK_TAB);    //tuş bırakıldı up
        }

        rbt.keyPress(KeyEvent.VK_ENTER);    //tuşa basıldı down  //ENTER bastık açılan pencere kapandı
        rbt.keyRelease(KeyEvent.VK_ENTER);   //tuş bırakıldı

        WebElement submitbutton = driver.findElement(By.id("submitbutton"));  //submit butonuna bastık
        submitbutton.click();

        WebElement asser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(asser.getText().contains("has been successfully uploaded."));


        //Bekle(3);
        BekleKapat();

    }
}
