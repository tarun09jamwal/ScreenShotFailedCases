import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Testt extends ScreenShot
{
    @BeforeTest
    public void TC_1()
    {
        Test1();
    }

    @Test
    public void ScreenSnap1()
    {
        driver.findElement(By.xpath("//input[@class='myClass']"));
    }
    @Test
    public void ScreenSnap2()
    {
        driver.findElement(By.xpath("//input[@id='myId']"));
    }


}
