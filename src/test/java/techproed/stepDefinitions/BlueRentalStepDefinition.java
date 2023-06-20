package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage;

    @Then("verilen kullanici ile login olur ve login olundugu dogrulanir")
    public void verilenKullaniciIleLoginOlur(DataTable data) {
      blueRentalPage = new BlueRentalPage();
      blueRentalPage.loginButton.click();
      ReusableMethods.bekle(5);
      blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB, data.row(1).get(1),Keys.ENTER);
      ReusableMethods.bekle(5);
      assertEquals(blueRentalPage.userDropDown.getText(),"Sam Walker");
      Driver.getDriver().navigate().back();//logout işlemi yerine navigate().back() methodu ile çözdük
      ReusableMethods.bekle(2);
      blueRentalPage.emailBox.sendKeys(data.row(2).get(0), Keys.TAB, data.row(2).get(1),Keys.ENTER);
      ReusableMethods.bekle(2);
      assertEquals(blueRentalPage.userDropDown.getText(),"Kate Brown");
      ReusableMethods.bekle(2);

    }
    /*

row() metodu, Cucumber'ın DataTable sınıfı tarafından sağlanan bir metottur.
DataTable sınıfı, Cucumber senaryolarında tablo verilerini temsil etmek ve
manipüle etmek için kullanılır.

DataTable sınıfı, Cucumber'ın Java implementasyonunda (cucumber.api.DataTable) ve
benzer şekilde diğer programlama dilleri için de mevcuttur. Bu sınıf, senaryoların
tablo verilerini kolayca yönetebilmek için çeşitli yöntemler ve işlevler sağlar.

row() metodu, DataTable nesnesinde belirli bir satıra erişmek için kullanılan bir
yöntemdir. Bu yöntem, verilen satır numarasına (sıfırdan başlayan indekslemeyle)
karşılık gelen verileri döndürür.

DataTable'ın tam olarak hangi paketten veya sınıftan import edildiğini görmek için
ilgili Java dosyasının başında import ifadelerini kontrol edebilirsiniz. Örneğin,
import cucumber.api.DataTable; ifadesi bu sınıfın cucumber.api paketinden import
edildiğini gösterir.





     */
}
