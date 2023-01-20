import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class CheckPresenceCodeJunit5 {
    @Test
    void SuccessfulFindCodeJunit5() {
        //- Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //- Перейдите в раздел Wiki проекта
        $("[data-tab-item=\"i5wiki-tab\"]").click();
        //- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
