package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBaseBeforeClassAfterClass {
        protected static WebDriver driver;
        //@BeforeClass ve @AfterClass notasyonlarini TestNG de kullanirken Junit'teki gibi static yapmaya gerek yoktur.

        @BeforeClass
        public  void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            // driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        @AfterClass
        public  void tearDown() {

            //driver.quit();
        }
    }

