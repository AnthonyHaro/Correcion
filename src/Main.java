
public class Main {
    public static void main(String[] args) {
        Multijugador v1=new Multijugador("Call of duty:Warzone","Shooter","Battle royal","Online");
        Solo v2=new Solo("Prince of persia","RPG","Historia","Ofline");
        videojuegos[] juegos={v1,v2};
        for (videojuegos juego : juegos) {
            System.out.println("Nombre: " + juego.getNombre());
            if (juego instanceof Multijugador) {
                Multijugador multijugador = (Multijugador) juego;
                System.out.println("Genero: " + multijugador.getGenero());
                System.out.println("Tipo: " + multijugador.getTipo());
                System.out.println("Modalidad: " + multijugador.getModalidad());
            } else if (juego instanceof Solo) {
                Solo solo = (Solo) juego;
                System.out.println("Genero: " + solo.getGenero());
                System.out.println("Tipo: " + solo.getTipo());
                System.out.println("Modalidad: " + solo.getModalidad());
            }
            System.out.println("-----------");
        }
    }
}