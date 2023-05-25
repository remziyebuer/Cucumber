package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {

    //feature classinda cümle ismine control basili tiklayinca burda ki
    // ilgili metoda getirir.
    AmazonPage amazonPage;

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        
    }

    @And("arama kutusnda iphone aratir")
    public void aramaKutusndaIphoneAratir() {
        amazonPage = new AmazonPage();
       amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }

    @And("arama kutusnda Selenium aratir")
    public void aramaKutusndaSeleniumAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);

    }

    @And("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("java", Keys.ENTER);

    }

    @And("arama kutusnda SQL aratir")
    public void aramaKutusndaSQLAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("SQL", Keys.ENTER);

    }
}
