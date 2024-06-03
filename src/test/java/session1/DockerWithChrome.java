package session1;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWithChrome {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public static String remote_url = "http://localhost:4444";

    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        RemoteWebDriver driver = new RemoteWebDriver(new URL(remote_url), options);
        System.out.println("Browser Started : Chrome");

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println(driver.getTitle());
        driver.quit();
    }

}
