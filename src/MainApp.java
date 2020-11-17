public class MainApp {

    public static void main(String[] args) {

        int a = 22;
        int b = 24;
        int c = 33;
        int d = 43;

        int suma_ab = a + b;
        int suma_cd = c + d;

        //spr. czy suma_ab jest parzysta
        if (suma_ab % 2 == 0) {
            System.out.println("Suma liczb: " + a + " oraz " + b + " jest liczbą parzysta");
        } else {
            System.out.println("Suma liczb: " + a + " oraz " + b + " jest liczbą nieparzysta");
        }

        //spr. czy suma_cd jest parzysta
        if (suma_cd % 2 == 0) {
            System.out.println("Suma liczb: " + c + " oraz " + d + " jest liczbą parzysta");
        } else {
            System.out.println("Suma liczb: " + c + " oraz " + d + " jest liczbą nieparzysta");
        }

        //spr. czy obie sumy są liczbami parzystymi
        if (suma_ab % 2 == 0 && suma_cd % 2 == 0) {
            System.out.println("Suma liczb: " + a + ", " + b + ", " + c + " oraz " + d + " jest liczbą parzysta");
        } else {
            System.out.println("Suma liczb: " + a + ", " + b + ", " + c + " oraz " + d + " jest liczbą nieparzysta");
        }

    }

}
