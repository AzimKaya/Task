package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){
        String browser=ConfigReader.getProperty("browser");
        if (driver==null){
            switch (browser){
                case "edge":
                  // WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                default:
                  // WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                   // Base.initialize();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
    public static void quitDriver(){
        driver.quit();
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
    public static void closeDriver(){
        driver.close();
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
}