package mentoring;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.awt.print.Book;

public class Homework_22Aralık extends BaseTest {

/*
1. https://www.amazon.com/ adresine gidin.
2.  Assertion kullanarak Amazon web sitesine gittiğinizi doğrulayın.
3. Kategori DropDown'dan Books kategorisini seçin ve arama kutusuna "Selenium" yazdırıp aratın.
4. Çıkan kitaplardan 2. ve 5. kitabın isminde "Selenium" kelimesinin geçtiğini doğrulayın.
5. Çıkan sonuç sayısının 500'den büyük olduğunu doğrulayın.
 */

    @Test
    public void Homework_22Aralık () {

        driver.get("https://www.amazon.com/"); // 1

        Assert.assertTrue(driver.getTitle().contains("Amazon")); // 2

       // Kategori DropDown'dan Books kategorisini seçin
        WebElement kategori = driver.findElement(By.id("searchDropdownBox")); // 3 A
        //Select;

        WebElement search = driver.findElement(By.id("twotabsearchtextbox")); // 3 B
        search.sendKeys("Selenium" + Keys.ENTER);

        WebElement kitap2 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base a-text-normal'])[2]")); // 2, kitap
        Assert.assertTrue(kitap2.getText().contains("Selenium"));

        WebElement kitap5 = driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base a-text-normal'])[5]")); // 5, kitap
        Assert.assertTrue(kitap5.getText().contains("Selenium"));

       // Çıkan sonuç sayısının 500'den büyük olduğunu doğrulayın.

    }
}
