import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import java.io.File;

public class ScreenShot {
    WebDriver driver;
    public void Test1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }
    @AfterMethod
    public void screenShot(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            try{
                TakesScreenshot screenshot=(TakesScreenshot)driver;
                File src=screenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File("C:\\Users\\TarunJamwal\\IdeaProjects\\ScreenShotFailedTestCasesInTestNG\\ScreenShot\\"+result.getName()+".png"));
                System.out.println("Successfully captured a screenshot");
            }catch (Exception e){
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }
    }
}
