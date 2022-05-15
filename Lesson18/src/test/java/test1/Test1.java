package test1;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Collection;

import static com.codeborne.selenide.Selenide.*;

public class Test1 {
    @Test
    void test() {
        open("https://www.google.ru/");
        $("[class=\"gLFyf gsfi\"]")
                .shouldBe(Condition.visible)
                .setValue("performance lab")
                .pressEnter();

        //$("[class=\"main\"]").shouldHave(Condition.href("https://www.performance-lab.ru"));
        //$("[class=\"eqAnXb\"]").shouldHave(Condition.href("https://www.performance-lab.ru"));
        //Assertions.assertTrue($("[class=\"eqAnXb\"]").getSelectedOptions().contains("https://www.performance-lab.ru"));
        //$("[class=\"yuRUbf\"]").shouldHave(Condition.href("https://www.performance-lab.ru"));
        //$(By.linkText("https://www.performance-lab.ru")).shouldBe(Condition.visible).click();
        //$(By.tagName("a")).shouldHave(Condition.href("https://www.performance-lab.ru"));
    }
}
