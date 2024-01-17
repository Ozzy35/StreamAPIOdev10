package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.OzzyExamplesLesson11;

public class Main {
    public static void main(String[] args) {
        Kopek ilkKopegim = new Kopek( "Pia" ,  "Rus Finosu" ,  14);
        System.out.println("Köpeğimin adı: "  +  ilkKopegim.getIsim() + ", Cinsi : " + ilkKopegim.getCins() + " ve Yaşı: "+ ilkKopegim.getYas());


        //koepgımız barınakdan sahıplendık farklı bır isım koyucaz
        //set ısım metodunu kullanıyoruz
        //nesnedkı ısmı yenı sımle degıstırdık get set metoduyla

        ilkKopegim.setIsim("Mia");
        System.out.println("Köpeğimin yeni ismi:  "+ ilkKopegim.getIsim());

//  yenı kopek nesnesı ıcın =KopekOzzy ikinciKopegim =new KopekOzzy();



//    Hayvan sınıfı bızım super sınıf oluyor yanı abstrack ana sınıf kopek ıse hayvan sınfına katılım gosterdı ve
//    bız artık bu metodlara erısım saglıyoruz ayrıca hayvan sınıfında tanımladıgımız abstrack metodu da kopek de uygulamamız gerektı
//    ve bunuda uygulayarak kopegın cıkardıgı sesı tanımladık.Kopeklerın cıkardıgı sesı tanımladık bizim kopegımızde turettıgımız ıcın ses cıkarma metıdunu kullanıyoruz hav hav

        ilkKopegim.sesCikar();
        ilkKopegim.uyku();

        Kedi kedi =new Kedi();
        kedi.sesCikar();
        kedi.uyku();


    }


}
