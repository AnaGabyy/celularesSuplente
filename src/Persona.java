public class Persona {
    private String nombre;
    private String dni;
    private String genero;

    public Persona(String nombre, String dni, String genero) {
        this.nombre = nombre;
        this.dni = dni;
        this.genero = genero;
    }

    public void usaCelular(Celular celular) {
        System.out.println(celular);

    }
}