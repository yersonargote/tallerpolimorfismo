package com.unicauca.tallerpoliforfismo.modelo;

import java.util.Date;

/**
 *
 * @author yerson
 */
public class ViajeIncentivo extends Viaje {

    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;
//Constructor, getters and setters

    public ViajeIncentivo(String origen, String destino, int costo, Date fSalida, Date fLlegada, String empresa){
        super(origen, destino, costo, fSalida, fLlegada);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
