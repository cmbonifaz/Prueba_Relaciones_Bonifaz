package dominio;

import java.util.ArrayList;

public class Universidad {

    private String nombreDeUniversidad;

    private ArrayList<Facultad> facultad; //relacion: de composicion una universidad tiene varias facultades

    public Universidad(String nombreDeUniversidad) {
        facultad = new ArrayList<>();//para que sea de composicion
        this.nombreDeUniversidad = nombreDeUniversidad;
    }

    public void agregaFacultad(Facultad facultad1) {
        facultad.add(facultad1);
    }

}
