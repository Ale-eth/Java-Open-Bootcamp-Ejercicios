package Entrega4;

public class SmartWatch extends SmartDevice{

     private String modelo;
     private String tipoAlimentacion;

    public SmartWatch(String marca, String material, int id, String modelo, String tipoAlimentacion){
        super(marca, material, id);
        this.modelo = modelo;
        this.tipoAlimentacion = tipoAlimentacion;
    }
}
