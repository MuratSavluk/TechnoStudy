package WebTechnoStudy;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tests extends BaseDriver {
    @Test
    public void Test_Dropdown() {
        driver.get("https://techno.study/tr/");
        WebElement dropDown = driver.findElement(By.className("t228__list_item"));
        System.out.println(dropDown.getText());
        dropDown.click();
        bekleVeKapat();
    }

    @Test
    public void Test_LoginCampus() {
        driver.get("https://techno.study/tr/");
        WebElement campusLogin = driver.findElement(By.linkText("Campus Login"));
        campusLogin.click();
        bekleVeKapat();
    }

    @Test
    public void Test_Apply() {
        driver.get("https://techno.study/tr/");
        WebElement basvuru = driver.findElement(By.className("t228__right_buttons_but"));
        basvuru.click();
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Test Talat");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Test_talat@gmail.com");
        WebElement telfon = driver.findElement(By.name("tildaspec-phone-part[]"));
        telfon.sendKeys("9999999999");
        WebElement contury = driver.findElement(By.name("country"));
        Select conturyList = new Select(contury);
        conturyList.selectByValue("Andorra");
        WebElement course = driver.findElement(By.name("course"));
        Select courseList = new Select(course);
        courseList.selectByIndex(1);
        WebElement survey = driver.findElement(By.name("survey"));
        Select surveyList = new Select(survey);
        surveyList.selectByValue("Youtube");
        WebElement promoCode = driver.findElement(By.name("promo code"));
        promoCode.sendKeys("123");
        WebElement Checkbox = driver.findElement(By.className("t-checkbox__indicator"));
        Checkbox.click();
        WebElement btn = driver.findElement(By.className("t-submit"));
        btn.click();
        WebElement applyText = driver.findElement(By.xpath("(//p[@style='text-align: center;'])[4]"));
        System.out.println(applyText.getText());
        Assert.assertTrue(applyText.isDisplayed());
        bekleVeKapat();
    }

}
