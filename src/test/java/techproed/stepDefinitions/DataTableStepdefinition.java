package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.pages.DataTablePage;
import techproed.utilities.ReusableMethods;

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

    @And("kullanici verilen urunleri aratir")
    public void kullaniciVerilenUrunleriAratir(DataTable data) {
        System.out.println(data.asList());//bunu sadece liste seklinde yazdirdigini görmek icin yazdirdik.
        //burda simdi bir for döngüsü ile verileri alabilirim.
        AmazonPage amazonPage = new AmazonPage();
        for(int i = 1; i< data.asList().size(); i++){
            amazonPage.aramaKutusu.sendKeys(data.asList().get(i), Keys.ENTER);
//Outline da her satir icin yeniden driver calistirilirken burda calistirilmaz.Arama cubugunda her aradigini
// yan yana yazdirir bu da hata almama sebep olur .Bu yüzden clear methodu kullanirim
            ReusableMethods.bekle(2);
            amazonPage.aramaKutusu.clear();
        }

    }


}
