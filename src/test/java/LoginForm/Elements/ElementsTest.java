package LoginForm.Elements;

import LoginForm.Elements.Elements;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    Elements elements = new Elements();

    @Test
    public void ElementsFR(){
        elements.openFR()
                .openPopin()
                .popinTitleFR()
                .PlaceholdersFR()
                .recoverPasswordLinkFR()
                .titleOfSubmitButtonFR();
    }

    @Test
    public void ElementsEN(){
        elements.openEN()
                .openPopin()
                .popinTitleEN()
                .PlaceholdersEN()
                .recoverPasswordLinkEN()
                .titleOfSubmitButtonEN();
    }

}