package RecoverPasswordForm.ElementsT;


import Base.BaseTest;
import RecoverPasswordForm.Elements;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {
     Elements elements = new Elements();
     Strings strings = new Strings();

     @Test
     public void ElementsFR(){
         Elements elements = new Elements();
         Strings strings = new Strings();

         elements
                 .openFR()
                 .getPopinFR()
                 .checkElementsFR(strings.getPopinTitleFR(),strings.getEmailFieldlaceholderFR(),strings.getDescriptionFR(),strings.getButtonTitleFR());

     }

    @Test
    public void ElementsEN(){
        Elements elements = new Elements();
        Strings strings = new Strings();

        elements
                .openEN()
                .getPopinEN()
                .checkElementsEN(strings.getPopinTitleEN(),strings.getEmailFieldlaceholderEN(),strings.getDescriptionEN(),strings.getButtonTitleEN());

    }

}
