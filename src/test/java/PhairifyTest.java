import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PhairifyTest {
    @Test
    void negativeTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__42']")
                .setValue("jsammis@gorges.us")
                .shouldBe(Condition.value("jsammis@gorges.us"));

        $("input[id*='__BVID__44']")
                .setValue("123457").pressEnter();

        $x("//div[@class='toasted primary error']")
                .shouldHave(Condition.text("Invalid email or password"));

        closeWindow();
    }

    @Test
    void positiveTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__42']")
                .setValue("jsammis@gorges.us")
                .shouldBe(Condition.value("jsammis@gorges.us"));

        $("input[id*='__BVID__44']")
                .setValue("123456").pressEnter();

        $x("//div[@class='alert alert-warning']")
                .shouldHave(Condition.text("Select a society to view more information"));

        closeWindow();
    }
}














        



