package page;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.*;


public class FindElementPageGitHub {


    @Test
    public void findCodeJunit() {
        step("Переходим на страницу GitHub", () -> {
            open("https://github.com/");
        });

        step("Устанавливаем в поле Selenide нажимаем отправить", () -> {
            $("input[name='q']").setValue("selenide").submit();
        });

        step("Перехожим по ссылке Selenide", () -> {
            $(linkText("selenide/selenide")).click();
        });

        step("Переходим по Wiki", () -> {
            $("#wiki-tab").click();
        });

        step("Из за маленького экрана нажимаем показать ссылки", () -> {
            $x("//button[contains(text(),'Show 2 more pages…')]").click();
        });

        step("Проверяем текст", () -> {
            $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        });
        // $x("//a[@href=\"/selenide/selenide\"]").click();

        step("Переходим по ссылке SoftAssertions", () -> {
            $x("//a[contains(text(),\"SoftAssertions\")]").click();
        });
        step("Проверка что код есть", () -> {
            $("div.markdown").$$("h4").findBy(text("Using JUnit5 extend test class"));
            $x("//div[@class=\"highlight highlight-source-java notranslate position-relative overflow-auto\"]/parent::div").shouldBe(visible);
        });
    }
}
