package session2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Setup_DockerGrid {

    @BeforeTest
    void startDockerGrid() throws InterruptedException, IOException {
        Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat"); //start_dockergrid.bat is in same project no need to give path
        Thread.sleep(20000);
    }

    @AfterTest
    void stopDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat"); //stop_dockergrid.bat is in same project no need to give all path
        Thread.sleep(10000);
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); // closes all command prompts
    }
}
