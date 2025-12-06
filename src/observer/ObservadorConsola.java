
package observer;

public class ObservadorConsola implements Observador {
    public void actualizar(String evento) {
        System.out.println("OBSERVADOR: Evento -> " + evento);
    }
}
