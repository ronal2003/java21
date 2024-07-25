import Crontroller.proceso;

public class Main {
    public static void main(String[] args) {

        String nombre = "gabriel";
        String apellido = "james";
        String numeroDoc = "1233";
        String edad = "12";
        String localidad = "22";

        proceso proceso = new proceso(nombre,apellido,numeroDoc,edad,localidad);
    }
}