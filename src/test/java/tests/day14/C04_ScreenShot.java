package tests.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;

public class C04_ScreenShot extends TestBase {
    @Test
    public void screeenTest(){
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        //1.adim ==>screenshot almak icin obje olusturalim ve deger olark driverimzi atayalim
        // deger olarak driver i kabul etmesi icn casting yapmamaiz gerekeblr

        TakesScreenshot tss=(TakesScreenshot) driver;
        //2.adim==>tum sayfanin secrenshot ni almak icn bir file olusturalim
        // dosya yolunu belirtelim
        File tumSayfaSS=new File("src//tumSayfa.png");
        //3.adim==>olusturdugumuz file ile takescreenshot objesini iliskilendirelim
        tumSayfaSS=tss.getScreenshotAs(OutputType.FILE);
     //Eger spesifik bir webelementin screenshot ini almak istiyorsasniz

        WebElement logoElementi=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File logoResmi=new File("src/logo/");

    }
}
