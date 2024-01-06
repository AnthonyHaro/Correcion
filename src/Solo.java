public class Solo extends Genero{
    String modalidad;

    public Solo(String nombre, String genero, String tipo, String modalidad) {
        super(nombre, genero, tipo);
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
}
