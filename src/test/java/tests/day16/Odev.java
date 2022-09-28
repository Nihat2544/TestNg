package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class Odev extends TestBaseBeforeMethodAfterMethod {
    /*
    1) Bir class oluşturun: YoutubeAssertions
2) https://www.youtube.com adresine gidin
3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
     */

    @Test (priority = 1)
    public void YoutubeAssertionsTest() {
        //https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com ");
    }

    @Test (priority = 2)
    public void TitleTest() {
        // ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test (priority = 3)
    public void ImageTest() {
        // ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        driver.findElement(By.xpath("(//*[@id='logo-icon'])[1]")).isDisplayed();
    }

    @Test (priority = 4)
    public void SearchTest() {

    //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement search = driver.findElement(By.xpath("(//*[@id='search'])[1]"));
        Assert.assertTrue(search.isEnabled());
    }

    @Test (priority = 5)
    public void wrongTitleTest(){
        //Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertFalse(driver.getTitle().contains("youtube"));
    }
}
