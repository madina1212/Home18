import java.util.Scanner;

public class Hotel implements numberPeople{

    @Override
    public String toString() {
        return "Hotel{}";
    }

    @Override
    public void getSum() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m>=2){
            System.out.println("""
            Мейманканада 2 адам жашайт.
            Жашаган жерине кунуно 2000минден толошот        
                    """);
        } else if (m<2) {
            System.out.println("кечиресиз сиз уйунузду адаштырып алдыныз");
        }

    }
}
