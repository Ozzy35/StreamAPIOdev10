package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.ThisİsThis;

public class OgrenciTest {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        Sayi sayi = new Sayi();

        ogrenci.setIsim("Serkan");

        //ogrenci.yazdirOgrenci("Ahmet");;

        System.out.println(sayi.getDeger());
    }
}
