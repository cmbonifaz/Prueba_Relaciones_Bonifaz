package dominio;

import java.util.ArrayList;

public class Estudiante {

    private String nombEstudiante;

    private ArrayList<Materia> materia = new ArrayList<>(); //relacion: un estudiante tiene varias materias

    public void agregaMateria(Materia materia1) {
        materia.add(materia1);
    }
}
