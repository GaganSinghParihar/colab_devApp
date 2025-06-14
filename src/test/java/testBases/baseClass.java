package testBases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class baseClass {

    public static WebDriver driver;
    public Logger logger;
    public Properties p;

    @BeforeClass
    @Parameters({"os", "browser"})
    public void setup(@Optional("windows") String os,
                      @Optional("chrome") String browser,
                      ITestContext context) throws IOException {

        // Load config
        p = new Properties();
        try (FileReader file = new FileReader(System.getProperty("user.dir") + "/src/test/resources/config.properties")) {
            p.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties: " + e.getMessage());
        }

        logger = LogManager.getLogger(this.getClass());
        String execEnv = p.getProperty("execution_env", "local").toLowerCase();

        if (execEnv.equals("remote")) {
            // Docker/Selenium Grid Setup
            try {
                URL gridUrl = new URL("http://localhost:4444/wd/hub");

                switch (browser.toLowerCase()) {
                    case "chrome":
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.setPlatformName(os);
                        chromeOptions.setBrowserVersion("137.0"); // Match with Grid
                        driver = new RemoteWebDriver(gridUrl, chromeOptions);
                        break;

                    case "firefox":
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        firefoxOptions.setPlatformName(os);
                        firefoxOptions.setBrowserVersion("139.0");
                        driver = new RemoteWebDriver(gridUrl, firefoxOptions);
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid browser for remote execution: " + browser);
                }

                System.out.println("Remote session started with session ID: " + ((RemoteWebDriver) driver).getSessionId());

            } catch (Exception e) {
                throw new RuntimeException("Remote driver setup failed: " + e.getMessage());
            }

        } else {
            // Local Execution Setup
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser for local execution: " + browser);
            }
        }

        // Common Setup
        context.setAttribute("driver", driver);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("stagingUrl"));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String captureScreen(String tname) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String targetFilePath = System.getProperty("user.dir") + "/screenshots/" + tname + "_" + timeStamp + ".png";
        File targetFile = new File(targetFilePath);
        sourceFile.renameTo(targetFile);
        return targetFilePath;
    }
}
