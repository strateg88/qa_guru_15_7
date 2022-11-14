package guru.qa.pages;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

    public class MemuarPage {

        private static final String REG_FORM_URL = "/memuar/";

        private final static String TITLE_TEXT = "Статьи";

        private final SelenideElement postTitle = $(".post_title");

        public MemuarPage openPage() {

            open(REG_FORM_URL);
            postTitle.shouldHave(text(TITLE_TEXT));

            return this;
        }

        public MemuarPage yearSelect(int year) {

            $(byTagAndText("a", String.valueOf(year))).click();
            return this;
        }

        public MemuarPage checkTitle(String titleText) {

            postTitle.shouldHave(text(titleText));
            return this;
        }

    }
