package setUp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class SetUp {
    WebDriver driver;
    @Before
    public void setup() {
        driver = DriverFactory.initDriver();
    }
    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
