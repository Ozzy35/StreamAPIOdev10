package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.Lesson11HomeWorkDepartman;

public class MainDepartman {
    public static void main(String[] args) {
        System.out.println("****************************DXC TECHNOLOGY /IT Ekibi********************************");
        Kadin personel1 =new Kadin("İntertek Team Lead ", "1 Personel Atandı " ,"1 Belge atandı", "Özge" ,  "Sargın", 30);

        System.out.println("İntertek Takım Lideri");
        System.out.println("Ad/Soyad :  " + personel1.getAd() +personel1.getSoyad());
        System.out.println("Yaş: " + personel1.getYas());
        System.out.println("Emeklilik yaşı  : " + personel1.emekliYasi + " = Emeklilik sağlanmadı ");

        System.out.println("İntertek Takım Lideri Görev/Personel Atama Listesi:");
        personel1.sinifYontemleriPersonel("","","");
        personel1.sinifYontemleriGorev("","");

        System.out.println("*************************************************************************************");
        Erkek personel2 =new Erkek("RTX Takım lideri","1 Personel atandı", "1 Belge atandı", "Todor", "Rogachev",35);

        System.out.println("RTX Takım Lideri");
        System.out.println("Ad/Soyad :  " + personel2.getAd() +personel2.getSoyad());
        System.out.println("Yaş: " + personel2.getYas());
        System.out.println("Emeklilik yaşı  : " + personel2.emekliYasi + " = Emeklilik sağlanmadı ");

        System.out.println("RTX Takım Lideri Görev Atama Listesi:");
        personel2.sinifYontemleriGorev("/iptal edildi ","/kontrol edildi.");




    }



   




}
