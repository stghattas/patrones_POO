
package observer;

public class ObservadorLog implements Observador {
    public void actualizar(String evento) {
        System.out.println("LOG: " + evento);
    }
}
