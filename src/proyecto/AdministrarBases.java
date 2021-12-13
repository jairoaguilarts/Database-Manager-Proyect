package proyecto;

import java.io.*;
import java.util.*;

public class AdministrarBases {

    private ArrayList<Base> bases = new ArrayList();
    private File archivo;

    public AdministrarBases(String path) {
        archivo = new File(path);
    }

    public ArrayList<Base> getBases() {
        return bases;
    }

    public void setBases(ArrayList<Base> bases) {
        this.bases = bases;
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
            for (Base b : bases) {
                obj.writeObject(b);
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
            bases = new ArrayList();
            Base temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Base) objeto.readObject()) != null) {
                        bases.add(temp);
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
