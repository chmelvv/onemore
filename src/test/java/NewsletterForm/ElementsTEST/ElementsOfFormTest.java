package NewsletterForm.ElementsTEST;

import Base.BaseTest;
import NewsletterForm.Elements;
import org.testng.annotations.Test;

public class ElementsOfFormTest extends BaseTest {
    Elements elements = new Elements();
    Strings strings = new Strings();

    @Test
    public void checkENelemntsFR(){
        Elements elements = new Elements();
        elements
                .openFR()
                .TitleFR(strings.getTitleFR())
                .DescriptionFR(strings.getDescriptionFR())
                .TitlesOfFieldsFR(strings.getNomlFieldFR(),strings.getPrenomFieldFR(),strings.getEmailFieldFR(),
                        strings.getSecteurFieldFR(),strings.getSociétéFieldFR(),strings.getTelFieldFR(),
                        strings.getAdresseFieldFR(),strings.getVilleFieldFR(),strings.getCodePostalFieldFR(),strings.getPaysFieldFR(),strings.getCheckboxFR())
                .TitleOFbuttonFR(strings.getSubmitButonFR());
    }

    @Test
    public void checkENelemntsEN(){
        Elements elements = new Elements();
        elements
                .openEN()
                .TitleEN(strings.getTitleEN())
                .DescriptionEN(strings.getDescriptionEN())
                .TitlesOfFieldsEN(strings.getNomlFieldEN(),strings.getPrenomFieldEN(),strings.getEmailFieldEN(),
                        strings.getSecteurFieldEN(),strings.getSociétéFieldEN(),strings.getTelFieldEN(),
                        strings.getAdresseFieldEN(),strings.getVilleFieldEN(),strings.getCodePostalFieldEN(),strings.getPaysFieldEN(),strings.getCheckboxEN())
                .TitleOFbuttonEN(strings.getSubmitButonEN());
    }





}


