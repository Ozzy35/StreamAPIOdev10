package Lesson11KapsullemeSoyutlamaArayuzlerMirasVeCokBicimlilik.OzzyExamplesLesson11;

public interface Menu {
    void  widget();

    class GirisSayfasi implements Sayfa, Menu {


        @Override
        public void tusaBas() {
            System.out.println("Tuşa basıldı");

        }

        @Override
        public void elementBul() {
            System.out.println("Element bulundu ");

        }

        @Override
        public void widget() {

        }
    }
}
