import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Dogdugunuz ay: ");
        int month = input.nextInt();

        System.out.println("Dogdugunuz gun: ");
        int day = input.nextInt();

        if (month == 1) {
            if ((day < 1) || (day > 30)) {
                isError = true;
            } else if (day < 22) {
                horoscope = "Oglak";
            } else {
                horoscope = "Kova";
            }
        }

        else if (month == 2){
            if ((day <1) || (day >28)){
                isError = true;
            }
            else if(day <20 ){
                horoscope = "Kova";
            }
            else {
                horoscope = "Balık";
            }
        }

        else {
            isError = true;
        }

        if(isError) {
            System.out.println("Hatalı giris");
        }
        else {
            System.out.println("Burcunuz: " + horoscope);
        }
    }
}
