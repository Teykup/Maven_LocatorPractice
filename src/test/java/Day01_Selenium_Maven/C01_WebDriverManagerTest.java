package Day01_Selenium_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {

        // Set Path.
        // Create chrome driver.
        // Maximize the window.
        // Open google home page https://www.google.com/
        // Verify that you are Google in the title.


    public static void main(String[] args) {


        //Webdriver Manager classini kullanarak chromedriver binary lerimizi indirdik
        WebDriverManager.chromedriver().setup();

        //Driver objemizi olusturduk
        WebDriver driver = new ChromeDriver();

        //window u maximize ettik
        driver.manage().window().maximize();

        //google anasayfamizi actik
        driver.get("https://www.google.com/");

        //title imizi aldik
        String title = driver.getTitle();

        //title imizi dogruladik
        if (title.equals("Google")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //driver imizi kapattik
        driver.quit();


    }


}