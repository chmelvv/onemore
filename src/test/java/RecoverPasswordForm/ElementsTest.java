package RecoverPasswordForm;


import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {
     Elements elements = new Elements();

     @Test
     public void ElementsFR(){
         Elements elements = new Elements();

         elements
                 .openFR()
                 .getPopinFR()
                 .checkElementsFR();

     }

    @Test
    public void ElementsEN(){
        Elements elements = new Elements();

        elements
                .openEN()
                .getPopinEN()
                .checkElementsEN();

    }

}
