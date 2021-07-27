package dominio;

import java.util.ArrayList;

public class Profesor {

    private String nombProfesor;

    private ArrayList<Materia> materia = new ArrayList<>(); //relacion: un profesor tiene varias materias

    public void agregaMateria(Materia materia1) {
        materia.add(materia1);
    }
}
