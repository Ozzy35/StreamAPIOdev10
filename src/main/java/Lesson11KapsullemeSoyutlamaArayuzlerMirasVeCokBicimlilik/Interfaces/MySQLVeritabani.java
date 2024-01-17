package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.Interfaces;

public class MySQLVeritabani implements Veritabani {
    @Override
    public void baglan() {
        // Mysql bağlantı için gerekli kodlar eklenir

    }

    @Override
    public void sorguYap() {
        // Sorgu için gerekli kdolar yazılır
    }

    @Override
    public void baglantiKapat() {
        // bağlantı kapatmak için gerekli kodları
    }
}
