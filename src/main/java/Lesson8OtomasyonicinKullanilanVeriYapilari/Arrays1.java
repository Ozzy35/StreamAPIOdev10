package Lesson8OtomasyonicinKullanilanVeriYapilari;


public class Arrays1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[4] = 10;
        int ikinciEleman = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Dizinin "+ (i+1) +". elemanı: " +numbers[i]);
        }
    }
}