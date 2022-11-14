package guru.qa.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

public class F1NewsPage {


    private final SelenideElement titleLogo = $(".b-logo__img"), widgetVoting = $(".voting"),
            submitButton = $("#pollbtn"), itemSlider = $(".forecasts_contest_item_slider");

    public F1NewsPage openPage() {

        open("/");
        titleLogo.shouldBe(visible);
        widgetVoting.scrollIntoView(true);

        return this;
    }

    public F1NewsPage setWidgetVote(String value) {

        widgetVoting.$(byText(value)).click();

        return this;
    }

    public F1NewsPage submitButtonClick() {

        submitButton.click();
        return this;
    }

    public F1NewsPage checkVisibleSlider() {

        itemSlider.shouldBe(visible);
        return this;
    }
}