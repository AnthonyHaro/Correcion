public class Multijugador extends Genero{
    String Modalidad;

    public Multijugador(String nombre, String genero, String tipo, String modalidad) {
        super(nombre, genero, tipo);
        Modalidad = modalidad;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String modalidad) {
        Modalidad = modalidad;
    }
}
