package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.ThisİsThis;

public class Sayi {
    private int deger;

    public int getDeger() {
        return deger;
    }

    public Sayi(){
        this(0);
    }
    public Sayi(int deger){
        this.deger=deger;
    }
}
