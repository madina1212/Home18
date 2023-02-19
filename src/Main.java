import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Салмаьсызбы сиз кайсыл болмого келдиниз");
        while (true) {
                numberPeople t = new theHouse();
                numberPeople[] family = {t};
                for (numberPeople m : family) {
                    System.out.println(m);
                    m.getSum();
                }

                numberPeople h = new Hotel();
                numberPeople[] family1 = {h};
                for (numberPeople d : family1) {
                    System.out.println(d);
                    d.getSum();
                }
                numberPeople a = new Apartment();
                numberPeople[] family2 = {a};
                for (numberPeople j : family2) {
                    System.out.println(j);
                    j.getSum();
                }
            }
        }
}