package RecoverPasswordForm.ElementsT;


import Base.BaseTest;
import RecoverPasswordForm.Elements;
import RecoverPasswordForm.ElementsSimple;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.metamodel.data.Row;
import org.apache.metamodel.schema.Table;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.data.DataSet;
import org.apache.metamodel.factory.DataContextFactoryRegistryImpl;
import org.apache.metamodel.factory.DataContextPropertiesImpl;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class ElementsTest extends BaseTest {
    String language;

    @BeforeClass
    public void beforeClass(ITestContext context){
        this.language = context.getCurrentXmlTest().getParameter("language");
    }

    @Test (dataProvider = "recoverPasswordForm")
     public void Elements(String popinTitle, String emailFieldlaceholder, String description, String buttonTitle){

         ElementsSimple elements = new ElementsSimple(language);

         elements
                 .open()
                 .getPopin()
                 .checkElements(popinTitle,emailFieldlaceholder,description,buttonTitle);
     }

@DataProvider (name = "recoverPasswordForm")
public Object[][] recoverPasswordForm() {
    // https://cwiki.apache.org/confluence/pages/viewpage.action?pageId=65875503
    DataContextPropertiesImpl properties = new DataContextPropertiesImpl();
    properties.put("type", "csv");
    properties.put("resource", "src/test/resources/recoverPasswordForm." + language + ".csv");
    properties.put("quote-char", '"');
    properties.put("separator-char", ',');
    properties.put("encoding", "UTF-8" );

    DataContext dataContext = DataContextFactoryRegistryImpl.getDefaultInstance().createDataContext(properties);

    Table table = dataContext.getDefaultSchema().getTable(0);
    DataSet dataSet = dataContext.query()
            .from( table )
            .selectAll()
            .execute();

    List<Row> rows = dataSet.toRows();

    Object[][] result = new Object[rows.size()][rows.get(0).size()];
    for(int i=0; i < rows.size(); i++){
        result[i] = rows.get(i).getValues();
    }

    return result;
}
}
