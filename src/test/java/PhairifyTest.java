import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PhairifyTest {

    @Test
    @Order(0)
    void negativeusersTest() {
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
    @Order(1)
    void positiveusersTest() {
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

    @Test
    @Order(2)
    void fullemailusersTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__42']")
                .setValue("jsammis@gorges.us")
                .shouldBe(Condition.value(""));

        $("input[id*='__BVID__44']")
                .setValue("").pressEnter();

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='invalid-feedback d-block']")
                .shouldHave(Condition.text("This field is required"));

        closeWindow();
    }

    @Test
    @Order(3)
    void fullpassusersTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__42']")
                .setValue("")
                .shouldBe(Condition.value(""));

        $("input[id*='__BVID__44']")
                .setValue("123456").pressEnter();

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='invalid-feedback d-block']")
                .shouldHave(Condition.text("This field is required"));

        closeWindow();
    }

    @Test
    @Order(4)
    void fullusersTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__42']")
                .setValue("")
                .shouldBe(Condition.value(""));

        $("input[id*='__BVID__44']")
                .setValue("").pressEnter();

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='invalid-feedback d-block']")
                .shouldHave(Condition.text("This field is required"));

        closeWindow();
    }

    @Test
    @Order(5)
    void forgotpassusersTest() {
        open("https://dev.phairify.com/#/login");

        $("button[class='btn btn-v2_link']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='font_size_1000rem font_weight_bold v3_color_black_knight']")
                .shouldHave(Condition.text("Forgot Password"));

        closeWindow();
    }

    @Test
    @Order(6)
    void negativemembTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__56']")
                .setValue("tn7210@byom.de")
                .shouldBe(Condition.value("tn7210@byom.de"));

        $("input[id*='__BVID__58']")
                .setValue("brYIj6CHltonzTW5JuJ03B3S1MKguCu").pressEnter();

        $x("//div[@class='toasted primary error']")
                .shouldHave(Condition.text("Your token is not valid. Click ‘Need a Token?’ to get a new token now."));

        closeWindow();
    }


    @Test
    @Order(7)
    void positivemembTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__56']")
                .setValue("tn7210@byom.de")
                .shouldBe(Condition.value("tn7210@byom.de"));

        $("input[id*='__BVID__58']")
                .setValue("brYIj6CHltonzTW5JuJ03B3S1MKguCuv").pressEnter();

        $x("//div[@class='d-flex align-items-center col-8']")
                .shouldHave(Condition.text("Activate Your Account"));

        closeWindow();
    }

    @Test
    @Order(8)
    void fullemailmembTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__56']")
                .setValue("tn7210@byom.de")
                .shouldBe(Condition.value("tn7210@byom.de"));

        $("input[id*='__BVID__58']")
                .setValue("").pressEnter();

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='invalid-feedback d-block']")
                .shouldHave(Condition.text("This field is required"));

        closeWindow();
    }

    @Test
    @Order(9)
    void fullpassmembTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__56']")
                .setValue("")
                .shouldBe(Condition.value(""));

        $("input[id*='__BVID__58']")
                .setValue("brYIj6CHltonzTW5JuJ03B3S1MKguCuv").pressEnter();

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='invalid-feedback d-block']")
                .shouldHave(Condition.text("This field is required"));

        closeWindow();
    }


    @Test
    @Order(10)
    void fullmembTest() {
        open("https://dev.phairify.com/#/login");

        $("input[id*='__BVID__56']")
                .setValue("")
                .shouldBe(Condition.value(""));

        $("input[id*='__BVID__58']")
                .setValue("").pressEnter();

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='invalid-feedback d-block']")
                .shouldHave(Condition.text("This field is required"));

        closeWindow();

    }


    @Test
    @Order(11)
    void physicianTest() {
        open("https://dev.phairify.com/#/who-are-you");

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='font_Montserrat font_size_1000rem']")
                .shouldHave(Condition.text("WELCOME"));


        closeWindow();
    }

    @Test
    @Order(12)
    void signInTest() {
        open("https://dev.phairify.com/#/registration");

        $("button[class='btn btn-v3_teal_outline']")
                .shouldBe(Condition.visible)
                .click();

        $x("//div[@class='v2_bg_white']")
                .shouldHave(Condition.text("WELCOME"));


        closeWindow();
    }


}














        



