package NewsletterForm;

import NewsletterForm.Elements;
import org.testng.annotations.Test;

public class ElementsOfFormTest extends BaseTest {
    Elements elements = new Elements();

    @Test
    public void checkENelemntsFR(){
        elements
                .openFR()
                .TitleFR()
                .DescriptionFR()
                .TitlesOfFieldsFR()
                .TitleOFbuttonFR();
    }

    @Test
    public void checkENelemntsEN(){
        elements
                .openEN()
                .TitleEN()
                .DescriptionEN()
                .TitlesOfFieldsEN()
                .TitleOFbuttonEN();
    }





}


