package ru.jiehk;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitlabTest {
    @Test
    void enterprisePageLoadTest() {
        open("https://github.com/");
        $$(".HeaderMenu-link").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $("div.enterprise-hero h1").shouldHave(text("Build like the best"));
    }
}
