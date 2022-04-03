package Entrega4;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SmartDevice dispositivoAle = new SmartDevice("samsung", "plastico", 455);

        SmartPhone celularAle = new SmartPhone("apple", "metal", 2552, "6s", "personal");

        SmartWatch relojAle = new SmartWatch("xiaomi", "goma", 889, "mi band 5", "bateria recargable");

        System.out.println(relojAle.marca);
        System.out.println(relojAle.material);
    }
}
