package proyecto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Tabla implements Serializable{
    
    private String nombre, creador, fechaCreación;
    private ArrayList<String> atributos = new ArrayList();
    private ArrayList<String[]> detalles = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Tabla() {
    }

    public Tabla(String nombre, String creador, String fechaCreación) {
        this.nombre = nombre;
        this.creador = creador;
        this.fechaCreación = fechaCreación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getFechaCreación() {
        return fechaCreación;
    }

    public void setFechaCreación(String fechaCreación) {
        this.fechaCreación = fechaCreación;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<String[]> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<String[]> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString(){
        return nombre;
    }
    
    public String generarReporte() {
        return "#ENCABEZADO" 
                + "\nNombre: " + nombre 
                + "\nCreador: " + creador 
                + "\nFecha de Creación: " + fechaCreación 
                + "\nAtributos: " + atributos 
                + "\n\n#DETALLES"
                + obtenerDetalles();
    }
    
    private String obtenerDetalles(){
        String almacenar = "";
        for (String[] detalle : detalles) {
            almacenar += "\n" + Arrays.toString(detalle);
        }
        return almacenar;
    }
    
}
