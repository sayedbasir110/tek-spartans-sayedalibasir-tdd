package tek.tdd.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowser implements BaseBrowser {
    @Override
    public WebDriver openBrowser (boolean isHeadless){
        EdgeOptions options = new EdgeOptions();
        if (isHeadless) options.addArguments("--headless");
        return new EdgeDriver(options);
    }
}
