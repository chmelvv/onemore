package NewsletterForm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Homepage {

    SelenideElement ConfirmationMessage = $(".messages");

    public void checkConfirmMessageFR(String expMessage){
        ConfirmationMessage.shouldHave(Condition.text(expMessage));

    }

    public void checkConfirmMessageEN(String expMessage){
        ConfirmationMessage.shouldHave(Condition.text(expMessage));

    }
}
