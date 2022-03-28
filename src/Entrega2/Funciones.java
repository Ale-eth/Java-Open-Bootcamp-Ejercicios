package Entrega2;

public class Funciones {
    public static void main(String[] args) {

        double precio = 75.5;

        System.out.println("Precio final: " +aplicarIVA(precio)+ "$");
    }

    static double aplicarIVA(double precio){

        double iva = precio * 21 / 100;
        double precioMasIva = precio + iva;

        return precioMasIva;
    }
}
