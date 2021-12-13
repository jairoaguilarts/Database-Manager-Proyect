package proyecto;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
    
    private String nombre, nombreUsuario, contraseña;
    private ArrayList<String> permisos = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Usuario() {
    }

    public Usuario(String nombre, String usuario, String contraseña, ArrayList<String> permisos) {
        this.nombre = nombre;
        this.nombreUsuario = usuario;
        this.contraseña = contraseña;
        this.permisos = permisos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String usuario) {
        this.nombreUsuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(ArrayList<String> permisos) {
        this.permisos = permisos;
    }

    public void setPermiso(String permiso) {
        switch (permiso) {
            case "GESTION", 
                    "CREATE", 
                    "SELECT", 
                    "INSERT", 
                    "DELETE", 
                    "DROP" -> permisos.add(permiso);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
