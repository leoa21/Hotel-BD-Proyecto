
package Datos;


public class vDetalleEmpleado {
    
    private int id_emp;
    private String nombre_emp;
    private String correo_emp;
    private String tel_emp;  
    private int id_tipoempleado_e;
    private double sueldo;
    private String turno;
    private String sexo_emp;
    private String pais;
    private String estado;
    private String municipio;
    private String colonia;
    private String calle ;
    private int local_id_e; 

    public vDetalleEmpleado() {
    }

    public vDetalleEmpleado(int id_emp, String nombre_emp, String correo_emp, String tel_emp, int id_tipoempleado_e, double sueldo, String turno, String sexo_emp, String pais, String estado, String municipio, String colonia, String calle, int local_id_e) {
        this.id_emp = id_emp;
        this.nombre_emp = nombre_emp;
        this.correo_emp = correo_emp;
        this.tel_emp = tel_emp;
        this.id_tipoempleado_e = id_tipoempleado_e;
        this.sueldo = sueldo;
        this.turno = turno;
        this.sexo_emp = sexo_emp;
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.colonia = colonia;
        this.calle = calle;
        this.local_id_e = local_id_e;
    }

    public vDetalleEmpleado(int id_emp, String nombre_emp, String correo_emp, String tel_emp, int id_tipoempleado_e, double sueldo, String turno, String sexo_emp, String pais, String estado, String municipio, String colonia, String calle) {
        this.id_emp = id_emp;
        this.nombre_emp = nombre_emp;
        this.correo_emp = correo_emp;
        this.tel_emp = tel_emp;
        this.id_tipoempleado_e = id_tipoempleado_e;
        this.sueldo = sueldo;
        this.turno = turno;
        this.sexo_emp = sexo_emp;
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.colonia = colonia;
        this.calle = calle;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    public String getTel_emp() {
        return tel_emp;
    }

    public void setTel_emp(String tel_emp) {
        this.tel_emp = tel_emp;
    }

    public int getId_tipoempleado_e() {
        return id_tipoempleado_e;
    }

    public void setId_tipoempleado_e(int id_tipoempleado_e) {
        this.id_tipoempleado_e = id_tipoempleado_e;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSexo_emp() {
        return sexo_emp;
    }

    public void setSexo_emp(String sexo_emp) {
        this.sexo_emp = sexo_emp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getLocal_id_e() {
        return local_id_e;
    }

    public void setLocal_id_e(int local_id_e) {
        this.local_id_e = local_id_e;
    }

    
    
    
}


