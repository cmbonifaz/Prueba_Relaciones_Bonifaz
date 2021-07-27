package dominio;

import java.util.ArrayList;

public class Facultad {

    private String tipoDeFacultad;

    private Director director; //relacion de 1 a 1: una facultad tiene un director
    private ArrayList<Carrera> carrera = new ArrayList<>(); // relacion: una facultad tiene varias carreras
    private ArrayList<Profesor> profesor = new ArrayList<>(); // relacion: una facultad tiene varios profesores

    public Facultad(String tipoDeFacultad, Director director) {
        this.tipoDeFacultad = tipoDeFacultad;
        this.director = director;
    }

    public void agregaCarrera(Carrera carrera1) {
        carrera.add(carrera1);
    }

    public void agregaProfesor(Profesor profesor1) {
        profesor.add(profesor1);
    }
}
