
package Datos;


public class vCheckIn {
    
    private String nombre_cli;
    private String tel_cli;
    private String sexo_cli;
    private String correo_cli;
    private String fecha_llegada;

    private int num;
    private double cuenta;
    private String tipopago;

    public vCheckIn() {
    }

    public vCheckIn(String nombre_cli, String tel_cli, String sexo_cli, String correo_cli, String fecha_llegada, int num_camas, double cuenta, String tipopago) {
        this.nombre_cli = nombre_cli;
        this.tel_cli = tel_cli;
        this.sexo_cli = sexo_cli;
        this.correo_cli = correo_cli;
        this.fecha_llegada = fecha_llegada;
        this.num = num_camas;
        this.cuenta = cuenta;
        this.tipopago = tipopago;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getSexo_cli() {
        return sexo_cli;
    }

    public void setSexo_cli(String sexo_cli) {
        this.sexo_cli = sexo_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }
  
    
    
}
