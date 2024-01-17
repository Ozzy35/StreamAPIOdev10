package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.Abstraction;

public abstract class Sekil {
    abstract void cevreHesapla();
    abstract void alanHesapla();

    public void yazdir(){
        System.out.println("Bu bir şekildir");
    }
}
