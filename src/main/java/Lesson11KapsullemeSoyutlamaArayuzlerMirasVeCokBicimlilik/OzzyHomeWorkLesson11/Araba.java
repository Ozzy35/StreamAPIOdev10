package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.OzzyHomeWorkLesson11;

public class Araba {
    private String kasaTipi;
    private String model;

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }

    private int kullanimKm;
    private int fiyat;
    private int kapi;

public Araba(String kasaTipi, String model, int kullanimKm, int fiyat,int kapi){
    this.kasaTipi=kasaTipi;
    this.model=model;
    this.kullanimKm=kullanimKm;
    this.fiyat=fiyat;
    this.kapi=kapi;

}
//Metod 1 i yapıyoruz
public void arabayiSur(int surulenKm){
//BUNUN DAHA SADESİ YERİNE     this.kullanimKm = this.kullanimKm+ surulenKm; ASAGIDAKİ GİBİ YAZIYORUZ
//    kullanım km uzerıne surulen km eklıyoruz
    this.kullanimKm +=surulenKm;
    System.out.println("Arabanın yeni kilometresi "  +this.kullanimKm);
}

public int satisFiyati (int yeniSatisFiyati){
    return this.fiyat=yeniSatisFiyati;
//    yukarıdaki metod aracın yenı satıs fıyarını yenı satıs fıyatına esıtleyıp
//    bu metod sayasinde geri dönüş yapmış oluyoruz
}

}
