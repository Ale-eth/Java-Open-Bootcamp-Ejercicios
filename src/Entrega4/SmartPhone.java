package Entrega4;

public class SmartPhone extends SmartDevice{

    private String modelo;
    private String compañia;

    public SmartPhone(String marca, String material, int id, String modelo, String compañia){
        super(marca, material, id);
        this.modelo = modelo;
        this.compañia = compañia;
    }
}
