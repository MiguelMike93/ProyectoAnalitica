/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.runt.graficos.dto;

/**
 *
 * @author Daniel
 */
public class BarraDTO {
    
    private String id;
    private String clave;
    private Double valor;

    public BarraDTO(){
        //no realiza accion
    }
    
    public BarraDTO(String clave, Double valor){
        this.clave=clave;
        this.valor=valor;
    }
    
    public BarraDTO(String id, String clave, Double valor){
        this.id=id;
        this.clave=clave;
        this.valor=valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}
