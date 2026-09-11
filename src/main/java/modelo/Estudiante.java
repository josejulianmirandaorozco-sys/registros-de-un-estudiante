package modelo;

public class Estudiante {
    private String carnet;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String carnet, String nombre, String apellido, int edad, String carrera) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Carnet: " + carnet
                + ", Nombre: " + nombre
                + ", Apellido: " + apellido
                + ", Edad: " + edad
                + ", Carrera: " + carrera;
    }
}