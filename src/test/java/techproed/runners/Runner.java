package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class; testNG deki .xml file larda belirttiğimiz class'ları,packageları veya methodları nasıl
çalıştırıyorsak, Cucumber frameworkundede Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz
 */

@RunWith(Cucumber.class)//Cucumber ile JUnit'in entegre olmasını sağlayan
                        // test çalıştırıcı notasyonudur

@CucumberOptions(  plugin={"pretty",   //plugin parametresi ile pretty ifadesi kullanılırsa konsolda scenario'lar
                                        // ile bilgi gösterir
        "html:src/test/resources/features/htmlReport/cucumberHooks.html"},//contet rooth ile yolu veriyoruz
        //Html raporunu görmek icin raporu sag tiklayip -open in - browser- chrome seklinde de acabiliriz
       // "json:target/json-reports/cucumber.json",
       // "junit:src/test/resources/features/htmlReport/cucumber.xml"},
                   features= "src/test/resources/features/day30_IlkFeature_RunWith_CucumberOptions",
                   glue = {"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız
                                     // stepDefinition class'ının packege'ını belirtiriz
                   tags = "@ilk",
                   dryRun = false,   //dryRun=false Test adımlarını kontrol eder ve browser'ı çalıştırır
                                     //dryRun=True Test adımlarını sadece kontrol eder default olarak false'tur.
                                     // Senaryoların nerede ve  nasıl çalışacağı, hangi raporu kullanacağıyla
                                     // alakalı seçenekleri ayarlarız
                   monochrome = false)//pretty ifadesinden sonra monochrome = true kullanırsak senerio
                                    // adımlarını tekrenk olark siyah gösterir. monochrome = false kullanırsak
                                    // renkli gösterir default olarak false

// tags = "@gr1 and sql" bu ikiside yazacak test üzerinde virgülsüz
/*
features ===> features'ların olduğu packega'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega'ın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
 */

public  class Runner {

}
