package session2;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test4 {

    public static String remote_url = "http://localhost:4444";

    @Test
    public void test() throws MalformedURLException {
        EdgeOptions options = new EdgeOptions();
        URL url = new URL(remote_url);
        RemoteWebDriver driver = new RemoteWebDriver(url, options);
        System.out.println("Browser Started : Edge");

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Edge"+driver.getTitle());
        driver.quit();
        }
}
