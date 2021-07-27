package dominio;

import java.util.ArrayList;

public class Materia {

    private String nombMateria;

    private Profesor profesor; // relacaion: una materia tiene un profesor
    private ArrayList<Estudiante> estudiante = new ArrayList<>(); //relacion: una materia tiene varios estudiantes

    public Materia(String nombMateria, Profesor profesor) {
        this.nombMateria = nombMateria;
        this.profesor = profesor;
    }

    public void agregaEstudiante(Estudiante carrera1) {
        estudiante.add(carrera1);
    }
}
