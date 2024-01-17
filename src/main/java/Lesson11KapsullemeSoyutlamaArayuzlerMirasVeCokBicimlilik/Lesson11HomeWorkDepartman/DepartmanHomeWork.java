package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.Lesson11HomeWorkDepartman;

import java.util.List;

public class DepartmanHomeWork {
     private String teamLead;
     private String personelList;

    public DepartmanHomeWork(String ad, String soyad, int yas) {
    }

    public String getTeamLead() {
        return teamLead;
    }

    public String getPersonelList() {
        return personelList;
    }

    public String getAssignmentList() {
        return assignmentList;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public int getEmekliYasi() {
        return emekliYasi;

    }

    private  String assignmentList;

     private String ad;
     private String soyad;
     int yas;

   int  emekliYasi;

    public DepartmanHomeWork(String teamLead, String personelList,String assignmentList, String ad,
                             String soyad,int yas, int emekliYasi){
        this.teamLead=teamLead;
        this.personelList=personelList;
        this.assignmentList=assignmentList;
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.emekliYasi=emekliYasi;


    }

    public void sinifYontemleri(String teamLeadDegistirme){
        this.teamLead=teamLeadDegistirme;
        System.out.println("Takım Liderimiz: Ozzy " + this.teamLead);
    }
    public void sinifYontemleriPersonel(String personelEkleme, String personelCikarma, String personelDegistirme){
        this.personelList=personelEkleme;
        this.personelList=personelCikarma;
        this.personelList=personelDegistirme;

        System.out.println("Personel Ekle:Valentina eklendi  " +this.personelList);
        System.out.println("Personel Çıkarma:Damyan çıkarıldı " + this.personelList);
        System.out.println("Personel Değiştirme: Gabriela ve Hristina değiştirildi " +this.personelList);

    }
   public void sinifYontemleriGorev(String  gorevEkleme, String gorevCikarma){
        this.assignmentList=gorevEkleme;
        this.assignmentList=gorevCikarma;

       System.out.println("Görev eklendi: DXC .jpg dosyası sunumu " +this.assignmentList);
       System.out.println("Görev Çıkarıldı:DXC 2023 yılın yıllık maliyet raporu  " +this.assignmentList);
   }

    public void  emekliYasi( int emekliYasi) {
        this.emekliYasi=emekliYasi;
    }
}

