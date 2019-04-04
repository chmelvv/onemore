package NewsletterForm;

import NewsletterForm.Elements;
import org.testng.annotations.Test;

public class ElementsOfFormTest extends BaseTest {
    Elements elements = new Elements();

    @Test
    public void checkENelemntsFR(){
        Elements elements = new Elements();
        elements
                .openFR()
                .TitleFR()
                .DescriptionFR()
                .TitlesOfFieldsFR()
                .TitleOFbuttonFR();
    }

    @Test
    public void checkENelemntsEN(){
        Elements elements = new Elements();
        elements
                .openEN()
                .TitleEN()
                .DescriptionEN()
                .TitlesOfFieldsEN()
                .TitleOFbuttonEN();
    }





}


