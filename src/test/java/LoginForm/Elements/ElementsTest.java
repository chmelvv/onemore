package LoginForm.Elements;

import Base.BaseTest;
import LoginForm.Elements.Elements;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    Elements elements = new Elements();
    Strings expectedStrings = new Strings();

    @Test
    public void ElementsFR(){
        Elements elements = new Elements();
        Strings expectedStrings = new Strings();
        elements.openFR()
                .openPopin()
                .popinTitleFR(expectedStrings.getPopinTitleFR())
                .PlaceholdersFR(expectedStrings.getNomPlaceholderFR(),expectedStrings.getPasswordPlaceholderFR())
                .recoverPasswordLinkFR(expectedStrings.getRecoverPasswordLinkFR())
                .titleOfSubmitButtonFR(expectedStrings.getButtonTitleFR());
    }

    @Test
    public void ElementsEN(){
        Elements elements = new Elements();
        Strings expectedStrings = new Strings();
        elements.openEN()
                .openPopin()
                .popinTitleEN(expectedStrings.getPopinTitleEN())
                .PlaceholdersEN(expectedStrings.getNomPlaceholderEN(),expectedStrings.getPasswordPlaceholderEN())
                .recoverPasswordLinkEN(expectedStrings.getRecoverPasswordLinkEN())
                .titleOfSubmitButtonEN(expectedStrings.getButtonTitleEN());
    }

}