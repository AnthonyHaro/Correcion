public class Genero extends videojuegos{
    String genero;
    String tipo;

    public Genero(String nombre, String genero, String tipo) {
        super(nombre);
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
