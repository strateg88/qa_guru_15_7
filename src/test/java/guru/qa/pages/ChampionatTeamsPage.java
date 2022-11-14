package guru.qa.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

public class ChampionatTeamsPage {

    private static final String CHAMP_DRIVERS_URL = "/auto/_f1/tournament/689/teams/";


    private final static String TITLE_TEXT = "Формула-1 2022";

    private final SelenideElement titleName = $(".entity-header__title-name"),
            driversButton = $("[title=Спортсмены]");

    public ChampionatTeamsPage openPage() {

        open(CHAMP_DRIVERS_URL);
        titleName.shouldHave(text(TITLE_TEXT));

        return this;
    }

    public ChampionatTeamsPage clickOnTeamItem(String teamName) {

        $$(".teams-item__name").findBy(text(teamName)).click();
        return this;
    }

    public ChampionatTeamsPage clickOnButtonDrivers() {

        driversButton.click();
        return this;
    }

    public ChampionatTeamsPage checkTitle(String titleText) {

        titleName.shouldHave(text(titleText));
        return this;
    }

    public ChampionatTeamsPage checkDriversInTable(int countDrivers) {

        int countRowTable = countDrivers + 1;
        $$(".table-responsive__row").shouldHave(CollectionCondition.size(countRowTable));
        return this;
    }
}
