package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.OzzyHomeWorkLesson11;

public class MainHomeWork {
    public static void main(String[] args) {
        Sedan sedanCoupe = new Sedan("Opel",10000,50000,5);
        System.out.println("Aracımın modeli:  "  +sedanCoupe.getModel() + "Kullanım KM " +sedanCoupe.getKullanimKm() + "Fiyatı : " + sedanCoupe.getFiyat() +
                "Kapı sayısı:  " +sedanCoupe.getKapi());

        sedanCoupe.arabayiSur(5000);
        sedanCoupe.satisFiyati(495000);

        System.out.println("Aracımın modeli:  "  +sedanCoupe.getModel() + "Kullanım KM " +sedanCoupe.getKullanimKm() + "Fiyatı : " + sedanCoupe.getFiyat() +
                "Kapı sayısı:  " +sedanCoupe.getKapi());

//        aracı bıraz daha surelım

        sedanCoupe.arabayiSur(10000);
        sedanCoupe.satisFiyati(450000);

        System.out.println("Aracımın modeli:  "  +sedanCoupe.getModel() + "Kullanım KM " +sedanCoupe.getKullanimKm() + "Fiyatı : " + sedanCoupe.getFiyat() +
                "Kapı sayısı:  " +sedanCoupe.getKapi());

//        Hatcbak araba olusturlaım

        Hatcback hatcbackVolvo = new Hatcback("Volvo ", 0, 1000000, 5);
        hatcbackVolvo.arabayiSur(1000);
        hatcbackVolvo.satisFiyati(9500000);

        System.out.println("Aracımın modeli " + hatcbackVolvo.getModel() + "Kullanım km " + hatcbackVolvo.getKullanimKm() + "Fiyatı: "
                +hatcbackVolvo.getFiyat() + "ve kapı sayısı: " + hatcbackVolvo.getKapi() );

        hatcbackVolvo.arabayiSur(500);
        hatcbackVolvo.satisFiyati(945000);

        System.out.println("Aracımın modeli " + hatcbackVolvo.getModel() + "Kullanım km " + hatcbackVolvo.getKullanimKm() + "Fiyatı: "
                +hatcbackVolvo.getFiyat() + "ve kapı sayısı: " + hatcbackVolvo.getKapi() );


    }
}
