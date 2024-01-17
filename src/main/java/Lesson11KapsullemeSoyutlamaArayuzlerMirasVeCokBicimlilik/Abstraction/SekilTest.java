package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.Abstraction;

public class SekilTest {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(4,5);

        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();

        Kare kare = new Kare(6);
        kare.cevreHesapla();
        kare.alanHesapla();
        kare.yazdir();
    }
}
