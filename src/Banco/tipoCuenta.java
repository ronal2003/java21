package Banco;

public class tipoCuenta {

    private String tipoCuenta = "";
    private String nombreCuenta = "";
    private String serial = "";//ID de la cuenta
    private Double fondo = 0.0;

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Double getFondo() {
        return fondo;
    }

    public void setFondo(Double fondo) {
        this.fondo = fondo;
    }
}
