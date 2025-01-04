package com.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import java.time.Duration;
import org.openqa.selenium.By;

 class SelenideTest {

    @Test
     void testGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        Configuration.browser = "chrome";

        Configuration.timeout = 10000; 
        Configuration.pollingInterval = 500;

        open("https://www.google.com");

        $(By.xpath("//*[@id='APjFqb']")).shouldBe(visible, Duration.ofSeconds(10)).setValue("Selenide").pressEnter();
    }
}
