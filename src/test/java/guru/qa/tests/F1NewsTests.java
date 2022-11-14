package guru.qa.tests;
import static com.codeborne.selenide.Selenide.$;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import guru.qa.BaseF1NewsTest;
import guru.qa.enums.Team;
import guru.qa.pages.MemuarPage;
import guru.qa.pages.F1NewsPage;
import guru.qa.pages.TeamDriversPage;

public class F1NewsTests extends BaseF1NewsTest {

    F1NewsPage f1NewsPage = new F1NewsPage();

    MemuarPage memuarPage = new MemuarPage();

    TeamDriversPage teamDriversPage = new TeamDriversPage();

    @ValueSource(strings = { "Нет, отставание уже слишком велико", "В Формуле 1 всё возможно",
            "Нет, для этого должно произойти что-то невероятное" })
    @ParameterizedTest(name = "Проверка выбора ответа {0} в опросе про лидерство")
    void checkVotingWidgetTest(String variant) {

        f1NewsPage.openPage().setWidgetVote(variant).submitButtonClick().checkVisibleSlider();
    }

    @CsvSource(value = { "2015, Статьи 2015", "2013, Статьи 2013" })
    @ParameterizedTest(name = "Проверка заголовка {1} страницы статей {0} года")
    void checkTitleInChampionshipYearTest(int year, String title) {

        memuarPage.openPage().yearSelect(year).checkTitle(title);
    }

    @EnumSource(Team.class)
    @ParameterizedTest(name = "Проверка команды {0} в списке")
    void checkTeamsTest(Team team) {
        teamDriversPage.openPage().checkTeamName(team.getName());
    }



}