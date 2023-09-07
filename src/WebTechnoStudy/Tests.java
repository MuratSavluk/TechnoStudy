package WebTechnoStudy;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tests extends BaseDriver {
    @Test
    public void Test_Dropdown(){
        driver.get("https://techno.study/tr/");
        WebElement dropDown = driver.findElement(By.className("t228__list_item"));
        System.out.println(dropDown.getText());
        dropDown.click();
        bekleVeKapat();
    }

}
