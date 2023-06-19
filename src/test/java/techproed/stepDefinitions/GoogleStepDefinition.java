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

    @And("kullanici cookies kabul ederek kapatir")
    public void kullaniciCookiesKabulEderekKapatir() {
        googlePage =new GooglePage();
        googlePage.cookie.click();
    }
  @When("kullanici google'da {string} aratir")
    public void kullaniciGoogleDaAratir(String aranacakKelime) {
        googlePage= new GooglePage();
        googlePage.aramaKutusu.sendKeys(aranacakKelime ,Keys.ENTER);
       // googlePage.aramaKutusu.submit();
    }
   @Then("basligin {string} icerdigini dogrular")
    public void basligin_icerdigini_dogrular(String aranacakKelime) {
        assertTrue(Driver.getDriver().getTitle().contains(aranacakKelime));

    }
  @When("kullanici google'da {string} key ile aratir")
    public void kullaniciGoogleDaKeyIleAratir(String aranacakKelime) {
        googlePage= new GooglePage();
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(aranacakKelime) ,Keys.ENTER);
    }

    @Then("basligin {string} icerdigini key ile dogrular")
    public void basliginIcerdiginiKeyIleDogrular(String aranacakKelime) {
        assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(aranacakKelime)));
    }
}
