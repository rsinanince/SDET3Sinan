package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _03_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();    //Ekranı tam hale getirir.
        //Bekle(3);

        //Ekranı yeni ölçülere göre set etmek
        Dimension dim=new Dimension(516, 600);
        driver.manage().window().setSize(dim);

        BekleKapat();
    }
}
