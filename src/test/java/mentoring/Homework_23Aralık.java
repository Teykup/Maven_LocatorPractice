package mentoring;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class Homework_23Aralık extends BaseTest {

    @Test
    public void test (){
        // Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Login with Username: Admin
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // Login with Password: admin123
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // Click login button
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        // Click on PIM
        WebElement PIM = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        PIM.click();

        // Click on Employee List
        WebElement EmpşoyeeList = driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]"));
        EmpşoyeeList.click();

        // Employee Name -> Use Faker Class
        Faker faker = new Faker();
        WebElement name = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
        name.sendKeys(faker.name().name());

        // ID -> Use Faker Class
        WebElement id = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        id.sendKeys(faker.number().digits(9));

        // Employment Status -> select by index: 2

        // Include -> selectByVisibleText: Current and Past Employees
        // Supervisor Name -> Use Faker Class
        // Job Title ->selectByValue: IT Manager
        // Sub Unit ->selectByValue: 3
        // Click search button
        // Verify text visible : "No Records Found"

        /*


        //    ID -> Use Faker Class


        //    Employment Status -> select by index: 2
        Actions actions = new Actions(driver);
        WebElement employestat = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
        actions.click(employestat).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        //    Include -> selectByVisibleText: Current and Past Employees
        WebElement include = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
        actions.click(include).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        //    Supervisor Name -> Use Faker Class
        WebElement supervisorname = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]"));

        //    Job Title ->selectByValue: IT Manager
        WebElement jobtitle = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]"));
        actions.click(jobtitle).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        //    Sub Unit ->selectByValue: 3
        WebElement subunit = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[4]"));
        actions.click(subunit).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        //Click search button
        WebElement submitbutton = driver.findElement(By.xpath("(//button[@type='submit'])"));
        submitbutton.click();

        //Verify text visible : "No Records Found"
        WebElement norecord = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]"));
        Assert.assertEquals("No Records Found", norecord.getText());
 */

    }

}
