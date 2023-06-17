package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

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

    @And("arama kutusunda QA aratir")
    public void aramaKutusundaQAAratir() {
        techproPage =new TechproPage();
        techproPage.searchBox.sendKeys("qa", Keys.ENTER );
    }

    @And("sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        assertTrue(Driver.getDriver().getTitle().contains("qa"));
    }
}