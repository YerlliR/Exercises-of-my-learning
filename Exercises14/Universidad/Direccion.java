package Exercises13.Universidad;

class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;
    private String pais;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + codigoPostal + ", " + pais;
    }
}
















class Persona {
    private String nombre;
    private String apellidos;
    private String NIF;
    private Direccion direccion;

    public Persona(String nombre, String apellidos, String NIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
    }

    public Persona(String nombre, String apellidos, String NIF, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + NIF + ")" + ", Direccion: " + direccion;
    }
}














class Estudiante extends Persona {
    private int IDestudiante;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String NIF, int IDestudiante) {
        super(nombre, apellidos, NIF);
        this.IDestudiante = IDestudiante;
    }

    public int getIDestudiante() {
        return IDestudiante;
    }

    public void setIDestudiante(int IDestudiante) {
        this.IDestudiante = IDestudiante;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID Estudiante: " + IDestudiante;
    }
}

















class Profesor extends Persona {
    private String ndespacho;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellidos, String NIF, String ndespacho) {
        super(nombre, apellidos, NIF);
        this.ndespacho = ndespacho;
    }

    public String getNdespacho() {
        return ndespacho;
    }

    public void setNdespacho(String ndespacho) {
        this.ndespacho = ndespacho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de despacho: " + ndespacho;
    }
}