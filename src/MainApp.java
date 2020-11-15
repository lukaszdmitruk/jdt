public class MainApp {

    public static void main(String[] args) {

        int a = 22;
        int b = 24;
        int c = 31;
        int d = 43;

        int suma_ab = a + b;
        int suma_cd = c + d;

        //spr. czy obie sumy są liczbami parzystymi
        if (suma_ab % 2 == 0 && suma_cd % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Conajmniej jedna liczba jest liczbą nieparzystą");
        }

    }

}
