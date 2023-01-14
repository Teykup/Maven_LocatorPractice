package Day05_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class C05_Checkboxes {



    //Go to url: https://demoqa.com/
    //Click Elemnts
    //Click Checkbox
    //Verify if Home checkbox is selected
    //Verify that "you have selected" is visible.


    WebDriver driver;
    @Before
    public void setup() {
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();

    }
    @Test
    public void Verify(){
        driver.get("https://demoqa.com/");
        driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@class='rct-title']")).click();
        Assert.assertTrue(driver.findElement(By.id("tree-node-home")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("You have selected"));



    }
}