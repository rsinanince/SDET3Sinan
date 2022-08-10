package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId= driver.getWindowHandle();  //bulunduğun sayfanın win id sini verir

        List<WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }

        Set<String> windowsIdler = driver.getWindowHandles();  //açık olan tüm sayfaların win id lerini verir

        for (String id: windowsIdler) {
            if (id.equals(anaSayfaWindowId)) continue;   //anasayfa değilse

            System.out.println("id = " + id);     //her sayfanın id sini yazdırdık
            driver.switchTo().window(id);
            System.out.println(id + " - Title = " + driver.getTitle());   //her sayfanın title ını yazdırdık
        }

        Bekle(3);
        BekleKapat();
    }
}
