package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.OzzyExamplesLesson11;

public abstract class Hayvan {
// Olustumaya calıstıgımız bag kopegın bır hayvan oldugu, hayvanın belirli bir özellikleri tutması,
//    Kopegın ıse soyutlama prensibini kullanarak HayvanOzzy class ındaki bazı metodları kullanması

    //    abstrac sınıflar nesne olusturmak ıcın kullanılmazlar.Abstrak sınıflaa erısmek ıcın sınıfın abstark sınıflara katılım
//    yada ınherıtances etmesı gerekır.
    protected abstract void sesCikar();

    public void uyku(){
        System.out.println("Hayvan uyuyor");
    }

}
//abstarc sınıflardan ensen olusturlmaza saedece katılım ozellıgyle kullalnırlar yanı
// dıger sınıfların ınherıtances ozellgını kullanarak abstarck sınfını katılırlar
//ornegın bu abstarc sınıfnı KopekOzzyTest sınfıyla cagıryalım.