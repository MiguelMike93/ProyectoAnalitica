/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.runt.graficos;

import co.com.runt.graficos.dto.BarraDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Daniel
 */
@Path("/informacion")
public class Servicio {

    @GET
    @Path("/barras")
    public List<BarraDTO> getBarras() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "A", 0.08167));
        lista.add(new BarraDTO("2", "B", 0.01492));
        lista.add(new BarraDTO("3", "C", 0.02782));
        lista.add(new BarraDTO("4", "D", 0.04253));
        lista.add(new BarraDTO("5", "E", 0.12702));
        lista.add(new BarraDTO("6", "F", 0.02288));
        lista.add(new BarraDTO("7", "G", 0.02015));
        lista.add(new BarraDTO("8", "H", 0.06094));
        lista.add(new BarraDTO("9", "I", 0.06966));
        lista.add(new BarraDTO("10", "J", 0.00153));
        lista.add(new BarraDTO("11", "K", 0.00772));
        lista.add(new BarraDTO("12", "L", 0.04025));
        lista.add(new BarraDTO("13", "M", 0.02406));
        lista.add(new BarraDTO("14", "N", 0.06749));
        lista.add(new BarraDTO("15", "O", 0.07507));
        lista.add(new BarraDTO("16", "P", 0.01929));
        lista.add(new BarraDTO("17", "Q", 0.00095));
        lista.add(new BarraDTO("18", "R", 0.05987));
        lista.add(new BarraDTO("19", "S", 0.06327));
        lista.add(new BarraDTO("20", "T", 0.09056));
        lista.add(new BarraDTO("21", "U", 0.02758));
        lista.add(new BarraDTO("22", "V", 0.00978));
        lista.add(new BarraDTO("23", "W", 0.02360));
        lista.add(new BarraDTO("24", "X", 0.00150));
        lista.add(new BarraDTO("25", "Y", 0.01974));
        lista.add(new BarraDTO("26", "Z", 0.00074));

        return lista;
    }

    @GET
    @Path("/lineas")
    public List<BarraDTO> getLineas() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "2016-1", 1500.0));
        lista.add(new BarraDTO("2", "2016-2", 2300.0));
        lista.add(new BarraDTO("3", "2017-1", 2103.0));

        return lista;
    }

    @GET
    @Path("/barras1")
    public List<BarraDTO> getBarras1() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("A", 0.08167));
        lista.add(new BarraDTO("B", 0.01492));
        lista.add(new BarraDTO("C", 0.02782));
        lista.add(new BarraDTO("D", 0.04253));
        lista.add(new BarraDTO("E", 0.12702));
        lista.add(new BarraDTO("F", 0.02288));
        lista.add(new BarraDTO("G", 0.02015));
        lista.add(new BarraDTO("H", 0.06094));
        lista.add(new BarraDTO("I", 0.06966));

        return lista;
    }

    @GET
    @Path("/pie")
    public List<BarraDTO> getPie() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "Masculino", 1299.0));
        lista.add(new BarraDTO("2", "Femenino", 804.0));

        return lista;
    }

    @GET
    @Path("/seccional")
    public List<BarraDTO> getSeccional() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "CHQUIRA", 72.0));
        lista.add(new BarraDTO("2", "DUITAMA", 200.0));
        lista.add(new BarraDTO("3", "SOGAMOSO", 192.0));
        lista.add(new BarraDTO("4", "TUNJA", 1639.0));
        return lista;
    }

     @GET
    @Path("/modalidad")
    public List<BarraDTO> getModalidad() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "PRESENCIAL", 30.0));
        lista.add(new BarraDTO("2", "DISTANCIA", 200.0));
        lista.add(new BarraDTO("3", "POSGRADO", 20.0));
        lista.add(new BarraDTO("4", "VIRTUAL", 10.0));
        return lista;
    }
    
    @GET
    @Path("/jornada")
    public List<BarraDTO> getJornada() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "DIURNA", 30.0));
        lista.add(new BarraDTO("2", "NOCTURNA", 200.0));
 
        return lista;
    }
    
    @GET
    @Path("/tipo")
    public List<BarraDTO> getTipo() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "INTERNA", 30.0));
        lista.add(new BarraDTO("2", "EXTERNA", 200.0));
 
        return lista;
    }
    @GET
    @Path("/facultad")
    public List<BarraDTO> getFacultad() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "CIENCIAS", 189.0));
        lista.add(new BarraDTO("2", "CIENCIAS AGROPECUARIAS", 62.0));
        lista.add(new BarraDTO("3", "CIENCIAS DE LA EDUCACION", 344.0));
        lista.add(new BarraDTO("4", "CIENCIAS DE LA SALUD", 172.0));
        lista.add(new BarraDTO("5", "CIENCIAS ECONOMICAS Y ADMINISTRATIVAS", 90.0));
        lista.add(new BarraDTO("6", "DERECHO Y CIENCIAS  SOCIALES", 44.0));
        lista.add(new BarraDTO("7", "ESTUDIOS A DISTANCIA", 462.0));
        lista.add(new BarraDTO("8", "INGENIERIA", 201.0));
        lista.add(new BarraDTO("9", "SECCIONAL CHIQUINQUIRA", 72.0));
        lista.add(new BarraDTO("10", "SECCIONAL DUITAMA", 200.0));
        lista.add(new BarraDTO("11", "SECCIONAL SOGAMOSO", 192.0));
        lista.add(new BarraDTO("12", "VICERECTORIA ACADEMICA", 75.0));

        return lista;
    }

    @GET
    @Path("/estudios")
    public List<BarraDTO> getEstudios() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "DOCTORADO", 180.0));
        lista.add(new BarraDTO("2", "ESPECIALISTA", 548.0));
        lista.add(new BarraDTO("3", "LICENCIADO", 174.0));
        lista.add(new BarraDTO("4", "MAGISTER", 917.0));
        lista.add(new BarraDTO("5", "PROFESIONAL", 276.0));
        lista.add(new BarraDTO("6", "SIN TITULO", 8.0));

        return lista;
    }

    @GET
    @Path("/vinculacion")
    public List<BarraDTO> getVinculacion() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "CATEDRA", 764.0));
        lista.add(new BarraDTO("2", "OCASIONAL MT", 121.0));
        lista.add(new BarraDTO("3", "OCASIONAL TC", 666.0));
        lista.add(new BarraDTO("4", "PLANTA MT", 10.0));
        lista.add(new BarraDTO("5", "PLANTA TC", 520.0));
        lista.add(new BarraDTO("6", "PRIM NOM TC", 22.0));

        return lista;
    }
    
   @GET
    @Path("/excepcionalidades")
    public List<BarraDTO> getExcepcionalidades() {
        List<BarraDTO> lista = new ArrayList<BarraDTO>();
        lista.add(new BarraDTO("1", "Excep.. 1", 1500.0));
        lista.add(new BarraDTO("2", "Excep.. 2", 2300.0));
        lista.add(new BarraDTO("3", "Excep.. 3", 2103.0));
        lista.add(new BarraDTO("4", "Excep.. 4", 1340.0));
        lista.add(new BarraDTO("5", "Excep.. 5", 2190.0));

        return lista;
    }


}
