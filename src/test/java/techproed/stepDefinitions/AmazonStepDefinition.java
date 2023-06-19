package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class AmazonStepDefinition {

    //feature classinda cümle ismine control basili tiklayinca burda ki
    // ilgili metoda getirir.
    AmazonPage amazonPage;

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        
    }

    @And("arama kutusunda iphone aratir")
    public void aramaKutusundaIphoneAratir() {
        amazonPage = new AmazonPage();
       amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }

    @And("arama kutusunda Selenium aratir")
    public void aramaKutusundaSeleniumAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);

    }

    @And("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("java", Keys.ENTER);

    }

    @And("arama kutusunda SQL aratir")
    public void aramaKutusundaSQLAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("SQL", Keys.ENTER);

    }


    @When("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String arananMetin) {
        amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(arananMetin, Keys.ENTER);

    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(2);
    }
}
