package tek.tdd.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *  read config file
 *  open browser
 *  quit browser
 *  encapsulate instance of WebDriver
 */
public abstract class BaseSetup {
    private static final Logger LOGGER = LogManager.getLogger(BaseSetup.class);
    private static WebDriver driver;
    private  final Properties properties;
    protected static final int WAIT_TIME_IN_SECONDS = 25;
    public BaseSetup(){
        //Reading Config Files and Loading to properties
        String configFilePath = System.getProperty("user.dir")
                + "/src/test/resources/configs/dev-config.properties";
        try {
            LOGGER.debug("Reading Config file from path {}", configFilePath);
            InputStream inputStream = new FileInputStream(configFilePath);
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException ioException) {
            LOGGER.error("Config file error with message {}", ioException.getMessage());
            throw new RuntimeException("Config file error with message" + ioException.getMessage());
        }
    }
    public void setupBrowser(){

    }
}
