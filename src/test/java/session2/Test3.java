package session2;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test3 {

    public static String remote_url = "http://localhost:4444";

    @Test
    public void test() throws MalformedURLException {
        FirefoxOptions options = new FirefoxOptions();
        URL url = new URL(remote_url);
        RemoteWebDriver driver = new RemoteWebDriver(url, options);
        System.out.println("Browser Started : Firefox");

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Firefox"+driver.getTitle());
        driver.quit();
        }
}
