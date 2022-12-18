package start;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SettingsForStart {


    @BeforeAll
    static void setup() {

        Configuration.baseUrl = "https://github.com/";
        Configuration.headless = true;
    }



}
