package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

import static org.junit.Assert.assertTrue;

public class DataTableStepdefinition {

    DataTablePage dataTablePage;

    @Then("kullanici sayfada ki tabloda new butonuna basar")
    public void kullaniciSayfadaKiTablodaNewButonunaBasar() {
        dataTablePage = new DataTablePage();
        dataTablePage.newButton.click();
    }

    @When("cikan pencerede verilen bilgileri girelim {string},{string},{string},{string},{string},{string},{string}")
    public void cikanPenceredeVerilenBilgileriGirelim(String firstname, String lastname, String position,
                                                      String office, String extention, String date, String salary) {


        dataTablePage = new DataTablePage();
        dataTablePage.firstName.sendKeys(firstname, Keys.TAB, lastname, Keys.TAB, position, Keys.TAB, office, Keys.TAB,
                extention, Keys.TAB, date, Keys.TAB, salary);


    }

    @And("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        dataTablePage = new DataTablePage();
        dataTablePage.createButton.click();
    }


    @And("kullanici search bölümüne {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String aranacakKelime) {
        dataTablePage = new DataTablePage();
        dataTablePage.search.sendKeys(aranacakKelime);

    }

    @And("kullanici {string} ile basarili bir sekilde giris yapildigini dogrular")
    public void kullaniciIleBasariliBirSekildeGirisYapildiginiDogrular(String firstname) {
        dataTablePage = new DataTablePage();
        assertTrue(dataTablePage.verify.getText().contains(firstname));
    }
}
