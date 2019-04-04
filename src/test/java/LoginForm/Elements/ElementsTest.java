package LoginForm.Elements;

import LoginForm.Elements.Elements;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    Elements elements = new Elements();

    @Test
    public void ElementsFR(){
        Elements elements = new Elements();
        elements.openFR()
                .openPopin()
                .popinTitleFR()
                .PlaceholdersFR()
                .recoverPasswordLinkFR()
                .titleOfSubmitButtonFR();
    }

    @Test
    public void ElementsEN(){
        Elements elements = new Elements();
        elements.openEN()
                .openPopin()
                .popinTitleEN()
                .PlaceholdersEN()
                .recoverPasswordLinkEN()
                .titleOfSubmitButtonEN();
    }

}