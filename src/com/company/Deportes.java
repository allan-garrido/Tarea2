package com.company;

/**
 * Created by alumno on 27/06/2017.
 */
public class Deportes {
    private String[] Listado = {"Beisbol", "Baloncesto", "Balonmano",
            "Balonpesado", "Bochas", "Bolos",
            "Cuatro cuadras", "Faustball","Flickerball", "Floorball", "Fútbol",
            "hockey", "formula 1", "boxeo", "natacion", "mma", "lucha libre"
             };

    public Deportes(String[] listado) {
        Listado = listado;
    }

    public String[] getListado() {
        return Listado;
    }

}
}
