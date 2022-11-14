package guru.qa;

import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;


public class BaseF1NewsTest {

    @BeforeAll
    static void setUp() {

        Configuration.baseUrl = "https://www.f1news.ru";
        //        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

}