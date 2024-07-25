package Persona;

public class usuario {

    private String nombre = "";
    private String apellido = "";
    private String numeroDoc = "";
    private String edad = "";
    private String localidad = "";

    public usuario(String nombre, String apellido, String numeroDoc, String edad, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDoc = numeroDoc;
        this.edad = edad;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
