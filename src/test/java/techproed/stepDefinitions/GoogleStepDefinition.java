package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class GoogleStepDefinition {

    GooglePage googlePage;
    @Given("kullanici google anasayfasina gider")
    public void kullaniciGoogleAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_Url"));
    }

    @When("kullanici googleda {string} aratir")
    public void kullaniciGoogledaAratir(String aranacakKelime) throws InterruptedException {
        googlePage= new GooglePage();
        googlePage.aramaKutusu.sendKeys(aranacakKelime  );
        googlePage.aramaKutusu.submit();
    }

    @Then("title'in {string} icerdigini dogrula")
    public void titleInIcerdiginiDogrula(String titleDegeri) {
        assertTrue(Driver.getDriver().getTitle().contains(titleDegeri));
    }

    @And("kullanici cookies kabul ederek kapatir")
    public void kullaniciCookiesKabulEderekKapatir() {
        googlePage =new GooglePage();
        googlePage.cookie.click();
    }
}
