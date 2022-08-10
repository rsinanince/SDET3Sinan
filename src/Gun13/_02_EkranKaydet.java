package Gun13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("sinan");

        WebElement passWord= driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("gkhcj");

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        List<WebElement> spanMessage = driver.findElements(By.id("spanMessage"));
        if (spanMessage.size()>0) { //login olamadın hata ekran görüntüsünü saklayalım

            System.out.println("Login olamadı, çünkü hata mesajı gözüktü");

            //1. Aşama: ekran görüntüsü alma değişkeni tanımlandı
            TakesScreenshot ts=(TakesScreenshot) driver;

            //2. Aşama: saklama tipi seçildi (Dosya seçtik), data (veritanabı-Byte)
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);    //şu anda hafızada beklemede

            //3. Aşama: hafızadaki halini alıp dosya türünü (jpg,png,bmp) seçerek kaydedeceğiz.
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri/LoginKontrol.png"));

            BekleKapat();
        }
            //TODO : ödev buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
    }
}
