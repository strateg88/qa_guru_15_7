package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

public class TeamDriversPage {

    private static final String DRIVERS_URL = "/Championship/2022/drivers.shtml";

    private final static String TITLE_TEXT = "Сезон 2022: Составы команд";

    private final SelenideElement postTitle = $(".post_title"), content = $(".post_content");

    public TeamDriversPage openPage() {

        open(DRIVERS_URL);
        postTitle.shouldHave(text(TITLE_TEXT));

        return this;
    }

    public TeamDriversPage checkTeamName(String team) {

        content.shouldHave(text(team));
        return this;
    }

}
