public class MainApp {

    public static void main(String[] args) {

        int a = 22;
        int b = 24;
        int c = 31;
        int d = 43;

        int suma1 = a + b;
        int suma2 = c + d;

        //spr. czy obie sumy są liczbami parzystymi
        if (suma1 % 2 == 0 && suma2 % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Conajmniej jedna liczba jest liczbą nieparzystą");
        }

    }

}
