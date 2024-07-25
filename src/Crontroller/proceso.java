package Crontroller;

import Persona.usuario;

public class proceso {

    String nombre = "";
    String apellido = "";
    String numeroDoc = "";
    String edad = "";
    String localidad = "";

    public proceso(String nombre, String apellido, String numeroDoc, String edad, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDoc = numeroDoc;
        this.edad = edad;
        this.localidad = localidad;

        registarUsuario(nombre, apellido, numeroDoc, edad, localidad);
    }

    private void registarUsuario(String nombre, String apellido, String numeroDoc, String edad, String localidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;

        usuario usuario = new usuario(nombre,apellido,numeroDoc,edad,localidad);

        System.out.println("nombre " + usuario.getNombre() + "\n" +
        "apellido " + usuario.getApellido() + "\n" +
        "edad " + usuario.getEdad() + "\n" +
        "localidad " + usuario.getLocalidad());
    }
}
