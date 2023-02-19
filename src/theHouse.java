import java.util.Scanner;

public class theHouse implements numberPeople {

    @Override
    public String toString() {
        return "theHouse[]";
    }

    @Override
    public void getSum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>=5){
            System.out.println("""
            Өз үйүндө 5 адам жашайт.
            Айсайын  светке газга 1000 сомдон толойт        
                    """);
        } else if (a<5) {
            System.out.println("Квартирага же Мейманканага барышыныз керек");
        }
    }
}
