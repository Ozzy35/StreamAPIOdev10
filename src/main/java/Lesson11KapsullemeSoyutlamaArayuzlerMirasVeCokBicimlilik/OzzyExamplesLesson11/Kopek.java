package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.OzzyExamplesLesson11;



//koke sınfın hayvan sıfına ınherınatces yanı katılım saglamasını yapıyoruz

public class Kopek extends Hayvan {

        private String isim;
        private String cins;
        private int yas;

        public Kopek (String isim, String cins, int yas){
            this.isim=isim;
            this.cins=cins;
            this.yas=yas;


        }

        public String getIsim() {
            return isim;
        }

        public String setIsim(String YeniIsim) {
            return this.isim= YeniIsim;

        }

        public String getCins() {
            return cins;
        }


        public int getYas() {
            return yas;

        }
//butun hayvanalr ses cıkardıgı ıcın ve koepk de bır hayvan oldugu ıcın kopek ses cıkartmak zorundadır bu sınıf cıcerısıdne metodu uyguluyoruz

    @Override
    protected void sesCikar() {
        System.out.println("Hav Hav");


    }
//yan koepk test sınıfındakı metodu gercesız kılarak uyku metoduna yeni bir tanım verdik alttadı uyku metodu kopek uyuren horluor mesajını yazdrdık
// @overriding(gecersız kılma,etkisiz kılma);
// Bız ıhtıyaclar dahılınde alt sınıflarda ust sınıflarda olsuturlan metodları gecersız kılarak yeni  fonksiyonlar tanımlayabiliyoruz

//    implement =overrıde etttık yani hayvanların cıkardıgı ses farklı kopegın cıkardıgını koepk uyrken horluyor olarak degıstırdık
//    diyelim ki burda ana sınıfnakı uyku metoduna erısmemiz gerekiyor erişmek için super anahtar kelimesini kulalbılırız
//    biz ana sınıfdaki override edilen farklı metodlara erişim saglayabılırız, uyku meotdunu main sınıfnda cagırdık ilkkopegım uyku olarak
//    uyku metodu hayvan uyuyor mesajını gerı cagırıyoruz
    @Override
    public void uyku() {
            super.uyku();
        System.out.println("Köpek uyurken horluyor......zzzz.........");
    }
}


