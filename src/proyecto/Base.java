package proyecto;

import java.io.Serializable;
import java.util.*;

public class Base implements Serializable{
    
    private String nombre;
    private String creador;
    private ArrayList<String> scripts = new ArrayList();
    private ArrayList<Usuario> usuariosAcceso = new ArrayList();
    private ArrayList<Tabla> tablas = new ArrayList();
    private static final long SerialVersionUID = 777L;
    
    public Base() {
    }

    public Base(String nombre, String creador) {
        this.nombre = nombre;
        this.creador = creador;
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

    public ArrayList<Usuario> getUsuarios() {
        return usuariosAcceso;
    }

    public void setUsuario(Usuario usuario) {
        usuariosAcceso.add(usuario);
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }
    
    public void setTablas(ArrayList<Tabla> tablas){
        this.tablas = tablas;
    }
    
    public void setTabla(Tabla tabla){
         tablas.add(tabla);
    }

    public ArrayList<String> getScripts() {
        return scripts;
    }

    public void setScripts(ArrayList<String> scripts) {
        this.scripts = scripts;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
