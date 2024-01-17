package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.Interfaces;

public interface Veritabani {

    String DATABASE_NAME= "db_veritabani";
    int PORT = 3306;

    void baglan();
    void sorguYap();
    void baglantiKapat();



}
