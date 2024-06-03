package session2;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test2 {

    public static String remote_url = "http://localhost:4444";

    @Test
    public void test() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        URL url = new URL(remote_url);
        RemoteWebDriver driver = new RemoteWebDriver(url, options);
        System.out.println("Browser Started : Chrome2");

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Chrome2"+driver.getTitle());
        driver.quit();
        }
}
