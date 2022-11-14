package guru.qa;


import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;

public class BaseChampionatTest {
    @BeforeAll
    static void setUp() {

        Configuration.baseUrl = "https://www.championat.com";
//        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

}