package session1;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWithFirefox {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public static String remote_url = "http://localhost:3333";

    public static void main(String[] args) throws MalformedURLException {
        FirefoxOptions options = new FirefoxOptions();
        RemoteWebDriver driver = new RemoteWebDriver(new URL(remote_url), options);
        System.out.println("Browser Started : Test3");

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println(driver.getTitle());
        driver.quit();
    }

}
