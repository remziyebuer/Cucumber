package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class TechproEdStepDefinition {
    TechproPage techproPage;
    @Given("kullanici techpro sayfasina gider")
    public void kullaniciTechproSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));

    }

    @Then("cikan reklam kapatilir")
    public void cikanReklamKapatilir() {
        techproPage=new TechproPage();
        techproPage.reklam.click();
    }

    @And("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        techproPage =new TechproPage();
        techproPage.searchBox.sendKeys("qa", Keys.ENTER );
    }

    @And("sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        assertTrue(Driver.getDriver().getTitle().contains("qa"));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {//keyde ne belirti isek url ' e onu yazmaliyiz
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("kullanici tüm sayfanin resmini alir")
    public void kullaniciTumSayfaninResminiAlir() {
        ReusableMethods.tumSayfaResmi("TumSayfaResmi");

    }

    @And("techpro arama kutusunda {string} aratir")
    public void techproAramaKutusundaAratir(String arananKelime) {
        techproPage= new TechproPage();
        techproPage.searchBox.sendKeys(arananKelime, Keys.ENTER);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String metin) {
       assertTrue(Driver.getDriver().getTitle().contains(metin));
    }
}
