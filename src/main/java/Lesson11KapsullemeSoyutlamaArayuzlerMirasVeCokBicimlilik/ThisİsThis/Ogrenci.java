package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.ThisİsThis;

public class Ogrenci {
    private String isim;

    public void setIsim(String isim) {
        this.isim = isim; // Alan ile parametreyi ayırır.
    }

    public void yazdirOgrenci(String isim){
        System.out.println("Öğrenci: "+ this.isim);
    }
}
