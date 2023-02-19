import java.util.Scanner;

public class Apartment implements numberPeople{

    @Override
    public String toString() {
        return "Apartment{}";
    }

    @Override
    public void getSum() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m>=3){
            System.out.println("""
            Гостиницада 3 адам жашайт.
            Гостиницага айсайын 12000 толошот + 
            светке газга 800 сомдон толойт         
                    """);
        } else if (m<3) {
            System.out.println("Сиз биздин гостиницага адашып келип калдыныз ");
        }

    }
}
