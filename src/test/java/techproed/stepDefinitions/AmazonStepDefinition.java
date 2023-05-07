package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {

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
        Driver.getDriver().close();
    }

    @And("arama kutusnda Selenium aratir")
    public void aramaKutusndaSeleniumAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);

    }
}
