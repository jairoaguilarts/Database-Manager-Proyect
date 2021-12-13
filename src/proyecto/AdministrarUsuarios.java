package proyecto;

import java.io.*;
import java.util.*;

public class AdministrarUsuarios {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public AdministrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        try {
            FileOutputStream arch = new FileOutputStream(archivo);
            ObjectOutputStream obj = new ObjectOutputStream(arch);
            for (Usuario u : usuarios) {
                obj.writeObject(u);
            }
            obj.flush();
            obj.close();
            arch.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarArchivo() {
        try {
            usuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        usuarios.add(temp);
                    }
                } catch (EOFException ex) {
                }
                entrada.close();
                objeto.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
